package com.ipvc.springjbdc.entity;

public class Encomenda_Cliente {
    private int id_encomenda_c;
    private int qt_tipo_sal;
    private int qt_tipo_sem;
    private int qt_tipo_alho;
    private String data_inicio;
    private String data_fim;
    private int id_cliente;

    public int getId_encomenda_c() {
        return id_encomenda_c;
    }

    public void setId_encomenda_c(int id_encomenda_c) {
        this.id_encomenda_c = id_encomenda_c;
    }

    public int getQt_tipo_sal() {
        return qt_tipo_sal;
    }

    public void setQt_tipo_sal(int qt_tipo_sal) {
        this.qt_tipo_sal = qt_tipo_sal;
    }

    public int getQt_tipo_sem() {
        return qt_tipo_sem;
    }

    public void setQt_tipo_sem(int qt_tipo_sem) {
        this.qt_tipo_sem = qt_tipo_sem;
    }

    public int getQt_tipo_alho() {
        return qt_tipo_alho;
    }

    public void setQt_tipo_alho(int qt_tipo_alho) {
        this.qt_tipo_alho = qt_tipo_alho;
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

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    @Override
    public String toString() {
        return "Encomenda_Cliente{" +
                "id_encomenda_c=" + id_encomenda_c +
                ", qt_tipo_sal=" + qt_tipo_sal +
                ", qt_tipo_sem=" + qt_tipo_sem +
                ", qt_tipo_alho=" + qt_tipo_alho +
                ", data_inicio='" + data_inicio + '\'' +
                ", data_fim='" + data_fim + '\'' +
                ", id_cliente=" + id_cliente +
                '}';
    }
}
