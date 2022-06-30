package com.ipvc.springjbdc.entity;

public class Contacto_Cliente {
    private int id_contacto_cliente;
    private String contacto;
    private int id_cliente;

    public int getId_contacto_cliente() {
        return id_contacto_cliente;
    }

    public void setId_contacto_cliente(int id_contacto_cliente) {
        this.id_contacto_cliente = id_contacto_cliente;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    @Override
    public String toString() {
        return "Contacto_Cliente{" +
                "id_contacto_cliente=" + id_contacto_cliente +
                ", contacto='" + contacto + '\'' +
                ", id_cliente=" + id_cliente +
                '}';
    }
}
