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

public class AdminHomepageController {
    Parent root;
    Scene scene;
    Stage stage;

    @FXML
    void logoutButton(ActionEvent event) throws IOException{
        Parent loginPage = FXMLLoader.load(getClass().getResource("login.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(loginPage));
        stage.show();

        ((Node)(event.getSource())).getScene().getWindow().hide();

    }
    @FXML
    public void toKategori(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("daftar-tempat-makan-admin.fxml"));
        root = loader.load();
        TKAdminController tkAdminController = loader.getController();


        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toTTM(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tambah-tempat-makan.fxml"));
        root = loader.load();
        TambahTMController tambahTMController = loader.getController();

        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void toUpdate(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("update-tempat-makan.fxml"));
        root = loader.load();

        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }


    @FXML
    private Button hapusButton;

    @FXML
    private void deleteItem() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Konfirmasi Hapus");
        alert.setHeaderText("Hapus Bakso Mas Bob?");
        alert.setContentText("Anda yakin ingin menghapus item ini?");

        // Mengatur owner agar dialog terikat pada jendela induk
        Stage stage = (Stage) hapusButton.getScene().getWindow();
        alert.initOwner(stage);
        // Mengatur modality sehingga dialog harus ditutup sebelum dapat berinteraksi dengan jendela lainnya
        alert.initModality(Modality.WINDOW_MODAL);

        // Menambahkan tombol-tombol OK dan Batal ke dalam dialog
        alert.getButtonTypes().setAll(ButtonType.OK, ButtonType.CANCEL);

        // Menunggu hasil dari dialog
        alert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
                // Aksi yang ingin Anda lakukan jika item dihapus
                deleteSelectedItem();
            }
        });
    }

    private void deleteSelectedItem() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Berhasil!");
        alert.setHeaderText("Tempat Makan berhasil dihapus");

        alert.showAndWait();
    }
}
