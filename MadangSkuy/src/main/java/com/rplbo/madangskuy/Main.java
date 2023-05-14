package com.rplbo.madangskuy;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 295, 300);
        primaryStage.setTitle("Admin MS");
        primaryStage.setScene(scene);
        primaryStage.show();

//        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("user-home.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
//        primaryStage.setTitle("User MS");
//        primaryStage.setScene(scene);
//        primaryStage.show();

    }
}
