package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	//Mapeo: relacionar el metodo a una ruta
	@GetMapping({"/index","/","home"})
	public String index(Model model) {
		model.addAttribute("titulo", "Hola, Spring Framework!");
		return "index";
	}

}
