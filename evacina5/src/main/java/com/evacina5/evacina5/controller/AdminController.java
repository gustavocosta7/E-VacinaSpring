package com.evacina5.evacina5.controller;

import com.evacina5.evacina5.model.Atendente;
import com.evacina5.evacina5.model.Local;
import com.evacina5.evacina5.model.Paciente;
import com.evacina5.evacina5.model.Vacina;
import com.evacina5.evacina5.repository.AtendenteRepository;
import com.evacina5.evacina5.repository.LocalRepository;
import com.evacina5.evacina5.repository.PacienteRepository;
import com.evacina5.evacina5.repository.VacinaRepository;
import com.evacina5.evacina5.util.DataUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Controller
public class AdminController {


    //Mapaeamento de rotas


    // ----------------------- ADMIN -------------//

    @RequestMapping(value ="/sair", method = RequestMethod.GET)
    public String sair(){
        return "index";
    }

    @RequestMapping(value ="/admin_index", method = RequestMethod.GET)
    public String adminIndex(){
        return "admin/admin_index";
    }


}




