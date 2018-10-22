package com.evacina5.evacina5.controller;

import com.evacina5.evacina5.model.Paciente;
import com.evacina5.evacina5.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pacientes")
public class PacienteControllerAPI {
    @Autowired
    PacienteRepository pacienteRepository;

    @GetMapping("/listar")
    public List<Paciente> listaPaciente(){
        return pacienteRepository.findAll();
    }
    
    
    
//
//    @GetMapping("/paciente/{id}")
//    public Paciente listaPacienteUnico(@PathVariable(value = "id") long id){
//        return pacienteRepository.findById(id);
//    }
}
