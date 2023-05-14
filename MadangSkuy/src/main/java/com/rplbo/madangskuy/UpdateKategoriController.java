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

    @FXML
    private TextField nama_kategori;

    @FXML
    private TextArea deskripsi;
}
