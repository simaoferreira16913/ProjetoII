package com.ipvc.springjbdc.entity;

public class Funcionario {
    private int id_func;
    private String tipo;
    private String nome;
    private int cc;
    private int nif_func;
    private int nib;
    private int seg_social;
    private String rua;
    private String cp;

    public int getId_func() {
        return id_func;
    }

    public void setId_func(int id_func) {
        this.id_func = id_func;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getNif_func() {
        return nif_func;
    }

    public void setNif_func(int nif_func) {
        this.nif_func = nif_func;
    }

    public int getNib() {
        return nib;
    }

    public void setNib(int nib) {
        this.nib = nib;
    }

    public int getSeg_social() {
        return seg_social;
    }

    public void setSeg_social(int seg_social) {
        this.seg_social = seg_social;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id_func=" + id_func +
                ", tipo='" + tipo + '\'' +
                ", nome='" + nome + '\'' +
                ", cc=" + cc +
                ", nif_func=" + nif_func +
                ", nib=" + nib +
                ", seg_social=" + seg_social +
                ", rua='" + rua + '\'' +
                ", cp='" + cp + '\'' +
                '}';
    }
}
