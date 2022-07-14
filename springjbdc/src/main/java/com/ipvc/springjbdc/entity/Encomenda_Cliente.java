package com.ipvc.springjbdc.entity;

public class Encomenda_Cliente {
    public int id_encomenda_c;
    public int qt_tipo_sal;
    public int qt_tipo_sem;
    public int qt_tipo_alho;
    public String nome;

    public Encomenda_Cliente(int id_encomenda_c) {
        this.id_encomenda_c = id_encomenda_c;
    }

    public Encomenda_Cliente(int id_encomenda_c, int qt_tipo_sal, int qt_tipo_sem, int qt_tipo_alho, String nome) {
        this.id_encomenda_c = id_encomenda_c;
        this.qt_tipo_sal = qt_tipo_sal;
        this.qt_tipo_sem = qt_tipo_sem;
        this.qt_tipo_alho = qt_tipo_alho;
        this.nome = nome;
    }

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


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Encomenda_Cliente{" +
                "id_encomenda_c=" + id_encomenda_c +
                ", qt_tipo_sal=" + qt_tipo_sal +
                ", qt_tipo_sem=" + qt_tipo_sem +
                ", qt_tipo_alho=" + qt_tipo_alho +
                ", id_cliente=" + nome +
                '}';
    }
}
