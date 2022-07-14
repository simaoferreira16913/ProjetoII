package com.ipvc.springjbdc.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminMenuController {

    public Button btnArmazem;
    public Button btnProducao;
    public Button btnLogout;
    public Button btnFinancas;
    public Button btnRegistar;


    public void startArmazem(Stage stage) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/armazemMenu.fxml"));
        Parent root = loader.load();
        stage.setTitle("Armazem Menu");
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();
    }

    public void Armazem(ActionEvent actionEvent) {
        Stage stage = (Stage) btnArmazem.getScene().getWindow();
        stage.close();
        try{
            startArmazem(stage);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void startProducao(Stage stage) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/producaoMenu.fxml"));
        Parent root = loader.load();
        stage.setTitle("Armazem Menu");
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();
    }

    public void startProducao(ActionEvent actionEvent) {
        Stage stage = (Stage) btnProducao.getScene().getWindow();
        stage.close();
        try{
            startProducao(stage);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void startLogin(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/hello-view.fxml"));
        stage.setTitle("Login");
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();
    }

    public void Logout(ActionEvent actionEvent) {
        Stage stage = (Stage) btnLogout.getScene().getWindow();
        stage.close();
        try{
            startLogin(stage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void startFinancas(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/financasMenu.fxml"));
        stage.setTitle("Gestor Financeiro");
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();
    }

    public void Financas(ActionEvent actionEvent) {
        Stage stage = (Stage) btnFinancas.getScene().getWindow();
        stage.close();
        try{
            startFinancas(stage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void startRegistar(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/registarUser.fxml"));
        stage.setTitle("Registar Funcionário");
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();
    }


    public void Registar(ActionEvent actionEvent) {
        Stage stage = (Stage) btnRegistar.getScene().getWindow();
        stage.close();
        try{
            startRegistar(stage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
