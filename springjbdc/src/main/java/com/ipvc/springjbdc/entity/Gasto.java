package com.ipvc.springjbdc.entity;

public class Gasto {
    private int id_gasto;
    private String tipo_materia;
    private int qt_gasto;
    private int desperdicio;
    private int id_producao;
    private int id_armazem;

    public int getId_gasto() {
        return id_gasto;
    }

    public void setId_gasto(int id_gasto) {
        this.id_gasto = id_gasto;
    }

    public String getTipo_materia() {
        return tipo_materia;
    }

    public void setTipo_materia(String tipo_materia) {
        this.tipo_materia = tipo_materia;
    }

    public int getQt_gasto() {
        return qt_gasto;
    }

    public void setQt_gasto(int qt_gasto) {
        this.qt_gasto = qt_gasto;
    }

    public int getDesperdicio() {
        return desperdicio;
    }

    public void setDesperdicio(int desperdicio) {
        this.desperdicio = desperdicio;
    }

    public int getId_producao() {
        return id_producao;
    }

    public void setId_producao(int id_producao) {
        this.id_producao = id_producao;
    }

    public int getId_armazem() {
        return id_armazem;
    }

    public void setId_armazem(int id_armazem) {
        this.id_armazem = id_armazem;
    }

    @Override
    public String toString() {
        return "Gasto{" +
                "id_gasto=" + id_gasto +
                ", tipo_materia='" + tipo_materia + '\'' +
                ", qt_gasto=" + qt_gasto +
                ", desperdicio=" + desperdicio +
                ", id_producao=" + id_producao +
                ", id_armazem=" + id_armazem +
                '}';
    }
}
