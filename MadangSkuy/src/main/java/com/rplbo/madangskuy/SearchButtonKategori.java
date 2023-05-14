package com.rplbo.madangskuy;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class SearchButtonKategori {
    @FXML
    public void backsearch(MouseEvent event) throws IOException {
        Parent search = FXMLLoader.load(getClass().getResource("searchingButton.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(search));
        stage.show();
        ((Stage) ((Node) event.getSource()).getScene().getWindow()).close();
    }
}
