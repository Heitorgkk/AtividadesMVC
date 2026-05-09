package com.atv2.model;

public class Colaborador {

    private String nome;
    private String email;

    public Colaborador(){

    }

    public void setNome(String nome){
        if(nome.isEmpty()) throw new RuntimeException("Erro: Nome vazio");
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setEmail(String email){
        if(email.isEmpty()) throw new RuntimeException("Erro: Email vazio");
        if(!email.contains("@weg.net")) throw new RuntimeException("Erro: Dominio do Email deve ser WEG");
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
}
