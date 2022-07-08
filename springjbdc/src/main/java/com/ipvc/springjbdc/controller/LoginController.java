package com.ipvc.springjbdc.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
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
            String sql = "select * from Users where email=? and password=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,email.getText());
            pstmt.setString(2, password.getText());
            rs = pstmt.executeQuery();
            System.out.println(rs);
            if(rs.next()) {
                int idLog = rs.getInt("id");
                PreparedStatement pst2 = con.prepareStatement("SELECT full_name from Users WHERE id = ?");
                pst2.setInt(1,idLog);

                ResultSet rs1 = pst2.executeQuery();

                if(rs1.next()){
                    System.out.println("Login Com Sucesso");

                    String nomeFunc = rs1.getString("full_name");
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/dashboard.fxml"));
                    Parent root = loader.load();
                    Stage stage = new Stage();
                    stage.setTitle("Dashboard");
                    stage.setScene(new Scene(root));
                    stage.setResizable(false);
                    stage.show();
                    DashboardController dashboard = loader.getController();
                    dashboard.iniciar(nomeFunc);
                    closeLogin(btnLogin);
                }
            }else{
                lebel.setText("Login Not Sucessfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void closeLogin(Button btn) throws FileNotFoundException, ParseException
    {
        Stage stage = (Stage) btn.getScene().getWindow();
        stage.close();
    }

}