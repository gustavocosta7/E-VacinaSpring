package com.evacina5.evacina5.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class Atendente implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String nome;
    @NotNull
    private String senha;

    public Atendente() {
    }

    public Atendente(long id, String nome, String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }


    public Atendente(@NotNull String nome, @NotNull String senha) {
        this.nome = nome;
        this.senha = senha;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
