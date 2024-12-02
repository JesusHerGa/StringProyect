package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.models.*;

import ch.qos.logback.core.model.Model;

@Controller
@RequestMapping("/MetodosController")
public class MetodosController {
	
	
	@GetMapping(value ="/Metodo1")
	public String Metodo1() {
		return "Vista1";
	}
	
	
	@GetMapping(value ="/Metodo2")
	public ModelAndView Metodo() {
		ModelAndView mav = new ModelAndView("Vista2");
		mav.addObject("p",getPersonas());
		return mav;
	}
	
	

	private List<Persona> getPersonas(){
		List<Persona> p = new ArrayList<Persona>();
		 p.add(new Persona("Juan","963852741"));
		 p.add(new Persona("Salma","954352987"));
		 p.add(new Persona("Kiara","946348944"));
		 p.add(new Persona("Jesus","963852745"));
		 p.add(new Persona("notka","997895466"));
		 p.add(new Persona("Iris","965468744"));
		return p;
		
	}
}