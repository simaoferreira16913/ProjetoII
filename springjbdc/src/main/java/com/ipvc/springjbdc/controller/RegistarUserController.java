package com.ipvc.springjbdc.controller;

import com.ipvc.springjbdc.util.DBUTIL;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class RegistarUserController implements Initializable {

    public Button btnAtras;
    public TextField txEmail;
    public TextField txPassword;
    public ComboBox<String> cmbCargo = new ComboBox<>();
    public Button btnRegistar;
    public String [] myCargos = {"Gestor Financeiro","Encarregado de Armazém","Encarregado de Producao"};


    Connection con = null;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
            cmbCargo.getItems().addAll(myCargos);
    }


    public void Registar(ActionEvent actionEvent) {

        String chosenCargo = cmbCargo.getValue();

        try {
            con = DBUTIL.getConnection();
            PreparedStatement pst = null;

            try {
                pst = con.prepareStatement("INSERT INTO FUNCIONARIO(email,password,cargo) VALUES(?,?,?)");
                pst.setString(1,txEmail.getText());
                pst.setString(2,txPassword.getText());
                pst.setString(3,chosenCargo);
                pst.executeQuery();


            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        new Alert(Alert.AlertType.INFORMATION, "Funcionário registado !").showAndWait();
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
