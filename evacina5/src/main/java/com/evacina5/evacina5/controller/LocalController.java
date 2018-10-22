package com.evacina5.evacina5.controller;

import com.evacina5.evacina5.model.Local;
import com.evacina5.evacina5.model.Paciente;
import com.evacina5.evacina5.repository.LocalRepository;
import com.evacina5.evacina5.util.DataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.Calendar;
import java.util.List;

@Controller
public class LocalController {


    @Autowired
    private LocalRepository lr;

//--------------------------LOCAL-----------------------------

    @RequestMapping(value = "/local_cad", method = RequestMethod.GET)
    public String cadastrarLocal() {
        return "admin/local_cadastrar";
    }

    @RequestMapping(value = "/local_cad", method = RequestMethod.POST)
    public String cadastrarLocal(Local local) {
        lr.save(local);

        return "redirect:/local_listar";
    }

    @RequestMapping(value ="/local_listar", method = RequestMethod.GET)
    public ModelAndView localListar(){
        ModelAndView modelAndView = new ModelAndView("admin/local_listar");
        Iterable<Local> locais = lr.findAll();
        modelAndView.addObject("locais",locais);
        return modelAndView;
    }


/**
 * ALTERAR LOCAL
 */
    @RequestMapping(value="/local/{id}",method=RequestMethod.GET)
    public ModelAndView alteraLocal(@PathVariable(value="id")long id) throws ParseException {
        ModelAndView modelAndView = new ModelAndView("admin/local_alterar");
        Local l = lr.findById(id);
        modelAndView.addObject("local",l);
        return modelAndView;
    }
    /******altera de fato*****/
    @RequestMapping(value="/local/{id}",method=RequestMethod.POST)
    public String alteraLocal(Local local) throws ParseException {
        lr.save(local);
        return "redirect:/local_listar";
    }
    /**
     * Delete
     */
    @RequestMapping("/delLocal")
    public String deletaLocal(long id) {
        Local l = lr.findById(id);
        lr.delete(l);
        return "redirect:/local_listar";

    }

    /**
     * Consulta local
     */

    @RequestMapping(value="/pesquisaLocal")
    public ModelAndView buscaPaciente(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("admin/local_listar");
        List<Local> locais = lr.findByNome(request.getParameter("tfPesquisar"));
        modelAndView.addObject("locais", locais);
        return modelAndView;
    }

}
