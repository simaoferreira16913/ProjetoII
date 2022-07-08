package com.ipvc.springjbdc.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

public class DashboardController {

    @FXML
    public Button btnLogout;

    @FXML
    private Label teste;

    public void iniciar(String full_name) throws IOException{
        try{
            teste.setText(full_name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Logout(javafx.event.ActionEvent actionEvent) {
        Stage stage = (Stage) btnLogout.getScene().getWindow();
        stage.close();
        try{
            startLogin(stage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void startLogin(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/login.fxml"));
        stage.setTitle("Login");
        Scene scene = new Scene(root,800,500);
        stage.setScene(scene);
        stage.show();

    }

}
