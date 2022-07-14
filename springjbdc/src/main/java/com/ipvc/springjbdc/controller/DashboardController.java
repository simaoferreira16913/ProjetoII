package com.ipvc.springjbdc.controller;

import com.ipvc.springjbdc.entity.Funcionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class DashboardController implements Initializable{

    @FXML
    public Button btnLogout;
    public Button btnStock;
    public Button btnMateriasPrimas;
    @FXML
    public Button btnAtras;
    public Button btnFornecedor;
    public Label welcome;
    public static String cargo;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cargo = Funcionario.cargo;
        if (cargo.equals("admin")) {
            btnAtras.setVisible(true);
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
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/hello-view.fxml"));
        stage.setTitle("Login");
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();
    }

    public void startStock(Stage stage) throws IOException{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/stockMP.fxml"));
        stage.setTitle("Stock");
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();
    }

    public void startEncomenda(Stage stage) throws IOException{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/encomendaFornecedor.fxml"));
        stage.setTitle("Encomendar");
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();
    }

    public void startFornecedor(Stage stage) throws IOException{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/dadosFornecedor.fxml"));
        stage.setTitle("Lista de Fornecedores");
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();
    }

    public void startVoltar(Stage stage) throws IOException{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/adminMenu.fxml"));
        stage.setTitle("Admin Menu");
        Scene scene = new Scene(root,500,500);
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

    @FXML
    public void fornecedores(ActionEvent actionEvent) {
        Stage stage = (Stage) btnFornecedor.getScene().getWindow();
        stage.close();
        try{
            startFornecedor(stage);
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    @FXML
    public void Voltar(ActionEvent actionEvent) {
        Stage stage = (Stage) btnAtras.getScene().getWindow();
        stage.close();
        try{
            startVoltar(stage);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
