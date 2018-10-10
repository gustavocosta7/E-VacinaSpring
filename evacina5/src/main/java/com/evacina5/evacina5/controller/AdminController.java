package com.evacina5.evacina5.controller;

import com.evacina5.evacina5.model.Atendente;
import com.evacina5.evacina5.repository.AtendenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {

    @Autowired
    private AtendenteRepository ar;


    //Mapaeamento de rotas
    @RequestMapping(value ="/admin_index", method = RequestMethod.GET)
    public String adminIndex(){
        return "admin/admin_index";
    }


    @RequestMapping(value ="/aten_cadastrar", method = RequestMethod.GET)
    public String cadastraAtendente(){
        return "admin/atendente_cadastrar";
    }

    @RequestMapping(value ="/pac_listar", method = RequestMethod.GET)
    public String pacienteListar(){
        return "admin/paciente_listar";
    }

    @RequestMapping(value ="/pac_cadastrar", method = RequestMethod.GET)
    public String pacienteCadastrar(){
        return "admin/paciente_cadastrar";
    }


    @RequestMapping(value ="/vac_listar", method = RequestMethod.GET)
    public String listarVacinas(){
        return "admin/vacina_listar";
    }


    @RequestMapping(value ="/local_listar", method = RequestMethod.GET)
    public String listarLocais(){
        return "admin/local_listar";
    }

    @RequestMapping(value ="/sair", method = RequestMethod.GET)
    public String sair(){
        return "index";
    }

    @RequestMapping(value ="/aten_cadastrar", method = RequestMethod.POST)
    public String cadastraAtendente(Atendente atendente){
        ar.save(atendente);

        return "redirect:admin/atendente_cadastrar";
    }



}
