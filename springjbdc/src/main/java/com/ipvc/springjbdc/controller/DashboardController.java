package com.ipvc.springjbdc.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

public class DashboardController {

    @FXML
    public Button btnLogout;
    public Button btnStock;
    public Button btnMateriasPrimas;

    @FXML
    private Label teste;

    public void iniciar(String cargo) throws IOException{
        teste.setText(cargo);
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

    public void startStock(Stage stage) throws IOException{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/stock.fxml"));
        stage.setTitle("Stock");
        Scene scene = new Scene(root,800,500);
        stage.setScene(scene);
        stage.show();
    }

    public void startEncomenda(Stage stage) throws IOException{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/encomenda_fornecedor.fxml"));
        stage.setTitle("Encomendar");
        Scene scene = new Scene(root,800,500);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void encomendaForn(ActionEvent actionEvent) throws IOException{
        Stage stage = (Stage) btnMateriasPrimas.getScene().getWindow();
        stage.close();
        try{
            startEncomenda(stage);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    public void chkStock(ActionEvent actionEvent) throws IOException{
        Stage stage = (Stage) btnStock.getScene().getWindow();
        stage.close();
        try{
            startStock(stage);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
