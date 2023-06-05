package com.rplbo.madangskuy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ObjectKategoriUserController {
    @FXML
    Button namaKategori;

    @FXML
    KategoriTempatMakan kategoriTempatMakan;

    @FXML
    public void showData(KategoriTempatMakan ktm){
        this.kategoriTempatMakan = ktm;
        this.namaKategori.setText(ktm.getNama_kategori());
    }

    Parent root;
    Scene scene;
    Stage stage;


    @FXML
    public void klikKategori(ActionEvent event) throws IOException {
        String keyword = namaKategori.getText().toLowerCase();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("kategori-detail-page.fxml"));
        root = loader.load();
        KategoriDetailPageController kategoriDetailPageController = loader.getController();
        kategoriDetailPageController.key(keyword);
        kategoriDetailPageController.tampilDataKategori();


        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

}