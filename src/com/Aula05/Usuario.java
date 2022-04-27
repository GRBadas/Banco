package com.Aula05;

public class Usuario extends Pessoa{
    
    public String login;
    private String senha;
    public Conta conta;

    public void setSenha(String senha){
        this.senha = senha;
    }

    public boolean validarSenha(String senha){
        return this.senha.equals(senha);
    }

}