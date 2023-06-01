package com.rplbo.madangskuy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminHomepageController {
    Parent root;
    Scene scene;
    Stage stage;

    @FXML
    VBox tampunganResto = new VBox();

    @FXML
    Pane mypane;

    @FXML
    Pane mypane2;



    @FXML
    public void tampilData() throws IOException {
        int no = 1;
        FXMLLoader loader2 = new FXMLLoader(getClass().getResource("object-title.fxml"));
        mypane2 = loader2.load();
        tampunganResto.getChildren().add(mypane2);

        for (TempatMakan tm:DBTempatMakan.getDBTempatMakan()) {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("objectTM.fxml"));
            mypane = loader.load();
            tampunganResto.getChildren().add(mypane);


            ObjectTMController objectTMController = loader.getController();
            objectTMController.showData(tm);
            objectTMController.addNum(Integer.toString(no));
            no++;
        }

    }
    @FXML
    public void toKategori(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("daftar-tempat-makan-admin.fxml"));
        root = loader.load();
        TKAdminController tkAdminController = loader.getController();
        tkAdminController.tampilData();


        scene = new Scene(getRoot());
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        getStage().setScene(getScene());
        getStage().show();
    }

    @FXML
    public void toTTM(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("tambah-tempat-makan.fxml"));
        root = loader.load();
        TambahTMController tambahTMController = loader.getController();

        scene = new Scene(getRoot());
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        getStage().setScene(getScene());
        getStage().show();
    }



    @FXML
    void logoutButton(ActionEvent event) throws IOException{
        Parent loginPage = FXMLLoader.load(getClass().getResource("login.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(loginPage));
        stage.show();

        ((Node)(event.getSource())).getScene().getWindow().hide();

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
