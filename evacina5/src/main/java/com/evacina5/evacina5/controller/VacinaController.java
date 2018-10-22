package com.evacina5.evacina5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.evacina5.evacina5.model.Vacina;
import com.evacina5.evacina5.repository.VacinaRepository;

@Controller
public class VacinaController {

	@Autowired
    private VacinaRepository vr;
	
	@RequestMapping(value ="/vac_alterar", method = RequestMethod.GET)
    public ModelAndView alterarVacina(long id){
    	ModelAndView view = new ModelAndView("admin/vacina-alterar");
    	Vacina vacina = vr.findById(id);
    	view.addObject("vacina", vacina);
        return view;
    }
    
    @RequestMapping(value ="/vac_alterar", method = RequestMethod.POST)
    public String alterarVacina(Vacina vacina){
    	vr.save(vacina);
        return "redirect:/vac_listar";
    }
    
    @RequestMapping(value ="/vac_apagar", method = RequestMethod.GET)
    public String apagarVacina(long id){
    	Vacina vacina = vr.findById(id);
    	vr.delete(vacina);
        return "redirect:/vac_listar";
    }
    
    @RequestMapping(value ="/vac_listar", method = RequestMethod.GET)
    public ModelAndView listarVacinas(){
        ModelAndView view = new ModelAndView("admin/vacina_listar");
        Iterable<Vacina> cd =  vr.findAll();
        view.addObject("lista",cd); 
    	return view;
    }

    @RequestMapping(value ="/vac_cadastrar", method = RequestMethod.GET)
    public String cadastrarVacina(){
        return "admin/vacina_cadastrar";
    }


    @RequestMapping(value ="/vac_cadastrar", method = RequestMethod.POST)
    public String cadastraVacina(Vacina vacina){
        vr.save(vacina);
        return "redirect:/vac_listar";
    }
}
