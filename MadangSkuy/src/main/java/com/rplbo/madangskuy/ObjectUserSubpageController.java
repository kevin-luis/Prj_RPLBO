package com.rplbo.madangskuy;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class ObjectUserSubpageController {
    @FXML
    Label namaTempatMakan;
    @FXML
    Label alamat;
    @FXML
    Label rating;

    @FXML
    String noHP;
    @FXML
    String kategori;
    @FXML
    String deskripsi;

    private int id;


    TempatMakan tempatMakan;
    @FXML
    public void showData(TempatMakan tm){
        this.id = tm.getId_tempat_makan();
        this.tempatMakan=tm;
        this.namaTempatMakan.setText(tm.getNama_tempat_makan());
        this.alamat.setText(tm.getAlamat());
        this.noHP = tm.getNoHP();
        this.rating.setText(Double.toString(tm.getRating()));
        this.kategori = tm.getKategori_tempat_makan();
        this.deskripsi = tm.getDeskripsi();
    }

    Parent root;
    Scene scene;
    Stage stage;

    @FXML
    public void klikPage(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("user-detail-page.fxml"));
        root = loader.load();
        UserDetailPageController userDetailPageController = loader.getController();
        userDetailPageController.kirimData(namaTempatMakan.getText(),alamat.getText(),noHP,rating.getText(),kategori,deskripsi);
        userDetailPageController.setCode(3);


        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

}