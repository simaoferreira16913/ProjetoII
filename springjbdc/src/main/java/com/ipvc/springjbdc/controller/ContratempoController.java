package com.ipvc.springjbdc.controller;

import com.ipvc.springjbdc.util.DBUTIL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class ContratempoController implements Initializable {

    @FXML
    public Label descricao;
    @FXML
    public ComboBox<String> cmbGravidade = new ComboBox<>();
    @FXML
    public Spinner<String> spnParagem;
    @FXML
    public Button btnRegCont;
    public TextArea txDesc;
    public TextField txTmp;
    public Button btnVoltar;

    private String[] grv = {"Baixo", "Medio", "Alto"};

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDateTime now = LocalDateTime.now();
    PreparedStatement pstmt = null;
    Connection con = null;
    ResultSet rs = null;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cmbGravidade.getItems().addAll(grv);
        cmbGravidade.setValue("Escolha a gravidade");
    }


    public void regCont(ActionEvent actionEvent) {
        String myGrav = cmbGravidade.getValue();


        try {
            con = DBUTIL.getConnection();
            PreparedStatement pst = null;
            try {
                pst = con.prepareStatement("INSERT INTO contratempos(descricao,gravidade,data,tempo_paragem) Values (?,?,?,?)");
                pst.setString(1,txDesc.getText());
                pst.setString(2,myGrav);
                pst.setString(3,dtf.format(now));
                pst.setInt(4,Integer.parseInt(txTmp.getText()));
                pst.executeQuery();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        new Alert(Alert.AlertType.INFORMATION, "Contratempo registado !").showAndWait();
    }

    public void startVoltar(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/producaoMenu.fxml"));
        stage.setTitle("Producao Menu");
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();
    }


    public void Voltar(ActionEvent actionEvent) {
        Stage stage = (Stage) btnVoltar.getScene().getWindow();
        stage.close();
        try{
            startVoltar(stage);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
