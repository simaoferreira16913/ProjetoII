package com.ipvc.springjbdc.controller;

import com.ipvc.springjbdc.util.DBUTIL;
import com.sun.scenario.effect.Effect;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import com.ipvc.springjbdc.entity.Armazem;
import javafx.stage.Stage;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ResourceBundle;

public class EncomendaFornecedorController implements Initializable{

    @FXML
    public ChoiceBox<String> cbTipo = new ChoiceBox<>();
    @FXML
    public TextField qtd;
    public Button btnVoltar;

    private String[] mp = {"Leite","Alho","Sal","Embalagens"};

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDateTime now = LocalDateTime.now();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String myMp = cbTipo.getValue();
        cbTipo.getItems().addAll(mp);
        cbTipo.setValue("Escolha uma matéria prima");
        }

    public void encomendar(ActionEvent actionEvent) throws SQLException, IOException, ParseException {

        try {
            Connection conn = DBUTIL.getConnection();

            PreparedStatement pst = null;

            try {
                String myMp = cbTipo.getValue();

                if(myMp == "Escolha uma matéria prima"){
                    new Alert(Alert.AlertType.ERROR, "Escolha um tipo de matéria").showAndWait();
                    return;
                }

                pst = conn.prepareStatement("SELECT qt_leite,qt_sal,qt_alho,qt_embalagens FROM ARMAZEM");
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    int qt_leite = rs.getInt("qt_leite");
                    int qt_sal = rs.getInt("qt_sal");
                    int qt_alho = rs.getInt("qt_alho");
                    int qt_embalagens = rs.getInt("qt_embalagens");
                    String myqtd = qtd.getText();
                    int myqtdInt = Integer.parseInt(myqtd);

                    if(myMp == "Leite"){
                        PreparedStatement pst2 = conn.prepareStatement("UPDATE ARMAZEM SET qt_leite = (?+?)");
                        pst2.setInt(1,qt_leite);
                        pst2.setInt(2,myqtdInt);
                        pst2.executeQuery();
                        PreparedStatement pst3 = conn.prepareStatement("INSERT INTO ENCOMENDA_FORNECEDOR(tipo_materia,qt_materia,data,valor,id_fornecedor,id_armazem) VALUES('Leite',?,?,2,1,1)");
                        pst3.setInt(1,myqtdInt);
                        pst3.setString(2, dtf.format(now));
                        pst3.executeQuery();
                    }
                    if(myMp == "Sal"){
                        PreparedStatement pst2 = conn.prepareStatement("UPDATE ARMAZEM SET qt_sal = (?+?)");
                        pst2.setInt(1,qt_sal);
                        pst2.setInt(2,myqtdInt);
                        pst2.executeQuery();
                        PreparedStatement pst3 = conn.prepareStatement("INSERT INTO ENCOMENDA_FORNECEDOR(tipo_materia,qt_materia,data,valor,id_fornecedor,id_armazem) VALUES('Sal',?,?,1,1,1)");
                        pst3.setInt(1,myqtdInt);
                        pst3.setString(2, dtf.format(now));
                        pst3.executeQuery();
                    }
                    if(myMp == "Alho"){
                        PreparedStatement pst2 = conn.prepareStatement("UPDATE ARMAZEM SET qt_alho = (?+?)");
                        pst2.setInt(1,qt_alho);
                        pst2.setInt(2,myqtdInt);
                        pst2.executeQuery();
                        PreparedStatement pst3 = conn.prepareStatement("INSERT INTO ENCOMENDA_FORNECEDOR(tipo_materia,qt_materia,data,valor,id_fornecedor,id_armazem) VALUES('Alho',?,?,3,1,1)");
                        pst3.setInt(1,myqtdInt);
                        pst3.setString(2, dtf.format(now));
                        pst3.executeQuery();
                    }
                    if(myMp == "Embalagens"){
                        PreparedStatement pst2 = conn.prepareStatement("UPDATE ARMAZEM SET qt_embalagens = (?+?)");
                        pst2.setInt(1,qt_embalagens);
                        pst2.setInt(2,myqtdInt);
                        pst2.executeQuery();
                        PreparedStatement pst3 = conn.prepareStatement("INSERT INTO ENCOMENDA_FORNECEDOR(tipo_materia,qt_materia,data,valor,id_fornecedor,id_armazem) VALUES('Embalagens',?,?,0,50,1,1)");
                        pst3.setInt(1,myqtdInt);
                        pst3.setString(2, dtf.format(now));
                        pst3.executeQuery();
                    }
                    new Alert(Alert.AlertType.INFORMATION, "Encomenda feita com sucesso").showAndWait();
                }
            }catch (SQLException throwables){
                throwables.printStackTrace();
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void voltar(ActionEvent actionEvent) throws IOException,ParseException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/dashboard.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setTitle("Dashboard");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();
        closeEncomenda(btnVoltar);
    }

    public void closeEncomenda(Button btn) {
        Stage stage = (Stage) btn.getScene().getWindow();
        stage.close();
    }
}