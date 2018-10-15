package com.evacina5.evacina5.controller;

import java.text.ParseException;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.evacina5.evacina5.model.Paciente;
import com.evacina5.evacina5.repository.PacienteRepository;
import com.evacina5.evacina5.util.DataUtil;

@Controller
public class PacienteController {

	 @Autowired
	 private PacienteRepository pr;
	
	 
	//--------------PACIENTE -------------------------//

	    @RequestMapping(value ="/pac_cadastrar", method = RequestMethod.POST)
	    public ModelAndView cadastraPaciente(Paciente paciente) throws ParseException{
	        Calendar c =  DataUtil.ConverterTextoEmData(String.valueOf(paciente.getNascimento()));
	        paciente.setNascimento(DataUtil.ConverterDataEmTexto(c));
	        pr.save(paciente);

	        ModelAndView modelAndView = new ModelAndView("admin/paciente_listar");
	        Iterable<Paciente> pacientes = pr.findAll();
	        modelAndView.addObject("pacientes",pacientes);
	        return modelAndView;
	    }

	    @RequestMapping(value ="/pac_listar", method = RequestMethod.GET)
	    public ModelAndView pacienteListar(){
	        ModelAndView modelAndView = new ModelAndView("admin/paciente_listar");
	        Iterable<Paciente> pacientes = pr.findAll();
	        modelAndView.addObject("pacientes",pacientes);
	        return modelAndView;
	    }

	    @RequestMapping(value ="/pac_cadastrar", method = RequestMethod.GET)
	    public String pacienteCadastrar(){
	        return "admin/paciente_cadastrar";
	    }

	    /************Entra na view e seta variaveis
	     * @throws ParseException **************/
	    @RequestMapping(value="/paciente/{sus}",method=RequestMethod.GET)
	    public ModelAndView alteraPaciente(@PathVariable(value="sus")long sus) throws ParseException {
	    	ModelAndView modelAndView = new ModelAndView("admin/paciente_alterar");
	    	Paciente p = pr.findById(sus);
	    	Calendar c = DataUtil.ConverterTextoEmData2(p.getNascimento());
	    	p.setNascimento(DataUtil.ConverterDataEmTexto2(c));
	    	modelAndView.addObject("paciente",p);
	    	return modelAndView;
	    }
	    /******altera de fato*****/
	    @RequestMapping(value="/paciente/{sus}",method=RequestMethod.POST)
	    public String alterarPaciente(Paciente paciente) throws ParseException {
	    	Calendar c =  DataUtil.ConverterTextoEmData(String.valueOf(paciente.getNascimento()));
	        paciente.setNascimento(DataUtil.ConverterDataEmTexto(c));
	    	pr.save(paciente);
	    	return "redirect:/pac_listar";
	    }
	    
	    
	    
	    @RequestMapping("/delPaciente")
	    public String deletaPaciente(long sus) {
	    	Paciente p = pr.findById(sus);
	    	pr.delete(p);
	    	return "redirect:/pac_listar";
	    	
	    }
	    
	    @RequestMapping(value="/pesquisaPaciente")
	    public ModelAndView buscaPaciente(HttpServletRequest request) {
	    	ModelAndView modelAndView = new ModelAndView("admin/paciente_listar");
	    	List<Paciente> pacientes = pr.findByNome(request.getParameter("tfPesquisar"));
	    	modelAndView.addObject("pacientes", pacientes);
	    	return modelAndView;
	    }
	    
	    @RequestMapping(value="/consultasus")
	    public ModelAndView consultaPacienteSus(HttpServletRequest request) {
	    	ModelAndView mv = new ModelAndView("paciente/consulta");
	    	long sus = Long.parseLong(request.getParameter("tfSus"));
	    	Paciente paciente = pr.findById(sus);
	    	mv.addObject("paciente",paciente);
	    	return mv;
	    }
	    
	    @RequestMapping("/consulta")
	    public String consulta(){
	        return "paciente/consulta";
	    }


	    
}
