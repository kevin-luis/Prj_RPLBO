package com.rplbo.madangskuy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class TambahTMController {
    private Parent root;
    private Scene scene;
    private Stage stage;
    @FXML
    public void toHome(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("admin-homepage.fxml"));
        root = loader.load();
        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void tambahData() {
        // kode Anda untuk menambahkan data

        // menampilkan pesan bahwa data berhasil ditambahkan
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Berhasil!");
        alert.setHeaderText("Data berhasil ditambahkan.");
//        alert.setContentText("Terima kasih telah menambahkan data.");

        alert.showAndWait();
    }

    @FXML
    private TextField namaTempatMakan;

    @FXML
    private TextField alamat;

    @FXML
    private TextField noHp;

    @FXML
    private MenuButton kategori;

    @FXML
    private TextField rating;

    @FXML
    private TextArea deskripsi;

}
