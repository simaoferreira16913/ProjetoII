package com.ipvc.springjbdc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {


    public static void main(String[] args) {
        launch(args);

    }

    //começar a app com o login

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ui/login/login.fxml"));
        stage.setTitle("Login");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        //setTitleIcon.setIcon(stage);
        stage.getIcons().add(new Image("/img/logo.png"));
        stage.show();
    }


}
