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

public class ObjectSearchingController {
    Parent root;
    Scene scene;
    Stage stage;
    @FXML
    private Label alamat;

    @FXML
    private Label deskripsi;

    @FXML
    private Label namaTempatMakan;

    @FXML
    private Label rating;

    @FXML
    private String noHP;

    @FXML
    private String kategori;

    @FXML
    TempatMakan tempatMakan;
    private int id;

    String key;

    String keyKategori;

    int code;

    @FXML
    public void showData(TempatMakan tm){
        this.id=tm.getId_tempat_makan();
        this.tempatMakan = tm;
        this.namaTempatMakan.setText(tm.getNama_tempat_makan());
        this.alamat.setText(tm.getAlamat());
        this.deskripsi.setText(tm.getDeskripsi());
        this.rating.setText(Double.toString(tm.getRating()));
        this.noHP = tm.getNoHP();
        this.kategori = tm.getKategori_tempat_makan();
    }

    @FXML
    public void klikPage(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("user-detail-page.fxml"));
        root = loader.load();
        UserDetailPageController userDetailPageController = loader.getController();
        userDetailPageController.kirimData(namaTempatMakan.getText(),alamat.getText(),noHP,rating.getText(),kategori,deskripsi.getText());
        userDetailPageController.setCode(code);
        userDetailPageController.setKey(key);
        userDetailPageController.setKeyKategori(keyKategori);


        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    public int getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getKeyKategori() {
        return keyKategori;
    }

    public void setKeyKategori(String keyKategori) {
        this.keyKategori = keyKategori;
    }
}
