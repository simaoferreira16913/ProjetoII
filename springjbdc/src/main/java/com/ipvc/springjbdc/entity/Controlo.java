package com.ipvc.springjbdc.entity;

public class Controlo {
    int id_controlo;
    float temperatura;
    String coagulacao;
    String data_amostra;
    int id_encomenda;

    @Override
    public String toString() {
        return "Controlo{" +
                "id_controlo=" + id_controlo +
                ", temperatura=" + temperatura +
                ", coagulacao='" + coagulacao + '\'' +
                ", data_amostra='" + data_amostra + '\'' +
                ", id_encomenda=" + id_encomenda +
                '}';
    }

    public int getId_controlo() {
        return id_controlo;
    }

    public void setId_controlo(int id_controlo) {
        this.id_controlo = id_controlo;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public String getCoagulacao() {
        return coagulacao;
    }

    public void setCoagulacao(String coagulacao) {
        this.coagulacao = coagulacao;
    }

    public String getData_amostra() {
        return data_amostra;
    }

    public void setData_amostra(String data_amostra) {
        this.data_amostra = data_amostra;
    }

    public int getId_encomenda() {
        return id_encomenda;
    }

    public void setId_encomenda(int id_encomenda) {
        this.id_encomenda = id_encomenda;
    }
}
