package com.rplbo.madangskuy;

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

public class UpdateTMController implements Initializable {
    private Parent root;
    private Scene scene;
    private Stage stage;
    @FXML
    public void toHome(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("admin-homepage.fxml"));
        root = loader.load();
        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        AdminHomepageController adminHomepageController = loader.getController();
        adminHomepageController.tampilData();

        stage.setScene(scene);
        stage.show();


    }

    @FXML
    private void updateData() {
        // kode Anda untuk menambahkan data

        // menampilkan pesan bahwa data berhasil ditambahkan
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Berhasil!");
        alert.setHeaderText("Tempat Makan berhasil diupdate.");
//        alert.setContentText("Terima kasih telah menambahkan data.");

        alert.showAndWait();
    }

    private int id;

    @FXML
    private TextField namaTempatMakan;

    @FXML
    private TextField alamat;

    @FXML
    private TextField noHp;

    @FXML
    private ComboBox<String> kategori;

    @FXML
    private TextField rating;

    @FXML
    private TextArea deskripsi;


    @FXML
    public void tampilData(int id,Label nama, Label alamat, Label nohp, Label kategori, Label rating, Label deskripsi){
        this.id=id;
        this.namaTempatMakan.setText(nama.getText());
        this.alamat.setText(alamat.getText());
        this.noHp.setText(nohp.getText());
        this.kategori.setValue(kategori.getText()) ;
        this.rating.setText(rating.getText());
        this.deskripsi.setText(deskripsi.getText());

    }

    @Override
    public void initialize(URL url, ResourceBundle rb){
        ObservableList<String> data = FXCollections.observableArrayList();
        for (KategoriTempatMakan ktm:DBKategoriTempatMakan.getDBKategoriTempatMakan()) {
            data.add(ktm.getNama_kategori());
        }
        kategori.setItems(data);
    }

    @FXML
    public void updateData(ActionEvent event){
        if (namaTempatMakan.getText().isEmpty() || alamat.getText().isEmpty() || noHp.getText().isEmpty() || rating.getText().isEmpty() || kategori.getValue().isEmpty()|| deskripsi.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Gagal!");
            alert.setHeaderText("Masukkan data yang valid!");
            alert.show();
        }else {
            for (TempatMakan tm : DBTempatMakan.getDBTempatMakan()) {
                if (tm.getId_tempat_makan() == id){
                    tm.setNama_tempat_makan(namaTempatMakan.getText());
                    tm.setAlamat(alamat.getText());
                    tm.setNoHP(noHp.getText());
                    tm.setKategori_tempat_makan(kategori.getValue());
                    tm.setRating(Double.parseDouble(rating.getText()));
                    tm.setDeskripsi(deskripsi.getText());
                    break;
                }


            }
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Berhasil!");
            alert.setHeaderText("Tempat Makan berhasil diubah.");
            alert.showAndWait().ifPresent(response -> {
                if (response == ButtonType.OK) {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("admin-homepage.fxml"));
                    try {
                        root = loader.load();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    AdminHomepageController adminHomepageController = loader.getController();
                    try {
                        adminHomepageController.tampilData();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root));
                    stage.setTitle("Admin MS");
                    stage.show();

                    ((Node)(event.getSource())).getScene().getWindow().hide();
                }
            });
        }
    }



}
