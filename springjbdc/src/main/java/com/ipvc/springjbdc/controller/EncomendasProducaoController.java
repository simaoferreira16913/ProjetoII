package com.ipvc.springjbdc.controller;

import com.ipvc.springjbdc.entity.Cliente;
import com.ipvc.springjbdc.entity.Encomenda_Cliente;
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

public class EncomendasProducaoController implements Initializable {

    public Button btnVoltar;
    public TableView tblEnc;
    public TableColumn id;
    public TableColumn sSal;
    public TableColumn cSal;
    public TableColumn cAlho;
    public TableColumn cliente;

    ObservableList<Encomenda_Cliente> encList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            Connection conn = DBUTIL.getConnection();

            PreparedStatement pst = null;

            try {
                pst = conn.prepareStatement("SELECT e.id_encomenda_c,e.qt_tipo_sal,e.qt_tipo_sem,e.qt_tipo_alho,e.id_cliente, cliente.nome FROM ENCOMENDA_CLIENTE e INNER JOIN Cliente ON e.id_cliente = Cliente.id_cliente WHERE ESTADO = 'Pendente'");
                ResultSet rs = pst.executeQuery();
                while (rs.next()){
                    encList.add(new Encomenda_Cliente(
                            rs.getInt("id_encomenda_c"),
                            rs.getInt("qt_tipo_sal"),
                            rs.getInt("qt_tipo_sem"),
                            rs.getInt("qt_tipo_alho"),
                            rs.getString("nome")
                    ));
                    }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            id.setCellValueFactory(new PropertyValueFactory<>("id_encomenda_c"));
            sSal.setCellValueFactory(new PropertyValueFactory<>("qt_tipo_sal"));
            cSal.setCellValueFactory(new PropertyValueFactory<>("qt_tipo_sem"));
            cAlho.setCellValueFactory(new PropertyValueFactory<>("qt_tipo_alho"));
            cliente.setCellValueFactory(new PropertyValueFactory<>("nome"));

            tblEnc.setItems(encList);
            tblEnc.getSortOrder().add(id);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
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
