package com.ipvc.springjbdc.entity;

public class Funcionario {
    int id_func;
    String email;
    String password;
    public static String cargo;

    @Override
    public String toString() {
        return "Funcionario{" +
                "id_func=" + id_func +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }

    public int getId_func() {
        return id_func;
    }

    public void setId_func(int id_func) {
        this.id_func = id_func;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
