package com.ipvc.springjbdc.entity;

public class Cliente {
    private int id_cliente;
    public  String nome;
    private int nif;
    String email;
    String telemovel;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(int id_cliente, String nome, int nif, String email, String telemovel) {
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.nif = nif;
        this.email = email;
        this.telemovel = telemovel;
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

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id_cliente=" + id_cliente +
                ", Nome='" + nome + '\'' +
                ", NIF=" + nif +
                ", email='" + email + '\'' +
                ", telemovel='" + telemovel + '\'' +
                '}';
    }
}
