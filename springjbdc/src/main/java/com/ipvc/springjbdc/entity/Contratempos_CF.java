package com.ipvc.springjbdc.entity;

public class Contratempos_CF {
    private int id_contratempo_cf;
    private String descricao;
    private int tempo_pausa;
    private String data;
    private int id_controlo_forn;
    private int id_func;

    public int getId_contratempo_cf() {
        return id_contratempo_cf;
    }

    public void setId_contratempo_cf(int id_contratempo_cf) {
        this.id_contratempo_cf = id_contratempo_cf;
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

    public int getId_controlo_forn() {
        return id_controlo_forn;
    }

    public void setId_controlo_forn(int id_controlo_forn) {
        this.id_controlo_forn = id_controlo_forn;
    }

    public int getId_func() {
        return id_func;
    }

    public void setId_func(int id_func) {
        this.id_func = id_func;
    }

    @Override
    public String toString() {
        return "Contratempos_CF{" +
                "id_contratempo_cf=" + id_contratempo_cf +
                ", descricao='" + descricao + '\'' +
                ", tempo_pausa=" + tempo_pausa +
                ", data='" + data + '\'' +
                ", id_controlo_forn=" + id_controlo_forn +
                ", id_func=" + id_func +
                '}';
    }
}
