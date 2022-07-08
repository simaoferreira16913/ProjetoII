package com.ipvc.springjbdc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/login.fxml"));
            stage.setTitle("Login");
            Scene scene = new Scene(root,800,500);
            stage.setScene(scene);
            stage.show();

    }

}

/*

 */