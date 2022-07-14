package com.ipvc.springjbdc.controller;
import com.ipvc.springjbdc.entity.Fornecedor;
import com.ipvc.springjbdc.util.DBUTIL;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DadosFornecedorController implements Initializable {

    @FXML
    public ComboBox<String> cmbMp = new ComboBox<>();
    public Label nomeEmpresa;
    public Label moradaEmpresa;
    public Label emailEmpresa;
    public Label telemovelEmpresa;

    public ObservableList<Fornecedor> oblist = FXCollections.observableArrayList();
    public Button btnVoltar;

    private String[] mp = {"Leite","Alho","Sal","Embalagens"};


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cmbMp.getItems().addAll(mp);
        cmbMp.setValue("Escolha uma matéria prima");
        cmbMp.setOnAction(this::getMp);
    }

    public void getMp(ActionEvent event) {
        try {
            Connection conn = DBUTIL.getConnection();
            PreparedStatement pst = null;
            String myMp = cmbMp.getValue();

            if (myMp.equals("Leite")) {
                try {
                    ResultSet rs = null;
                    pst = conn.prepareStatement("SELECT * FROM FORNECEDOR WHERE ID_FORNECEDOR = 1");
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        rs.getInt("id_fornecedor");
                        nomeEmpresa.setText(rs.getString("nome"));
                        String cp = rs.getString("CP");
                        String morada = rs.getString("morada");
                        moradaEmpresa.setText(morada + " " + cp);
                        emailEmpresa.setText(rs.getString("email"));
                        telemovelEmpresa.setText(rs.getString("telemovel"));
                    }

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
                if (myMp.equals("Alho")) {
                    try {
                        ResultSet rs = null;
                        pst = conn.prepareStatement("SELECT * FROM FORNECEDOR WHERE ID_FORNECEDOR = 2");
                        rs = pst.executeQuery();
                        while (rs.next()) {
                            rs.getInt("id_fornecedor");
                            nomeEmpresa.setText(rs.getString("nome"));
                            String cp = rs.getString("CP");
                            String morada = rs.getString("morada");
                            moradaEmpresa.setText(morada + " " + cp);
                            emailEmpresa.setText(rs.getString("email"));
                            telemovelEmpresa.setText(rs.getString("telemovel"));
                        }

                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
                if (myMp.equals("Sal")) {
                    try {
                        ResultSet rs = null;
                        pst = conn.prepareStatement("SELECT * FROM FORNECEDOR WHERE ID_FORNECEDOR = 3");
                        rs = pst.executeQuery();
                        while (rs.next()) {
                            rs.getInt("id_fornecedor");
                            nomeEmpresa.setText(rs.getString("nome"));
                            String cp = rs.getString("CP");
                            String morada = rs.getString("morada");
                            moradaEmpresa.setText(morada + " " + cp);
                            emailEmpresa.setText(rs.getString("email"));
                            telemovelEmpresa.setText(rs.getString("telemovel"));
                        }

                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
                if (myMp.equals("Embalagens")) {
                    try {
                        ResultSet rs = null;
                        pst = conn.prepareStatement("SELECT * FROM FORNECEDOR WHERE ID_FORNECEDOR = 4");
                        rs = pst.executeQuery();
                        while (rs.next()) {
                            rs.getInt("id_fornecedor");
                            nomeEmpresa.setText(rs.getString("nome"));
                            String cp = rs.getString("CP");
                            String morada = rs.getString("morada");
                            moradaEmpresa.setText(morada + " " + cp);
                            emailEmpresa.setText(rs.getString("email"));
                            telemovelEmpresa.setText(rs.getString("telemovel"));
                        }

                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }

            }catch(SQLException e){
                e.printStackTrace();
            }
        }

    public void startVoltar(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/armazemMenu.fxml"));
        stage.setTitle("Armazem Menu");
        Scene scene = new Scene(root,500,500);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void voltar(ActionEvent actionEvent) {
        Stage stage = (Stage) btnVoltar.getScene().getWindow();
        stage.close();
        try{
            startVoltar(stage);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
