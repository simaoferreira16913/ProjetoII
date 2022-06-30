package com.ipvc.springjbdc.entity;

public class Fornecedor {
    private int id_fornecedor;
    private String nome;
    private String tipo;
    private String rua;
    private String porta;
    private String cp;

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "id_fornecedor=" + id_fornecedor +
                ", nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", rua='" + rua + '\'' +
                ", porta='" + porta + '\'' +
                ", cp='" + cp + '\'' +
                '}';
    }
}
