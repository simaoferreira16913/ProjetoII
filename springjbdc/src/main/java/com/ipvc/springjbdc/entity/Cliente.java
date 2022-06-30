package com.ipvc.springjbdc.entity;

public class Cliente {
    private int id_cliente;
    private  String Nome;
    private int NIF;

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getNIF() {
        return NIF;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id_cliente=" + id_cliente +
                ", Nome='" + Nome + '\'' +
                ", NIF=" + NIF +
                '}';
    }
}
