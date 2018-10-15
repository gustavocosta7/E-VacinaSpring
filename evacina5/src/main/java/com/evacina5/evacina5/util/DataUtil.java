package com.evacina5.evacina5.util;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Aluno
 */
public class DataUtil {
    public static String ConverterDataEmTexto(Calendar dataCalendar){
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        Calendar c = dataCalendar;
        return formatador.format(c.getTime());
    }
    public static String ConverterDataEmTexto2(Calendar dataCalendar){
        SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = dataCalendar;
        return formatador.format(c.getTime());
    }

    public static Calendar ConverterTextoEmData(String dataRecebida) throws ParseException{
        
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    	Date dataFormatada = sdf.parse(dataRecebida);
        Calendar dataCalendar = Calendar.getInstance();
        dataCalendar.setTime(dataFormatada);
        return dataCalendar;
    }
    public static Calendar ConverterTextoEmData2(String dataRecebida) throws ParseException{
        
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    	Date dataFormatada = sdf.parse(dataRecebida);
        Calendar dataCalendar = Calendar.getInstance();
        dataCalendar.setTime(dataFormatada);
        return dataCalendar;
    }
}
