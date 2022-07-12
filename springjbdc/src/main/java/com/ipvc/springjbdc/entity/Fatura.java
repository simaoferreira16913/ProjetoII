package com.ipvc.springjbdc.entity;

public class Fatura {
    int id_fatura;
    String metodo_pagamento;
    String data_pagamento;
    float iva;
    float valor_base;
    float valor_total;
    int id_cliente;
    int id_func;

    @Override
    public String toString() {
        return "Fatura{" +
                "id_fatura=" + id_fatura +
                ", metodo_pagamento='" + metodo_pagamento + '\'' +
                ", data_pagamento='" + data_pagamento + '\'' +
                ", iva=" + iva +
                ", valor_base=" + valor_base +
                ", valor_total=" + valor_total +
                ", id_cliente=" + id_cliente +
                ", id_func=" + id_func +
                '}';
    }

    public int getId_fatura() {
        return id_fatura;
    }

    public void setId_fatura(int id_fatura) {
        this.id_fatura = id_fatura;
    }

    public String getMetodo_pagamento() {
        return metodo_pagamento;
    }

    public void setMetodo_pagamento(String metodo_pagamento) {
        this.metodo_pagamento = metodo_pagamento;
    }

    public String getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(String data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float getValor_base() {
        return valor_base;
    }

    public void setValor_base(float valor_base) {
        this.valor_base = valor_base;
    }

    public float getValor_total() {
        return valor_total;
    }

    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_func() {
        return id_func;
    }

    public void setId_func(int id_func) {
        this.id_func = id_func;
    }
}
