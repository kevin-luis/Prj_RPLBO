package com.rplbo.madangskuy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DTMAdminController {
    Parent root;
    Scene scene;
    Stage stage;

    @FXML
    public void toTM(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("admin-homepage.fxml"));
        root = loader.load();
        AdminHomepageController adminHomepageController = loader.getController();

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
}
