package com.ipvc.springjbdc.entity;

public class Contacto_Forn {
    private int id_contactoforn;
    private String contacto;
    private int id_fornecedor;

    public int getId_contactoforn() {
        return id_contactoforn;
    }

    public void setId_contactoforn(int id_contactoforn) {
        this.id_contactoforn = id_contactoforn;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    @Override
    public String toString() {
        return "Contacto_Forn{" +
                "id_contactoforn=" + id_contactoforn +
                ", contacto='" + contacto + '\'' +
                ", id_fornecedor=" + id_fornecedor +
                '}';
    }
}
