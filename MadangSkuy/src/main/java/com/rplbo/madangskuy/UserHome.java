package com.rplbo.madangskuy;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class UserHome {
    Parent root;
    Scene scene;
    Stage stage;

    public void buttonkategori(ActionEvent event) throws IOException {
        Parent kategoriPage = FXMLLoader.load(getClass().getResource("user-ButtonKategori.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(kategoriPage));
        stage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }



}
