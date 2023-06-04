package com.rplbo.madangskuy;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ObjectKategoriUserController {
    @FXML
    Label namaKategori;

    @FXML
    KategoriTempatMakan kategoriTempatMakan;

    @FXML
    public void showData(KategoriTempatMakan ktm){
        this.kategoriTempatMakan = ktm;
        this.namaKategori.setText(ktm.getNama_kategori());
    }
}