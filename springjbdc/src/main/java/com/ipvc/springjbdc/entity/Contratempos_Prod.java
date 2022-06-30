package com.ipvc.springjbdc.entity;

public class Contratempos_Prod {
    private int id_contratempo_p;
    private String descricao;
    private int tempo_pausa;
    private String data;
    private int id_producao;

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

    public int getTempo_pausa() {
        return tempo_pausa;
    }

    public void setTempo_pausa(int tempo_pausa) {
        this.tempo_pausa = tempo_pausa;
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

    @Override
    public String toString() {
        return "Contratempos_Prod{" +
                "id_contratempo_p=" + id_contratempo_p +
                ", descricao='" + descricao + '\'' +
                ", tempo_pausa=" + tempo_pausa +
                ", data='" + data + '\'' +
                ", id_producao=" + id_producao +
                '}';
    }
}
