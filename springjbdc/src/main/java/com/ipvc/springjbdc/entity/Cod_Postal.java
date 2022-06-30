package com.ipvc.springjbdc.entity;

public class Cod_Postal {
    private String cp;
    private String localidade;

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    @Override
    public String toString() {
        return "Cod_Postal{" +
                "cp='" + cp + '\'' +
                ", localidade='" + localidade + '\'' +
                '}';
    }
}
