package com.ipvc.springjbdc.entity;

public class Contratempos_Contprod {
    private int id_contratempo_contprod;
    private String descricao;
    private int tempo_pausa;
    private String data;
    private int id_controlo_prod;
    private int id_func;

    public int getId_contratempo_contprod() {
        return id_contratempo_contprod;
    }

    public void setId_contratempo_contprod(int id_contratempo_contprod) {
        this.id_contratempo_contprod = id_contratempo_contprod;
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

    public int getId_controlo_prod() {
        return id_controlo_prod;
    }

    public void setId_controlo_prod(int id_controlo_prod) {
        this.id_controlo_prod = id_controlo_prod;
    }

    public int getId_func() {
        return id_func;
    }

    public void setId_func(int id_func) {
        this.id_func = id_func;
    }

    @Override
    public String toString() {
        return "Contratempos_Contprod{" +
                "id_contratempo_contprod=" + id_contratempo_contprod +
                ", descricao='" + descricao + '\'' +
                ", tempo_pausa=" + tempo_pausa +
                ", data='" + data + '\'' +
                ", id_controlo_prod=" + id_controlo_prod +
                ", id_func=" + id_func +
                '}';
    }
}
