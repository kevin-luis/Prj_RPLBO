package com.rplbo.madangskuy;

import javafx.event.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class KategoriDetailPageController {
    Parent root;
    Scene scene;
    Stage stage;

    @FXML
    private Label jumlahPencarian;

    @FXML
    private Button kategori;

    @FXML
    private Label keyKategori;

    @FXML
    private TextField pencarian;

    int code=2;

    String keyCadangan;


    @FXML
    VBox tampungan = new VBox();
    Pane mypane;
    List<List<Object>> tampungID = new ArrayList<>();



    public void tampilData() throws IOException {
        int counter = 0;
        for (int i = 0; i < tampungID.size(); i++) {
            if(counter<10){
                for (TempatMakan tm:DBTempatMakan.getDBTempatMakan()) {
                    if (tm.getId_tempat_makan() == (int) tampungID.get(i).get(0)){
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("object-searching.fxml"));
                        mypane = loader.load();
                        tampungan.getChildren().add(mypane);

                        ObjectSearchingController objectSearchingController = loader.getController();
                        objectSearchingController.setKeyKategori(keyCadangan);
                        objectSearchingController.setCode(2);
                        objectSearchingController.showData(tm);

                        counter++;
                    }else {continue;}
                }
            }

        }
        this.jumlahPencarian.setText("Jumlah Pencarian : "+ counter);
    }


    public Label getKeyKategori() {
        return keyKategori;
    }

    public void key(String key){
        this.keyKategori.setText(key);
        this.pencarian.setText(key);
        this.setKeyCadangan(key);
    }

    @FXML
    public void tampilDataKategori() throws IOException {
        String key = getKeyKategori().getText().toLowerCase();
        for (TempatMakan tm:DBTempatMakan.getDBTempatMakan()) {
            if(tm.getKategori_tempat_makan().toLowerCase().equals(key)){
                tampungID.add(List.of(tm.getId_tempat_makan(),tm.getRating()));
            }
        }
        Collections.sort(tampungID, Comparator.comparingDouble(list -> (double) list.get(1)));
        Collections.reverse(tampungID);
        tampilData();
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
        userSearchPageController.key(pencarian.getText());
        userSearchPageController.tampilDataSearching();

        scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();

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

    public String getKeyCadangan() {
        return keyCadangan;
    }

    public void setKeyCadangan(String keyCadangan) {
        this.keyCadangan = keyCadangan;
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
