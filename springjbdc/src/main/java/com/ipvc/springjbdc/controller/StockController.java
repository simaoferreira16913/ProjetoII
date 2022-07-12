package com.ipvc.springjbdc.controller;

import com.ipvc.springjbdc.entity.Armazem;
import com.ipvc.springjbdc.util.DBUTIL;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.scene.control.TableColumn;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class StockController implements Initializable {
    public Pane stock;
    public TableView <Armazem> tablePlantacoes;

    public ObservableList<Armazem> oblist = FXCollections.observableArrayList();

    @FXML
    public TableColumn colIdArmazem;
    @FXML
    public TableColumn colLeite;
    @FXML
    public TableColumn colSal;
    @FXML
    public TableColumn colAlho;
    @FXML
    public TableColumn colEmb;

    public void iniciar(){
        System.out.println("Área de consulta de stock");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        try {
            Connection conn = DBUTIL.getConnection();

            PreparedStatement pst = null;

            try{
                pst = conn.prepareStatement("SELECT * FROM ARMAZEM");
                ResultSet rs = pst.executeQuery();

                while (rs.next()){
                    oblist.add(new Armazem(
                            rs.getInt("id_armazem"),
                            rs.getInt("qt_leite"),
                            rs.getInt("qt_sal"),
                            rs.getInt("qt_alho"),
                            rs.getInt("qt_embalagens")));
                }
            }catch (SQLException throwables){
                throwables.printStackTrace();
            }
            colIdArmazem.setCellValueFactory(new PropertyValueFactory<>("id_armazem"));
            colLeite.setCellValueFactory(new PropertyValueFactory<>("qt_leite"));
            colSal.setCellValueFactory(new PropertyValueFactory<>("qt_sal"));
            colAlho.setCellValueFactory(new PropertyValueFactory<>("qt_alho"));
            colEmb.setCellValueFactory(new PropertyValueFactory<>("qt_embalagens"));

            tablePlantacoes.setItems(oblist);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
