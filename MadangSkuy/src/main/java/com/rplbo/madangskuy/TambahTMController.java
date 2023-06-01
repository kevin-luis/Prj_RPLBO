package com.rplbo.madangskuy;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TambahTMController implements Initializable {
    private Parent root;
    private Scene scene;
    private Stage stage;
    @FXML
    public void toHome(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("admin-homepage.fxml"));
        root = loader.load();
        AdminHomepageController adminHomepageController = loader.getController();
        adminHomepageController.tampilData();

        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private TextField namaTempatMakan;

    @FXML
    private TextField alamat;

    @FXML
    private TextField noHp;

//    @FXML
//    private MenuButton kategori;

    @FXML
    private ComboBox<String> kategori;


    @FXML
    private TextField rating;

    @FXML
    private TextArea deskripsi;

    @FXML
    private void tambahData() {
        // kode Anda untuk menambahkan data
        if (namaTempatMakan.getText().isEmpty() || alamat.getText().isEmpty() || noHp.getText().isEmpty() || rating.getText().isEmpty() || kategori.getValue().isEmpty()|| deskripsi.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Gagal!");
            alert.setHeaderText("Masukkan data yang valid!");
            alert.show();
        }else {
            TempatMakan dataTM = new TempatMakan(namaTempatMakan.getText().toString(),alamat.getText().toString(),noHp.getText().toString(),Double.parseDouble(rating.getText()),kategori.getValue().toString(),deskripsi.getText().toString());
            DBTempatMakan.addTempatMakan(dataTM);
            // menampilkan pesan bahwa data berhasil ditambahkan
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Berhasil!");
            alert.setHeaderText("Tempat Makan berhasil ditambahkan.");
//            for (TempatMakan t:DBTempatMakan.getDBTempatMakan()) {
//                System.out.println(t.getNama_tempat_makan());
//            }
//        alert.setContentText("Terima kasih telah menambahkan data.");

            alert.showAndWait();
            namaTempatMakan.clear();
            alamat.clear();
            noHp.clear();
            kategori.getSelectionModel().clearSelection();
            deskripsi.clear();
            rating.clear();
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb){
        ObservableList<String> data = FXCollections.observableArrayList();
        for (KategoriTempatMakan ktm:DBKategoriTempatMakan.getDBKategoriTempatMakan()) {
            data.add(ktm.getNama_kategori());
        }
        kategori.setItems(data);
    }

//    @FXML
//    public void Insialisasi(){
//        ObservableList<String> data = FXCollections.observableArrayList();
//        for (KategoriTempatMakan ktm:DBKategoriTempatMakan.getDBKategoriTempatMakan()) {
//            data.add(ktm.getNama_kategori());
//        }
//        kategori.setItems(data);
//    }

}
