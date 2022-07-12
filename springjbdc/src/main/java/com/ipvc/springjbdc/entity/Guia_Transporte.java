package com.ipvc.springjbdc.entity;

public class Guia_Transporte {
    private int id_guia;
    private String matricula;
    String data_pagamento;
    float valor;
    int id_cliente;
    int id_encomenda;

    @Override
    public String toString() {
        return "Guia_Transporte{" +
                "id_guia=" + id_guia +
                ", matricula='" + matricula + '\'' +
                ", data_pagamento='" + data_pagamento + '\'' +
                ", valor=" + valor +
                ", id_cliente=" + id_cliente +
                ", id_encomenda=" + id_encomenda +
                '}';
    }

    public int getId_guia() {
        return id_guia;
    }

    public void setId_guia(int id_guia) {
        this.id_guia = id_guia;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(String data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_encomenda() {
        return id_encomenda;
    }

    public void setId_encomenda(int id_encomenda) {
        this.id_encomenda = id_encomenda;
    }
}
