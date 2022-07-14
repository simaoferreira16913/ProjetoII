package com.ipvc.springjbdc.controller;

import java.io.IOException;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

import com.ipvc.springjbdc.entity.Funcionario;
import javafx.scene.Node;
import javafx.scene.control.Button;
import com.ipvc.springjbdc.util.DBUTIL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController  {

    @FXML
    public Button btnLogin;

    @FXML
    private TextField email;

    @FXML
    private TextField password;

    @FXML
    private Label lebel;

    PreparedStatement pstmt=null;
    Connection con=null;
    ResultSet rs=null;


    public void Login(ActionEvent event) throws SQLException, IOException, ParseException {
        try {
            con= DBUTIL.getConnection();
            con.createStatement();
            String sql = "select * from Funcionario where email=? and password=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,email.getText());
            pstmt.setString(2, password.getText());
            rs = pstmt.executeQuery();
            System.out.println(rs);
            if(rs.next()) {
                int idLog = rs.getInt("id_func");
                PreparedStatement pst2 = con.prepareStatement("SELECT cargo from Funcionario WHERE id_func = ?");
                pst2.setInt(1,idLog);
                ResultSet rs1 = pst2.executeQuery();

                if(rs1.next()){
                    System.out.println("Login Com Sucesso");
                    String role = rs1.getString("cargo");
                    Funcionario f = new Funcionario();
                    f.setCargo(role);

                    if (role.equals("Encarregado de Armazém")) {

                            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/armazemMenu.fxml"));
                            Parent root = loader.load();
                            Stage stage = new Stage();
                            stage.setTitle("Armazem Menu");
                            stage.setScene(new Scene(root));
                            stage.setResizable(false);
                            stage.show();
                            closeLogin(btnLogin);

                    }
                    if(role.equals("Encarregado de Producao")){
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/producaoMenu.fxml"));
                        Parent root = loader.load();
                        Stage stage = new Stage();
                        stage.setTitle("Encarregado de Producao");
                        stage.setScene(new Scene(root));
                        stage.setResizable(false);
                        stage.show();
                        closeLogin(btnLogin);
                    }
                    if (role.equals("Gestor Financeiro")){
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/financasMenu.fxml"));
                        Parent root = loader.load();
                        Stage stage = new Stage();
                        stage.setTitle("Gestor Financeiro");
                        stage.setScene(new Scene(root));
                        stage.setResizable(false);
                        stage.show();
                        closeLogin(btnLogin);
                    }
                    if (role.equals("admin")){
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/adminMenu.fxml"));
                        Parent root = loader.load();
                        Stage stage = new Stage();
                        stage.setTitle("Admin Menu");
                        stage.setScene(new Scene(root));
                        stage.setResizable(false);
                        stage.show();
                        closeLogin(btnLogin);

                    }
                }
            }else{
                lebel.setText("Email ou Password Incorretas!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void closeLogin(Button btn) {
        Stage stage = (Stage) btn.getScene().getWindow();
        stage.close();
    }

}