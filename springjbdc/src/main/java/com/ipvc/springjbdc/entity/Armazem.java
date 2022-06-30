package com.ipvc.springjbdc.entity;

public class Armazem {
    private int id_armazem;
    private String tipo_materia;
    private int qt_materia;
    private String data_validade;

    public int getId_armazem() {
        return id_armazem;
    }

    public void setId_armazem(int id_armazem) {
        this.id_armazem = id_armazem;
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

    public String getData_validade() {
        return data_validade;
    }

    public void setData_validade(String data_validade) {
        this.data_validade = data_validade;
    }

    @Override
    public String toString() {
        return "Armazem{" +
                "id_armazem=" + id_armazem +
                ", tipo_materia='" + tipo_materia + '\'' +
                ", qt_materia=" + qt_materia +
                ", data_validade='" + data_validade + '\'' +
                '}';
    }
}
