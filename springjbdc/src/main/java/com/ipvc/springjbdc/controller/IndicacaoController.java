package com.ipvc.springjbdc.controller;

import com.ipvc.springjbdc.entity.Encomenda_Cliente;
import com.ipvc.springjbdc.util.DBUTIL;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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

public class IndicacaoController implements Initializable {
    public TextField tfLeite;
    public TextField tfSal;
    public TextField tfAlho;
    public TextField tfEmb;
    public Button btnUtilizacao;
    public ComboBox<Integer> cmbEncomenda = new ComboBox<>();
    public Button btnVoltar;


    Connection con = null;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
            getEnc();
    }

    public void getEnc(){
        try {
            con = DBUTIL.getConnection();
            PreparedStatement pst0 = null;
            try{
                pst0 = con.prepareStatement("SELECT ID_ENCOMENDA_C FROM ENCOMENDA_CLIENTE WHERE ESTADO = 'Pendente'");
                ResultSet rs = pst0.executeQuery();
                while (rs.next()){
                    int enc = rs.getInt("id_encomenda_c");
                    cmbEncomenda.getItems().add(enc);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



    public void RegUtili(ActionEvent actionEvent) {
        try {
            con = DBUTIL.getConnection();
            PreparedStatement pst = null;
            try{
                pst = con.prepareStatement("SELECT qt_leite,qt_sal,qt_alho,qt_embalagens FROM ARMAZEM");
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    int qt_leite = rs.getInt("qt_leite");
                    int qt_sal = rs.getInt("qt_sal");
                    int qt_alho = rs.getInt("qt_alho");
                    int qt_embalagens = rs.getInt("qt_embalagens");

                    int qtdLeite = Integer.parseInt(tfLeite.getText());
                    int qtdSal = Integer.parseInt(tfSal.getText());
                    int qtdAlho = Integer.parseInt(tfAlho.getText());
                    int qtdEmb = Integer.parseInt(tfEmb.getText());

                    PreparedStatement pst2 = con.prepareStatement("UPDATE ARMAZEM SET qt_leite = (?-?)," +
                            "qt_sal = (?-?)," +
                            "qt_alho = (?-?)," +
                            "qt_embalagens = (?-?)" +
                            "WHERE id_armazem = 1");
                    pst2.setInt(1,qt_leite);
                    pst2.setInt(2,qtdLeite);
                    pst2.setInt(3,qt_sal);
                    pst2.setInt(4,qtdSal);
                    pst2.setInt(5,qt_alho);
                    pst2.setInt(6,qtdAlho);
                    pst2.setInt(7,qt_embalagens);
                    pst2.setInt(8,qtdEmb);

                    ResultSet rs2 = pst2.executeQuery();
                    while (rs2.next()){
                        int nrEnc = cmbEncomenda.getValue();
                        PreparedStatement pst3 = con.prepareStatement("UPDATE ENCOMENDA_CLIENTE SET ESTADO = 'Concluido' WHERE id_encomenda_c = ?");
                        pst3.setInt(1,nrEnc);
                        pst3.executeQuery();
                        new Alert(Alert.AlertType.INFORMATION, "Registo Efetuado !").showAndWait();
                        cmbEncomenda.getItems().removeAll(nrEnc);
                    }
                }


            }catch (SQLException throwables){
                throwables.printStackTrace();
            }


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
