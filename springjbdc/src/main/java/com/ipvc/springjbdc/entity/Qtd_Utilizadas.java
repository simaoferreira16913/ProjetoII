package com.ipvc.springjbdc.entity;

public class Qtd_Utilizadas {
    int id_qtd;
    int qt_leite;
    int qt_sal;
    int qt_embalagens;
    int id_producao;
    int id_armazem;
    int qt_alho;

    @Override
    public String toString() {
        return "Qtd_Utilizadas{" +
                "id_qtd=" + id_qtd +
                ", qt_leite=" + qt_leite +
                ", qt_sal=" + qt_sal +
                ", qt_embalagens=" + qt_embalagens +
                ", id_producao=" + id_producao +
                ", id_armazem=" + id_armazem +
                ", qt_alho=" + qt_alho +
                '}';
    }

    public int getId_qtd() {
        return id_qtd;
    }

    public void setId_qtd(int id_qtd) {
        this.id_qtd = id_qtd;
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

    public int getQt_embalagens() {
        return qt_embalagens;
    }

    public void setQt_embalagens(int qt_embalagens) {
        this.qt_embalagens = qt_embalagens;
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

    public int getQt_alho() {
        return qt_alho;
    }

    public void setQt_alho(int qt_alho) {
        this.qt_alho = qt_alho;
    }
}
