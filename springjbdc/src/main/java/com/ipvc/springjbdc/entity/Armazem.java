package com.ipvc.springjbdc.entity;

public class Armazem {
    int id_armazem;
    int qt_leite;
    int qt_sal;
    int qt_alho;
    int qt_embalagens;

    public Armazem(int id_armazem, int qt_leite, int qt_sal, int qt_alho, int qt_embalagens) {
        this.id_armazem = id_armazem;
        this.qt_leite = qt_leite;
        this.qt_sal = qt_sal;
        this.qt_alho = qt_alho;
        this.qt_embalagens = qt_embalagens;
    }


    @Override
    public String toString() {
        return "Armazem{" +
                "id_armazem=" + id_armazem +
                ", qt_leite=" + qt_leite +
                ", qt_sal=" + qt_sal +
                ", qt_alho=" + qt_alho +
                ", qt_embalagens=" + qt_embalagens +
                '}';
    }

    public int getId_armazem() {
        return id_armazem;
    }

    public void setId_armazem(int id_armazem) {
        this.id_armazem = id_armazem;
    }

    public int getQt_leite() {
        return qt_leite;
    }

    public void setQt_leite(int qt_leite) {
        this.qt_leite = qt_leite;
    }

    public int getQt_sal() {
        return qt_sal;
    }

    public void setQt_sal(int qt_sal) {
        this.qt_sal = qt_sal;
    }

    public int getQt_alho() {
        return qt_alho;
    }

    public void setQt_alho(int qt_alho) {
        this.qt_alho = qt_alho;
    }

    public int getQt_embalagens() {
        return qt_embalagens;
    }

    public void setQt_embalagens(int qt_embalagens) {
        this.qt_embalagens = qt_embalagens;
    }
}