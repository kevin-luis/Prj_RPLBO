package com.rplbo.madangskuy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;

import java.io.IOException;

public class UpdateKategoriController {
    private Parent root;
    private Scene scene;
    private Stage stage;
    @FXML
    public void toHome(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("daftar-tempat-makan-admin.fxml"));
        root = loader.load();
        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        TKAdminController tkAdminController = loader.getController();
        tkAdminController.tampilData();

        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void updateData() {
        // kode Anda untuk menambahkan data

        // menampilkan pesan bahwa data berhasil ditambahkan
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Berhasil!");
        alert.setHeaderText("Kategori berhasil diupdate.");
//        alert.setContentText("Terima kasih telah menambahkan data.");

        alert.showAndWait();
    }
    private int id;
    @FXML
    private TextField nama_kategori;

    @FXML
    private TextArea deskripsi;
    @FXML
    public void tampilData(int id, Label nama, Label deskripsi){
        this.id=id;
        this.nama_kategori.setText(nama.getText());
        this.deskripsi.setText(deskripsi.getText());

    }
    @FXML
    public void updateData(ActionEvent event){
        if (nama_kategori.getText().isEmpty() || deskripsi.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Gagal!");
            alert.setHeaderText("Masukkan data yang valid!");
            alert.show();
        }else {
            for (KategoriTempatMakan ktm : DBKategoriTempatMakan.getDBKategoriTempatMakan()) {
                if (ktm.getId_kategori() == id){
                    ktm.setNama_kategori(nama_kategori.getText());
                    ktm.setDeskripsi(deskripsi.getText());
                    break;
                }


            }
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Berhasil!");
            alert.setHeaderText("Kategori berhasil diubah.");
            alert.showAndWait().ifPresent(response -> {
                if (response == ButtonType.OK) {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("daftar-tempat-makan-admin.fxml"));
                    try {
                        root = loader.load();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    TKAdminController tkAdminController = loader.getController();
                    try {
                        tkAdminController.tampilData();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root));
                    stage.setTitle("Admin MS");
                    stage.show();

                    ((Node)(event.getSource())).getScene().getWindow().hide();
                }
            });
        }
    }
}
