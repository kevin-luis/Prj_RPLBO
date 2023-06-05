package com.rplbo.madangskuy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.*;

public class UserSearchPageController {
    @FXML
    VBox tampungan = new VBox();
    Pane mypane;
    Parent root;
    Scene scene;
    Stage stage;

    @FXML
    private Label jumlahPencarian;

    @FXML
    public Label keyPencarian;

    @FXML
    private TextField pencarian;

    int code = 1;


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


    public void tampilData() throws IOException {
        int counter = 0;
        for (int i = 0; i < tampungID.size(); i++) {
            if(counter <10){
                for (TempatMakan tm:DBTempatMakan.getDBTempatMakan()) {
                    if (tm.getId_tempat_makan() == (int) tampungID.get(i).get(0)){
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("object-searching.fxml"));
                        mypane = loader.load();
                        tampungan.getChildren().add(mypane);

                        ObjectSearchingController objectSearchingController = loader.getController();
                        objectSearchingController.setKey(pencarian.getText());
                        objectSearchingController.setCode(1);
                        objectSearchingController.showData(tm);

                        counter++;
                    }else {continue;}
                }
            }
        }
        this.jumlahPencarian.setText("Jumlah Pencarian : "+ counter);
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



    public Label getKeyPencarian() {
        return keyPencarian;
    }

    public void key(String key){
        this.keyPencarian.setText(key);
        this.pencarian.setText(key);
    }

    List<List<Object>> tampungID = new ArrayList<>();
    public void tampilDataSearching() throws IOException {
        String key = getKeyPencarian().getText().toLowerCase();
        for (TempatMakan tm:DBTempatMakan.getDBTempatMakan()) {
            if(tm.getNama_tempat_makan().toLowerCase().contains(key)){
                tampungID.add(List.of(tm.getId_tempat_makan(),tm.getRating()));
            }
        }
        //Ascending
        Collections.sort(tampungID, Comparator.comparingDouble(list -> (double) list.get(1)));
        //Descending komen code dibawah ini jika ingin desc
        Collections.reverse(tampungID);

        tampilData();
    }
    @FXML
    Button kategori;

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
    void keluar(ActionEvent event) throws IOException{
        Parent loginPage = FXMLLoader.load(getClass().getResource("login.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(loginPage));
        stage.show();

        ((Node)(event.getSource())).getScene().getWindow().hide();

    }
}