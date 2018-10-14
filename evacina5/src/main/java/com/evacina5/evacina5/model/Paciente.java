package com.evacina5.evacina5.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;


@Entity
public class Paciente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long sus;
    private String nome;
    private char sexo;
    private String nascimento;


    public Paciente() {

    }

    public Paciente(String nome, char sexo, String nascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.nascimento = nascimento;
    }

    public long getSus() {
        return sus;
    }

    public void setSus(long sus) {
        this.sus = sus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
}
