package com.ipvc.springjbdc.entity;

public class Fatura_Cliente {
    private int id_fatura;
    private String metodo_pagamento;
    private String metodo_transporte;
    private String data_entrega;
    private int valor_iva;
    private int valor_base;
    private int id_encomenda_c;
    private int id_func;

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

    public String getMetodo_transporte() {
        return metodo_transporte;
    }

    public void setMetodo_transporte(String metodo_transporte) {
        this.metodo_transporte = metodo_transporte;
    }

    public String getData_entrega() {
        return data_entrega;
    }

    public void setData_entrega(String data_entrega) {
        this.data_entrega = data_entrega;
    }

    public int getValor_iva() {
        return valor_iva;
    }

    public void setValor_iva(int valor_iva) {
        this.valor_iva = valor_iva;
    }

    public int getValor_base() {
        return valor_base;
    }

    public void setValor_base(int valor_base) {
        this.valor_base = valor_base;
    }

    public int getId_encomenda_c() {
        return id_encomenda_c;
    }

    public void setId_encomenda_c(int id_encomenda_c) {
        this.id_encomenda_c = id_encomenda_c;
    }

    public int getId_func() {
        return id_func;
    }

    public void setId_func(int id_func) {
        this.id_func = id_func;
    }

    @Override
    public String toString() {
        return "Fatura_Cliente{" +
                "id_fatura=" + id_fatura +
                ", metodo_pagamento='" + metodo_pagamento + '\'' +
                ", metodo_transporte='" + metodo_transporte + '\'' +
                ", data_entrega='" + data_entrega + '\'' +
                ", valor_iva=" + valor_iva +
                ", valor_base=" + valor_base +
                ", id_encomenda_c=" + id_encomenda_c +
                ", id_func=" + id_func +
                '}';
    }
}
