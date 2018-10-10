package com.evacina5.evacina5.controller;

import com.evacina5.evacina5.model.Atendente;
import com.evacina5.evacina5.repository.AtendenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Controller
public class UsuarioController {

    @Autowired
    AtendenteRepository ar;

    @RequestMapping("/login")
    public String login(){
        return "usuario/login";
    }


    @RequestMapping("/validaLogin")
    public String validaLogin(HttpServletRequest request, Model model){

        if (ar.existsById(1)){
            Atendente atendente = ar.findById(Long.parseLong(request.getParameter("tfMatricula")));
            if (atendente.getSenha().equals(request.getParameter("tfSenha"))){
                System.out.println("senhas iguais");
                return "usuario/login";
            }
        }else{
            System.out.println("false");

        }
        return "Erro";
    }
}
