package com.ipvc.springjbdc.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ProducaoController {

    @FXML
    public Button btnContratempo;

    public void startContratempo(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/contratempo.fxml"));
        stage.setTitle("Contratempo");
        Scene scene = new Scene(root,800,500);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void contratempo(ActionEvent actionEvent) {
        Stage stage = (Stage) btnContratempo.getScene().getWindow();
        stage.close();
        try{
            startContratempo(stage);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
