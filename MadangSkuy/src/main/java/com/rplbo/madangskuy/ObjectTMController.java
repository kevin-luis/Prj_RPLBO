package com.rplbo.madangskuy;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.atomic.AtomicReference;

public class ObjectTMController {
    @FXML
    Label no;
    @FXML
    Label namaTempatMakan;
    @FXML
    Label alamat;
    @FXML
    Label noHP;
    @FXML
    Label rating;
    @FXML
    Label kategori;
    @FXML
    Label deskripsi;

    private int id;


    TempatMakan tempatMakan;
    Parent root;
    Scene scene;
    Stage stage;

    @FXML
    public void showData(TempatMakan tm){
        this.id = tm.getId_tempat_makan();
        this.tempatMakan=tm;
        this.namaTempatMakan.setText(tm.getNama_tempat_makan());
        this.alamat.setText(tm.getAlamat());
        this.noHP.setText(tm.getNoHP());
        this.rating.setText(Double.toString(tm.getRating()));
        this.kategori.setText(tm.getKategori_tempat_makan());
        this.deskripsi.setText(tm.getDeskripsi());
    }

//    @FXML
//    public Button getDelete() {
//        return delete;
//    }
//
//    @FXML
//    public Button getEdit() {
//        return edit;
//    }

    public void addNum(String num){
        this.no.setText(num);
    }

    @FXML
    public void toUpdate(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("update-tempat-makan.fxml"));
        root = loader.load();

        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        UpdateTMController updateTMController = loader.getController();
        updateTMController.tampilData(id,namaTempatMakan,alamat,noHP,kategori,rating,deskripsi);


        stage.setScene(scene);
        stage.show();
    }


    @FXML
    private Button hapusButton;

    @FXML
    private void deleteItem(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Konfirmasi Hapus");
        alert.setHeaderText("Hapus "+tempatMakan.getNama_tempat_makan()+"?");
        alert.setContentText("Anda yakin ingin menghapus item ini?");

        // Mengatur owner agar dialog terikat pada jendela induk
        AtomicReference<Stage> stage = new AtomicReference<>((Stage) hapusButton.getScene().getWindow());
        alert.initOwner(stage.get());
        // Mengatur modality sehingga dialog harus ditutup sebelum dapat berinteraksi dengan jendela lainnya
        alert.initModality(Modality.WINDOW_MODAL);

        // Menambahkan tombol-tombol OK dan Batal ke dalam dialog
        alert.getButtonTypes().setAll(ButtonType.OK, ButtonType.CANCEL);

        // Menunggu hasil dari dialog
        alert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
                // Aksi yang ingin Anda lakukan jika item dihapus
                deleteSelectedItem();
//                refreshPage();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("admin-homepage.fxml"));
                try {
                    root = loader.load();
                    AdminHomepageController adminHomepageController = loader.getController();
                    adminHomepageController.tampilData();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                scene = new Scene(root);
                stage.set((Stage) ((Node) event.getSource()).getScene().getWindow());

                stage.get().setScene(scene);
                stage.get().show();
            }
        });
    }

    @FXML
    private void deleteSelectedItem(){
        int idHapus = tempatMakan.getId_tempat_makan();
        String namaHapus = tempatMakan.getNama_tempat_makan();
        for (TempatMakan tm : DBTempatMakan.getDBTempatMakan()) {
            if (tm.getId_tempat_makan() == idHapus) {
                DBTempatMakan.getDBTempatMakan().remove(tm);
                break;
            }

        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        AtomicReference<Stage> stage = new AtomicReference<>((Stage) hapusButton.getScene().getWindow());
        alert.initOwner(stage.get());
        alert.initModality(Modality.WINDOW_MODAL);
        alert.setTitle("Berhasil!");
        alert.setHeaderText(namaHapus + " berhasil dihapus");
        alert.showAndWait();
    }

    private void refreshPage() {
        Stage stage = (Stage) hapusButton.getScene().getWindow();
        stage.show();
    }

    public Label getNamaTempatMakan() {
        return namaTempatMakan;
    }


}
