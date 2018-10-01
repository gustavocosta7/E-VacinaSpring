package com.evacina5.evacina5.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Calendar;


@Entity
public class Paciente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long pacnsus;

    private String pacnome;
    private char pacsexo;
    private Calendar pacdtnascimento;


    public Paciente() {

    }

    public Paciente(String pacnome, char pacsexo, Calendar pacdtnascimento) {
        this.pacnome = pacnome;
        this.pacsexo = pacsexo;
        this.pacdtnascimento = pacdtnascimento;
    }

    public long getPacnsus() {
        return pacnsus;
    }

    public void setPacnsus(long pacnsus) {
        this.pacnsus = pacnsus;
    }

    public String getPacnome() {
        return pacnome;
    }

    public void setPacnome(String pacnome) {
        this.pacnome = pacnome;
    }

    public char getPacsexo() {
        return pacsexo;
    }

    public void setPacsexo(char pacsexo) {
        this.pacsexo = pacsexo;
    }

    public Calendar getPacdtnascimento() {
        return pacdtnascimento;
    }

    public void setPacdtnascimento(Calendar pacdtnascimento) {
        this.pacdtnascimento = pacdtnascimento;
    }
}
