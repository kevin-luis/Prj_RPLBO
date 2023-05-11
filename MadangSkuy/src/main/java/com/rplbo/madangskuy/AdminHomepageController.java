package com.rplbo.madangskuy;

import javafx.event.ActionEvent;
import javafx.event.EventTarget;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
        DTMAdminController dtmAdminController = loader.getController();

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
}
