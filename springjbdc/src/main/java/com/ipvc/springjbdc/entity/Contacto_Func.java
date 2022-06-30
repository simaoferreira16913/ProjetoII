package com.ipvc.springjbdc.entity;

public class Contacto_Func {
    private int id_contactofunc;
    private String contacto;
    private int id_func;

    public int getId_contactofunc() {
        return id_contactofunc;
    }

    public void setId_contactofunc(int id_contactofunc) {
        this.id_contactofunc = id_contactofunc;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public int getId_func() {
        return id_func;
    }

    public void setId_func(int id_func) {
        this.id_func = id_func;
    }

    @Override
    public String toString() {
        return "Contacto_Func{" +
                "id_contactofunc=" + id_contactofunc +
                ", contacto='" + contacto + '\'' +
                ", id_func=" + id_func +
                '}';
    }
}
