package com.ipvc.springjbdc.entity;

public class Fornecedor {
    private int id_fornecedor;
    private String nome;
    private String cp;
    private String morada;
    String email;
    String telemovel;

    @Override
    public String toString() {
        return "Fornecedor{" +
                "id_fornecedor=" + id_fornecedor +
                ", nome='" + nome + '\'' +
                ", cp='" + cp + '\'' +
                ", morada='" + morada + '\'' +
                ", email='" + email + '\'' +
                ", telemovel='" + telemovel + '\'' +
                '}';
    }

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

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelemovel() {
        return telemovel;
    }

    public void setTelemovel(String telemovel) {
        this.telemovel = telemovel;
    }
}
