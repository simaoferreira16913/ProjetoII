package com.ipvc.springjbdc.entity;

public class Producao {
    private int id_producao;
    private String data_inicio;
    private String data_fim;
    private int id_encomenda_c;

    public int getId_producao() {
        return id_producao;
    }

    public void setId_producao(int id_producao) {
        this.id_producao = id_producao;
    }

    public String getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    public String getData_fim() {
        return data_fim;
    }

    public void setData_fim(String data_fim) {
        this.data_fim = data_fim;
    }

    public int getId_encomenda_c() {
        return id_encomenda_c;
    }

    public void setId_encomenda_c(int id_encomenda_c) {
        this.id_encomenda_c = id_encomenda_c;
    }

    @Override
    public String toString() {
        return "Producao{" +
                "id_producao=" + id_producao +
                ", data_inicio='" + data_inicio + '\'' +
                ", data_fim='" + data_fim + '\'' +
                ", id_encomenda_c=" + id_encomenda_c +
                '}';
    }
}
