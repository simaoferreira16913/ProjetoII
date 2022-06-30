package com.ipvc.springjbdc.entity;

public class Controlo_Fornecedor {
    private int id_controlo_forn;
    private String tipo_material;
    private String descricao;
    private int valores;
    private String data_amostra;
    private int id_encomenda_f;
    private int id_func;

    public int getId_controlo_forn() {
        return id_controlo_forn;
    }

    public void setId_controlo_forn(int id_controlo_forn) {
        this.id_controlo_forn = id_controlo_forn;
    }

    public String getTipo_material() {
        return tipo_material;
    }

    public void setTipo_material(String tipo_material) {
        this.tipo_material = tipo_material;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getValores() {
        return valores;
    }

    public void setValores(int valores) {
        this.valores = valores;
    }

    public String getData_amostra() {
        return data_amostra;
    }

    public void setData_amostra(String data_amostra) {
        this.data_amostra = data_amostra;
    }

    public int getId_encomenda_f() {
        return id_encomenda_f;
    }

    public void setId_encomenda_f(int id_encomenda_f) {
        this.id_encomenda_f = id_encomenda_f;
    }

    public int getId_func() {
        return id_func;
    }

    public void setId_func(int id_func) {
        this.id_func = id_func;
    }

    @Override
    public String toString() {
        return "Controlo_Fornecedor{" +
                "id_controlo_forn=" + id_controlo_forn +
                ", tipo_material='" + tipo_material + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valores=" + valores +
                ", data_amostra='" + data_amostra + '\'' +
                ", id_encomenda_f=" + id_encomenda_f +
                ", id_func=" + id_func +
                '}';
    }
}
