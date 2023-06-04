package com.rplbo.madangskuy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    Parent root;
    Scene scene;
    Stage stage;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Label status;
    @FXML
    private Button user;
    @FXML
    void buttonUser(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("user-homepage.fxml"));
        root = loader.load();
        UserHomepageController userHomepageController = loader.getController();
        userHomepageController.tampilData();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Madang SKuy");
        stage.show();

        ((Node)(event.getSource())).getScene().getWindow().hide();
    }



//    @FXML
//    Button login;
    @FXML
    void buttonLogin(ActionEvent event) throws IOException{

        if(username.getText().equals("") && password.getText().equals("")){
//            Parent AdminHomepage = FXMLLoader.load(getClass().getResource("admin-homepage.fxml"));
            FXMLLoader loader = new FXMLLoader(getClass().getResource("admin-homepage.fxml"));
            root = loader.load();
            AdminHomepageController adminHomepageController = loader.getController();
            adminHomepageController.tampilData();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Admin MS");
            stage.show();

            ((Node)(event.getSource())).getScene().getWindow().hide();

//            FXMLLoader loader = new FXMLLoader(getClass().getResource("admin-homepage.fxml"));
//            root = loader.load();
//            AdminHomepageController adminHomepageController = loader.getController();
//            adminHomepageController.tampilData();
//
//            scene = new Scene(root);
//            stage = (Stage) ((Node) event.getSource()).getScene().getWindow().hi;
//
//            stage.setScene(scene);
//            stage.show();
        }
        else{
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
//            root = loader.load();
//
//
//            scene = new Scene(root);
//            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//
//            stage.setScene(scene);
//            stage.show();
            status.setText("Invalid Username or Password!");
        }

//        if (valid){
//            Parent AdminHomepage = FXMLLoader.load(getClass().getResource("admin-homepage.fxml"));
//            Stage stage = new Stage();
//            stage.setScene(new Scene(AdminHomepage));
//            stage.show();
//
//            ((Node)(event.getSource())).getScene().getWindow().hide();
//        }
    }
}
