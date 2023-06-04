package com.rplbo.madangskuy;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ObjectUserSubpageController {
    @FXML
    Label namaTempatMakan;
    @FXML
    Label alamat;
    @FXML
    Label rating;

    @FXML
//    Label no;
//    @FXML
//    Label noHP;
//    @FXML
//    Label kategori;
//    @FXML
//    Label deskripsi;

    private int id;


    TempatMakan tempatMakan;
    @FXML
    public void showData(TempatMakan tm){
        this.id = tm.getId_tempat_makan();
        this.tempatMakan=tm;
        this.namaTempatMakan.setText(tm.getNama_tempat_makan());
        this.alamat.setText(tm.getAlamat());
//        this.noHP.setText(tm.getNoHP());
        this.rating.setText(Double.toString(tm.getRating()));
//        this.kategori.setText(tm.getKategori_tempat_makan());
//        this.deskripsi.setText(tm.getDeskripsi());
    }

}