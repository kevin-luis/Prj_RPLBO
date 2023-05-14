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
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class TKAdminController {
    Parent root;
    Stage stage;
    Scene scene;

    @FXML
    private Button hapusButton;


    @FXML
    public void toTK(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tambah-kategori.fxml"));
        root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void backToKategori (ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("daftar-tempat-makan-admin.fxml"));
        root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void tambahData() {
        // kode Anda untuk menambahkan data

        // menampilkan pesan bahwa data berhasil ditambahkan
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Berhasil!");
        alert.setHeaderText("Kategori berhasil ditambahkan.");
//        alert.setContentText("Terima kasih telah menambahkan data.");

        alert.showAndWait();
    }

    @FXML
    public void toTTM(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("admin-homepage.fxml"));
        root = loader.load();
        AdminHomepageController adminHomepageController =  loader.getController();

        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void logoutButton(ActionEvent event) throws IOException{
        Parent loginPage = FXMLLoader.load(getClass().getResource("login.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(loginPage));
        stage.show();

        ((Node)(event.getSource())).getScene().getWindow().hide();

    }

    @FXML
    private void deleteItem() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Konfirmasi Hapus");
        alert.setHeaderText("Hapus Sate?");
        alert.setContentText("Anda yakin ingin menghapus Kategori ini?");

        Stage stage = (Stage) hapusButton.getScene().getWindow();
        alert.initOwner(stage);
        alert.initModality(Modality.WINDOW_MODAL);

        alert.getButtonTypes().setAll(ButtonType.OK, ButtonType.CANCEL);

        alert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
                deleteSelectedItem();
            }
        });
    }
    private void deleteSelectedItem() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Berhasil!");
        alert.setHeaderText("Kategori berhasil dihapus");
//        alert.setContentText("Terima kasih telah menambahkan data.");

        alert.showAndWait();
    }

    @FXML
    public void toUpdate(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("update-kategori.fxml"));
        root = loader.load();

        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }


}
