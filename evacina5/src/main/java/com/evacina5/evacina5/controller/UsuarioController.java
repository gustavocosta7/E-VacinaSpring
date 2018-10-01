package com.evacina5.evacina5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsuarioController {

    @RequestMapping("/login")
    public String login(){
        return "usuario/login";
    }

}
