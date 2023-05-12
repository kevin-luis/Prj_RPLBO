package com.rplbo.madangskuy;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

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
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }
}
