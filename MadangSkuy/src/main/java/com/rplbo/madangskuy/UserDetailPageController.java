package com.rplbo.madangskuy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class UserDetailPageController {
    @FXML
    private Label alamat;

    @FXML
    private Label back;

    @FXML
    private Label deskripsi;

    @FXML
    private Button kategori;

    @FXML
    private Label namaTempatMakan;

    @FXML
    private Label noHP;

    @FXML
    private TextField pencarian;

    @FXML
    private Label rating;

    @FXML
    private Label kategoriTM;

    @FXML
    private VBox tampungan = new VBox();
    Pane mypane;
    Parent root;
    Scene scene;
    Stage stage;
    String key;
    String keyKategori;

    int code;

    public void kirimData(String nama, String alamat, String noHp, String rating, String kategori, String deskripsi){
        this.namaTempatMakan.setText(nama);
        this.alamat.setText(alamat);
        this.noHP.setText(noHp);
        this.rating.setText(rating);
        this.kategoriTM.setText(kategori);
        this.deskripsi.setText(deskripsi);
    }



    @FXML
    public void keKategori(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("kategori-page.fxml"));
        root = loader.load();
        KategoriPageController kategoriPageController = loader.getController();
        kategoriPageController.tampilData();


        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

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

    @FXML
    public void searching(ActionEvent event) throws IOException {
        String keyword = pencarian.getText().toLowerCase();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("user-search-page.fxml"));
        root = loader.load();

        UserSearchPageController userSearchPageController = loader.getController();
        userSearchPageController.key(keyword);
        userSearchPageController.tampilDataSearching();

        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();

    }

    @FXML
    public void klikBack(MouseEvent event) throws IOException {
        if(code==1){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("user-search-page.fxml"));
            root = loader.load();

            UserSearchPageController userSearchPageController = loader.getController();
            userSearchPageController.key(key);
            userSearchPageController.tampilDataSearching();

            scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(scene);
            stage.show();
        }
        if(code==2){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("kategori-detail-page.fxml"));
            root = loader.load();
            KategoriDetailPageController kategoriDetailPageController = loader.getController();
            kategoriDetailPageController.key(keyKategori);
            kategoriDetailPageController.tampilDataKategori();


            scene = new Scene(root);
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(scene);
            stage.show();
        }
        if (code==3){
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

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
        this.pencarian.setText(key);
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
    @FXML
    void keluar(ActionEvent event) throws IOException{
        Parent loginPage = FXMLLoader.load(getClass().getResource("login.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(loginPage));
        stage.show();

        ((Node)(event.getSource())).getScene().getWindow().hide();

    }

}
