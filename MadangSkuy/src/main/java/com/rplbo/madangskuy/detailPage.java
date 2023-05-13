package com.rplbo.madangskuy;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
public class detailPage {
    public void backhome(MouseEvent event) throws IOException {
        Parent kategoriPage = FXMLLoader.load(getClass().getResource("user-home.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(kategoriPage));
        stage.show();
        ((Stage) ((Node) event.getSource()).getScene().getWindow()).close();
    }
    public void backsearch(MouseEvent event) throws IOException {
        Parent kategoriPage = FXMLLoader.load(getClass().getResource("searching.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(kategoriPage));
        stage.show();
        ((Stage) ((Node) event.getSource()).getScene().getWindow()).close();
    }
}
