package com.circuitokers.CircuitoKers.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

	
	@GetMapping(value= {"/","/inicio"})
	public String inicio() {
		
		return "index";
	}
	
}
