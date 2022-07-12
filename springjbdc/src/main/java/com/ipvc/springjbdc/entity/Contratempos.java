package com.ipvc.springjbdc.entity;

public class Contratempos {
    int id_contratempo_p;
    String descricao;
    String gravidade;
    String data;
    int id_producao;
    String tipo_contratempo;
    int tempo_paragem;

    @Override
    public String toString() {
        return "Contratempos{" +
                "id_contratempo_p=" + id_contratempo_p +
                ", descricao='" + descricao + '\'' +
                ", gravidade='" + gravidade + '\'' +
                ", data='" + data + '\'' +
                ", id_producao=" + id_producao +
                ", tipo_contratempo='" + tipo_contratempo + '\'' +
                ", tempo_paragem=" + tempo_paragem +
                '}';
    }

    public int getId_contratempo_p() {
        return id_contratempo_p;
    }

    public void setId_contratempo_p(int id_contratempo_p) {
        this.id_contratempo_p = id_contratempo_p;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGravidade() {
        return gravidade;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getId_producao() {
        return id_producao;
    }

    public void setId_producao(int id_producao) {
        this.id_producao = id_producao;
    }

    public String getTipo_contratempo() {
        return tipo_contratempo;
    }

    public void setTipo_contratempo(String tipo_contratempo) {
        this.tipo_contratempo = tipo_contratempo;
    }

    public int getTempo_paragem() {
        return tempo_paragem;
    }

    public void setTempo_paragem(int tempo_paragem) {
        this.tempo_paragem = tempo_paragem;
    }
}
