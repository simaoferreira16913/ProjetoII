package com.ipvc.springjbdc.controller;

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

public class FaturasFinancasController implements Initializable {
    public Button btnAtras;
    public TableView tblEnc;
    public TableColumn id;
    public TableColumn pagamento;
    public TableColumn data;
    public TableColumn valor;
    public TableColumn cliente;

    ObservableList<Fatura> fatList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            Connection conn = DBUTIL.getConnection();

            PreparedStatement pst = null;

            try {
                pst = conn.prepareStatement("SELECT f.id_fatura,f.metodo_pagamento,f.data_pagamento,f.valor_total,f.id_cliente,cliente.nome from fatura f INNER JOIN Cliente ON f.id_cliente = Cliente.id_cliente");
                ResultSet rs = pst.executeQuery();
                while (rs.next()){
                    fatList.add(new Fatura(
                            rs.getInt("id_fatura"),
                            rs.getString("metodo_pagamento"),
                            rs.getString("data_pagamento"),
                            rs.getFloat("valor_total"),
                            rs.getInt("id_cliente"),
                            rs.getString("nome")
                    ));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
            id.setCellValueFactory(new PropertyValueFactory<>("id_fatura"));
            pagamento.setCellValueFactory(new PropertyValueFactory<>("metodo_pagamento"));
            data.setCellValueFactory(new PropertyValueFactory<>("data_pagamento"));
            valor.setCellValueFactory(new PropertyValueFactory<>("valor_total"));
            cliente.setCellValueFactory(new PropertyValueFactory<>("nome"));

            tblEnc.setItems(fatList);
            tblEnc.getSortOrder().add(id);

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
        Stage stage = (Stage) btnAtras.getScene().getWindow();
        stage.close();
        try{
            startVoltar(stage);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
