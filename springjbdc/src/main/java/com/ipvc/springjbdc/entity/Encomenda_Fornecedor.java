package com.ipvc.springjbdc.entity;

public class Encomenda_Fornecedor {
    private int id_encomenda_f;
    private String tipo_materia;
    private int qt_materia;
    private String data;
    float valor;
    float iva;
    int id_fornecedor;
    int id_armazem;

    @Override
    public String toString() {
        return "Encomenda_Fornecedor{" +
                "id_encomenda_f=" + id_encomenda_f +
                ", tipo_materia='" + tipo_materia + '\'' +
                ", qt_materia=" + qt_materia +
                ", data='" + data + '\'' +
                ", valor=" + valor +
                ", iva=" + iva +
                ", id_fornecedor=" + id_fornecedor +
                ", id_armazem=" + id_armazem +
                '}';
    }

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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public int getId_armazem() {
        return id_armazem;
    }

    public void setId_armazem(int id_armazem) {
        this.id_armazem = id_armazem;
    }
}