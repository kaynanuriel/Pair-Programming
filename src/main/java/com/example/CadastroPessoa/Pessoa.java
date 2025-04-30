package com.example.CadastroPessoa;

public class Pessoa {

    String nome;
    String genero;
    String telefone;
    String endereco;
    Integer idade;

    public Pessoa(String nome, String genero, String telefone, String endereco, Integer idade){
        this.nome = nome;
        this.genero = genero;
        this.telefone = telefone;
        this.endereco = endereco;
        this.idade = idade;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    
    public String getTelefone() {
        return this.telefone;
    }
    
}