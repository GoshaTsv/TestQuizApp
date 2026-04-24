package com.example.testquizapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("appUI.fxml"));
        Image image = new Image(Objects.requireNonNull(HelloApplication.class.getResourceAsStream("appLogo.jpg")));
        Scene scene = new Scene(fxmlLoader.load(), 800, 700);
        stage.setTitle("TestQuiz");
        stage.setResizable(false);
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}