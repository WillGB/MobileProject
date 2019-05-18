package com.example.mobileproject;

public class Cliente {

    String login;
    String senha;
    int id;

    public Cliente(){

    }

    public Cliente(int _id, String _login, String _senha){
        this.login = _login;
        this.senha = _senha;
        this.id = _id;
    }

    public Cliente(String _login, String _senha){
        this.login = _login;
        this.senha = _senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

