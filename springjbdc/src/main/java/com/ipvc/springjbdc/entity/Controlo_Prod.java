package com.ipvc.springjbdc.entity;

public class Controlo_Prod {
    private int id_controlo_prod;
    private String tipo_material;
    private String descricao;
    private int valores;
    private String data_amostra;
    private int id_producao;
    private int id_func;

    public int getId_controlo_prod() {
        return id_controlo_prod;
    }

    public void setId_controlo_prod(int id_controlo_prod) {
        this.id_controlo_prod = id_controlo_prod;
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

    public int getId_producao() {
        return id_producao;
    }

    public void setId_producao(int id_producao) {
        this.id_producao = id_producao;
    }

    public int getId_func() {
        return id_func;
    }

    public void setId_func(int id_func) {
        this.id_func = id_func;
    }

    @Override
    public String toString() {
        return "Controlo_Prod{" +
                "id_controlo_prod=" + id_controlo_prod +
                ", tipo_material='" + tipo_material + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valores=" + valores +
                ", data_amostra='" + data_amostra + '\'' +
                ", id_producao=" + id_producao +
                ", id_func=" + id_func +
                '}';
    }
}
