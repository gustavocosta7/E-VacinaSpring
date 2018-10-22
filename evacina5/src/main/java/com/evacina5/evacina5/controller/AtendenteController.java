package com.evacina5.evacina5.controller;


import com.evacina5.evacina5.model.Atendente;
import com.evacina5.evacina5.repository.AtendenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.List;

@Controller
public class AtendenteController {


    @Autowired
    private AtendenteRepository ar;


    //-------------------ATENDENTE--------------------------//

    @RequestMapping(value ="/aten_cadastrar", method = RequestMethod.GET)
    public String cadastraAtendente(){
        return "admin/atendente_cadastrar";
    }

    @RequestMapping(value ="/aten_cadastrar", method = RequestMethod.POST)
    public String cadastraAtendente(Atendente atendente){

        ar.save(atendente);

        return "redirect:/aten_listar";
    }
    /**
     * LISTAR
     */

    @RequestMapping(value ="/aten_listar", method = RequestMethod.GET)
    public ModelAndView atendenteListar(){
        ModelAndView modelAndView = new ModelAndView("admin/atendente_listar");
        Iterable<Atendente> atendentes = ar.findAll();
        modelAndView.addObject("atendentes",atendentes);
        return modelAndView;
    }

    /**
     * Alterar
     */
    @RequestMapping(value="/atendente/{id}",method=RequestMethod.GET)
    public ModelAndView alteraAtendente(@PathVariable(value="id")long id) throws ParseException {
        ModelAndView modelAndView = new ModelAndView("admin/atendente_alterar");
        Atendente a = ar.findById(id);
        modelAndView.addObject("atendente",a);
        return modelAndView;
    }
    /******altera de fato*****/
    @RequestMapping(value="/atendente/{id}",method=RequestMethod.POST)
    public String alteraAltera(Atendente atendente) throws ParseException {
        ar.save(atendente);
        return "redirect:/aten_listar";
    }

/**
 * DELETAR
 */

    @RequestMapping("/delAtendente")
    public String deletaAtendente(long id) {
        Atendente a = ar.findById(id);
        ar.delete(a);
        return "redirect:/aten_listar";

    }


    /**
     * PESQUISAR
     */

    @RequestMapping(value="/pesquisaAten")
    public ModelAndView buscaLocal(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("admin/aten_listar");
        List<Atendente> atendente = ar.findByNome(request.getParameter("tfPesquisar"));
        modelAndView.addObject("atendentes", atendente);
        return modelAndView;
    }

}
