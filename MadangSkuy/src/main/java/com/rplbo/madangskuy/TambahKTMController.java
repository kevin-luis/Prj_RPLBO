package com.rplbo.madangskuy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class TambahKTMController {
    private Parent root;
    private Scene scene;
    private Stage stage;
    @FXML
    public void toHome(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("daftar-tempat-makan-admin.fxml"));
        root = loader.load();
        TKAdminController tkAdminController = loader.getController();
        tkAdminController.tampilData();

        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }


    @FXML
    private TextField namaKategori;

    @FXML
    private TextArea deskripsi;

    @FXML
    private void tambahData() {
        // kode Anda untuk menambahkan data
        if (namaKategori.getText().isEmpty() || deskripsi.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Gagal!");
            alert.setHeaderText("Masukkan data yang valid!");
            alert.show();
        } else {
            KategoriTempatMakan dataKTM = new KategoriTempatMakan(namaKategori.getText().toString(), deskripsi.getText().toString());
            DBKategoriTempatMakan.addKategoriTempatMakan(dataKTM);
            // menampilkan pesan bahwa data berhasil ditambahkan
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Berhasil!");
            alert.setHeaderText("Kategori berhasil ditambahkan.");

            alert.showAndWait();
            namaKategori.clear();
            deskripsi.clear();
        }
    }
}