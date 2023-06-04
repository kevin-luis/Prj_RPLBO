package com.rplbo.madangskuy;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class KategoriPageController {
    @FXML
    private GridPane myGrid;

    @FXML
    Pane mypane;

    @FXML
    public void tampilData() throws IOException {
        int kolom = 0;
        int row = 1;
        for (KategoriTempatMakan ktm:DBKategoriTempatMakan.getDBKategoriTempatMakan()) {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("object-kategori-user.fxml"));
            mypane = loader.load();

            ObjectKategoriUserController objectKategoriUserController = loader.getController();
            objectKategoriUserController.showData(ktm);

            if (kolom == 4){
                kolom=0;
                ++row;
            }

            myGrid.add(mypane, kolom++,row);
            GridPane.setMargin(mypane, new Insets(10));
        }
    }

    Parent root;
    Scene scene;
    Stage stage;


    @FXML
    public void klikMadangSkuy(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("user-homepage.fxml"));
        root = loader.load();
        UserHomepageController userHomepageController = loader.getController();
        userHomepageController.tampilData();


        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }


}