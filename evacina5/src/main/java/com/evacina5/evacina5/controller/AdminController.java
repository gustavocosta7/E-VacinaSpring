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


    @RequestMapping(value ="/aten_cadastrar", method = RequestMethod.GET)
    public String cadastraAtendente(){
        return "admin/atendente_cadastrar";
    }

    @RequestMapping(value ="/aten_cadastrar", method = RequestMethod.POST)
    public String cadastraAtendente(Atendente atendente){
        ar.save(atendente);

        return "redirect:admin/atendente_cadastrar";
    }

}
