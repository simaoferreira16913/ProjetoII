package com.ipvc.springjbdc.controller;

import com.ipvc.springjbdc.util.DBUTIL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class StockController implements Initializable {

    @FXML
    public Button btnVoltar;
    public Label lblLeite;
    public Label lblSal;
    public Label lblAlho;
    public Label lblEmb;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        try {
            Connection conn = DBUTIL.getConnection();

            PreparedStatement pst = null;

            try{
                pst = conn.prepareStatement("SELECT * FROM ARMAZEM");
                ResultSet rs = pst.executeQuery();
                while (rs.next()){
                    rs.getInt("id_armazem");
                    lblLeite.setText(String.valueOf(rs.getInt("qt_leite")));
                    lblAlho.setText(String.valueOf(rs.getInt("qt_alho")));
                    lblSal.setText(String.valueOf(rs.getInt("qt_sal")));
                    lblEmb.setText(String.valueOf(rs.getInt("qt_embalagens")));
                }


            }catch (SQLException throwables){
                throwables.printStackTrace();
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
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



    /*


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
*/
