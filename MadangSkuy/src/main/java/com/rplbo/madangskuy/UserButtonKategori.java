package com.rplbo.madangskuy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import javafx.scene.control.TextField;


import java.io.IOException;

public class UserButtonKategori {
    Parent root;
    Scene scene;
    Stage stage;

    public void backMainPage(ActionEvent event) throws IOException {
        Parent mainPage = FXMLLoader.load(getClass().getResource("user-home.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(mainPage));
        stage.show();
        ((Stage) ((Node) event.getSource()).getScene().getWindow()).close();
    }

    @FXML
    private TextField search;


    @FXML
    public void search(ActionEvent event) throws IOException {
        String keyword = search.getText().toLowerCase();
        if (keyword.equals("sate")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("searching.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }

    }
}
