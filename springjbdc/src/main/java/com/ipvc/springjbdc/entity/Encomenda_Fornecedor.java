package com.ipvc.springjbdc.entity;

public class Encomenda_Fornecedor {
    private int id_encomenda_f;
    private String tipo_materia;
    private int qt_materia;
    private String data_inicio;
    private String data_fim;
    private int id_Func;

    public int getId_encomenda_f() {
        return id_encomenda_f;
    }

    public void setId_encomenda_f(int id_encomenda_f) {
        this.id_encomenda_f = id_encomenda_f;
    }

    public String getTipo_materia() {
        return tipo_materia;
    }

    public void setTipo_materia(String tipo_materia) {
        this.tipo_materia = tipo_materia;
    }

    public int getQt_materia() {
        return qt_materia;
    }

    public void setQt_materia(int qt_materia) {
        this.qt_materia = qt_materia;
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

    public int getId_Func() {
        return id_Func;
    }

    public void setId_Func(int id_Func) {
        this.id_Func = id_Func;
    }

    @Override
    public String toString() {
        return "Encomenda_Fornecedor{" +
                "id_encomenda_f=" + id_encomenda_f +
                ", tipo_materia='" + tipo_materia + '\'' +
                ", qt_materia=" + qt_materia +
                ", data_inicio='" + data_inicio + '\'' +
                ", data_fim='" + data_fim + '\'' +
                ", id_Func=" + id_Func +
                '}';
    }
}
