package com.ipvc.springjbdc.entity;

public class Materia_Prima {
    private int id_materia;
    private String descricao;
    private int id_encomenda_f;
    private int id_fornecedor;

    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId_encomenda_f() {
        return id_encomenda_f;
    }

    public void setId_encomenda_f(int id_encomenda_f) {
        this.id_encomenda_f = id_encomenda_f;
    }

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    @Override
    public String toString() {
        return "Materia_Prima{" +
                "id_materia=" + id_materia +
                ", descricao='" + descricao + '\'' +
                ", id_encomenda_f=" + id_encomenda_f +
                ", id_fornecedor=" + id_fornecedor +
                '}';
    }
}
