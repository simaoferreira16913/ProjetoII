package com.ipvc.springjbdc.controller;

import com.ipvc.springjbdc.entity.Funcionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FinancasMenuController implements Initializable {

    public Button btnEncomendas;
    public static String cargo;
    public Button btnAtras;
    public Button btnLogout;
    public Button btnFaturacao;
    public Button btnLista;


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


    public void startEncomendas(Stage stage) throws IOException{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/encomendasFinancas.fxml"));
        stage.setTitle("Encomendas Concluidas");
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();
    }

    public void Encomendas(ActionEvent actionEvent) {
        Stage stage = (Stage) btnEncomendas.getScene().getWindow();
        stage.close();
        try{
            startEncomendas(stage);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void startFaturacao(Stage stage) throws IOException{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/faturasFinancas.fxml"));
        stage.setTitle("Faturação");
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();
    }

    public void Faturacao(ActionEvent actionEvent) {
        Stage stage = (Stage) btnFaturacao.getScene().getWindow();
        stage.close();
        try{
            startFaturacao(stage);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void startListaClientes(Stage stage) throws IOException{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/financasClientes.fxml"));
        stage.setTitle("Lista de Clientes");
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();
    }


    public void ListaClientes(ActionEvent actionEvent) {
        Stage stage = (Stage) btnLista.getScene().getWindow();
        stage.close();
        try{
            startListaClientes(stage);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void startVoltar(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/adminMenu.fxml"));
        stage.setTitle("Admin Menu");
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();
    }


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
