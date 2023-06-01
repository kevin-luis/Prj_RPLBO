package com.rplbo.madangskuy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
import java.util.concurrent.atomic.AtomicReference;

public class ObjectKategoriController {
    @FXML
    Label no;
    @FXML
    Label namaKategori;
    @FXML
    Label deskripsi;

    private int id;


    KategoriTempatMakan kategoriTempatMakan;
    Parent root;
    Scene scene;
    Stage stage;

    public void addNum(String num){
        this.no.setText(num);
    }


    @FXML
    public void showData(KategoriTempatMakan ktm){
        this.id = ktm.getId_kategori();
        this.kategoriTempatMakan=ktm;
        this.namaKategori.setText(ktm.getNama_kategori());
        this.deskripsi.setText(ktm.getDeskripsi());
    }

    @FXML
    private Button hapusButton;

    @FXML
    private void deleteItem(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Konfirmasi Hapus");
        alert.setHeaderText("Hapus "+kategoriTempatMakan.getNama_kategori()+"?");
        alert.setContentText("Anda yakin ingin menghapus kategori ini?");

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
                FXMLLoader loader = new FXMLLoader(getClass().getResource("daftar-tempat-makan-admin.fxml"));
                try {
                    root = loader.load();
                    TKAdminController tkAdminController = loader.getController();
                    tkAdminController.tampilData();

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
        int idHapus = kategoriTempatMakan.getId_kategori();
        String namaHapus = kategoriTempatMakan.getNama_kategori();
        for (KategoriTempatMakan ktm : DBKategoriTempatMakan.getDBKategoriTempatMakan()) {
            if (ktm.getId_kategori()== idHapus) {
                DBKategoriTempatMakan.getDBKategoriTempatMakan().remove(ktm);
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

    @FXML
    public void toUpdate(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("update-kategori.fxml"));
        root = loader.load();

        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        UpdateKategoriController updateKategoriController = loader.getController();
        updateKategoriController.tampilData(id,namaKategori,deskripsi);

        stage.setScene(scene);
        stage.show();
    }
}