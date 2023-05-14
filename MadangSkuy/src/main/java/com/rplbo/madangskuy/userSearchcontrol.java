package com.rplbo.madangskuy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
public class userSearchcontrol {

    Parent root;
    Scene scene;
    Stage stage;


    public void klikSatepadang(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("detail-page.fxml"));
        root = loader.load();


        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }
    public void backhome(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("user-home.fxml"));
        root = loader.load();


        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void kategori(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("searching-kategori-user.fxml"));
        root = loader.load();


        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }


}
