package com.ipvc.springjbdc.controller;

import com.ipvc.springjbdc.entity.Funcionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ProducaoController implements Initializable {

    @FXML
    public Button btnAtras;
    public Button btnQtdMaterial;
    public Button btnRegContr;
    public static String cargo;
    public Button btnEncomendas;
    public Button btnLogout;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cargo = Funcionario.cargo;
        if (cargo.equals("admin")) {
            btnAtras.setVisible(true);
        }

    }



    public void startQtdMaterial(Stage stage) throws IOException{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/indicacaoMP.fxml"));
        stage.setTitle("Indicação de Matéria Prima");
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void QtdMaterial(ActionEvent actionEvent) {
        Stage stage = (Stage) btnQtdMaterial.getScene().getWindow();
        stage.close();
        try{
            startQtdMaterial(stage);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void startregContr(Stage stage) throws IOException{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/contratempoProducao.fxml"));
        stage.setTitle("Contratempos");
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    public void regContr(ActionEvent actionEvent) {
        Stage stage = (Stage) btnRegContr.getScene().getWindow();
        stage.close();
        try{
            startregContr(stage);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void startVoltar(Stage stage) throws IOException{
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

    public void startEncomendas(Stage stage) throws IOException{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/encomendasProducao.fxml"));
        stage.setTitle("Admin Menu");
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
}
