package com.ipvc.springjbdc.entity;

public class Guia_Transporte {
    private int id_guia;
    private String matricula;
    private String rua;
    private int porta;
    private String cp;
    private int id_fatura;

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

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public int getId_fatura() {
        return id_fatura;
    }

    public void setId_fatura(int id_fatura) {
        this.id_fatura = id_fatura;
    }

    @Override
    public String toString() {
        return "Guia_Transporte{" +
                "id_guia=" + id_guia +
                ", matricula='" + matricula + '\'' +
                ", rua='" + rua + '\'' +
                ", porta=" + porta +
                ", cp='" + cp + '\'' +
                ", id_fatura=" + id_fatura +
                '}';
    }
}
