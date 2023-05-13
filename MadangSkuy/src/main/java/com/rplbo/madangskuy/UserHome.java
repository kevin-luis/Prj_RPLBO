package com.rplbo.madangskuy;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.control.TextField;


import java.io.IOException;

public class UserHome {
//    Parent root;
//    Scene scene;
//    Stage stage;

    @FXML
    public void buttonkategori(ActionEvent event) throws IOException {
        Parent kategoriPage = FXMLLoader.load(getClass().getResource("user-ButtonKategori.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(kategoriPage));
        stage.show();
        ((Stage) ((Node) event.getSource()).getScene().getWindow()).close();
    }
    @FXML
    private TextField searching;


    @FXML
    public void searching(ActionEvent event) throws IOException {
        String keyword = searching.getText().toLowerCase();
        if (keyword.equals("sate")) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("searching.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        }

    }
    public void klikSatepadang(MouseEvent event) throws IOException {
        Parent kategoriPage = FXMLLoader.load(getClass().getResource("detail-page.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(kategoriPage));
        stage.show();
        ((Stage) ((Node) event.getSource()).getScene().getWindow()).close();
    }
}
