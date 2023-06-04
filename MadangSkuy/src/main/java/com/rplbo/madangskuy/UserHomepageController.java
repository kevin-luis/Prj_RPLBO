package com.rplbo.madangskuy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class UserHomepageController {
    @FXML
    HBox tampungan = new HBox();

    @FXML
    private GridPane myGrid;

    @FXML
    Pane mypane;

    public void tampilData() throws IOException {
        int kolom = 0;
        int row = 1;
        for (TempatMakan tm:DBTempatMakan.getDBTempatMakan()) {
            if (tm.getRating()>=4.5){
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("object-user-subpage.fxml"));
                mypane = loader.load();

                ObjectUserSubpageController objectUserSubpageController = loader.getController();
                objectUserSubpageController.showData(tm);

                if (kolom == 3){
                    kolom=0;
                    ++row;
                }

                myGrid.add(mypane, kolom++,row);
                GridPane.setMargin(mypane, new Insets(5));
            }

        }

        int counter = 0;
        for (TempatMakan tm:DBTempatMakan.getDBTempatMakan()) {
            if (counter >= 3){
                break;
            }

            FXMLLoader loader = new FXMLLoader(getClass().getResource("object-user-subpage.fxml"));
            mypane = loader.load();
            tampungan.getChildren().add(mypane);

            ObjectUserSubpageController objectUserSubpageController = loader.getController();
            objectUserSubpageController.showData(tm);

            counter++;

        }

    }


    Parent root;
    Scene scene;
    Stage stage;

    @FXML
    Button kategori;

    @FXML
    public void keKategori(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("kategori-page.fxml"));
        root = loader.load();
        KategoriPageController kategoriPageController = loader.getController();
        kategoriPageController.tampilData();


        scene = new Scene(getRoot());
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        getStage().setScene(getScene());
        getStage().show();
    }

    public Parent getRoot() {
        return root;
    }

    public Scene getScene() {
        return scene;
    }

    public Stage getStage() {
        return stage;
    }

}