package com.ipvc.springjbdc.controller;

import com.ipvc.springjbdc.entity.Cliente;
import com.ipvc.springjbdc.entity.Fatura;
import com.ipvc.springjbdc.util.DBUTIL;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class FinancasClientesController implements Initializable {

    public Button btnVoltar;
    public TableView tblCli;
    public TableColumn telemovel;
    public TableColumn id;
    public TableColumn nome;
    public TableColumn nif;
    public TableColumn email;
    ObservableList<Cliente> cliList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            Connection conn = DBUTIL.getConnection();

            PreparedStatement pst = null;

            try {
                pst = conn.prepareStatement("SELECT * FROM CLIENTE");
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    cliList.add(new Cliente(
                            rs.getInt("id_cliente"),
                            rs.getString("nome"),
                            rs.getInt("nif"),
                            rs.getString("email"),
                            rs.getString("telemovel")
                    ));
                }

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            id.setCellValueFactory(new PropertyValueFactory<>("id_cliente"));
            nome.setCellValueFactory(new PropertyValueFactory<>("nome"));
            nif.setCellValueFactory(new PropertyValueFactory<>("nif"));
            email.setCellValueFactory(new PropertyValueFactory<>("email"));
            telemovel.setCellValueFactory(new PropertyValueFactory<>("telemovel"));

            tblCli.setItems(cliList);
            tblCli.getSortOrder().add(id);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void startVoltar(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/financasMenu.fxml"));
        stage.setTitle("Gestor Financeiro");
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
