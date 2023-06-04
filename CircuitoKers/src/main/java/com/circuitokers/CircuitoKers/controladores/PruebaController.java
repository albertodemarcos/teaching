package com.circuitokers.CircuitoKers.controladores;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.circuitokers.CircuitoKers.servicios.PruebaService;
import com.circuitokers.CircuitoKers.utils.command.PruebaCommand;
import com.circuitokers.CircuitoKers.validadores.PruebaValidator;

@Controller
public class PruebaController {

	@Autowired
	private PruebaValidator pruebaValidator;
	
	@Autowired
	private PruebaService pruebaService;
	
	
	@GetMapping(value="/circuitokers/calcularPrueba")
	public String getCrearPrueba(PruebaCommand pruebaCommand, Model model) {
		
		model.addAttribute("pruebaCommand", pruebaCommand);
		model.addAttribute("cochesDto", pruebaService.obtieneTodosCochesParaPrueba());
		model.addAttribute("circuitosDto", pruebaService.obtieneTodosCircuitosParaPrueba());
		
		return "/pruebas/crearPrueba";
	}
	
	@PostMapping(value="/circuitokers/calcularPrueba")
	public String postCrearPrueba(@ModelAttribute("pruebaCommand") PruebaCommand pruebaCommand, Model model, BindingResult result)  throws Exception {
		
		pruebaValidator.validate(pruebaCommand, result);
		
		if(result.hasErrors()) {
			
			model.addAttribute("pruebaCommand", pruebaCommand);
			model.addAttribute("cochesDto", pruebaService.obtieneTodosCochesParaPrueba());
			model.addAttribute("circuitosDto", pruebaService.obtieneTodosCircuitosParaPrueba());
			
			return "/pruebas/crearPrueba";
		}
		
		pruebaCommand.setGananciaTotal(pruebaService.calcularGanancia(pruebaCommand));
		
		model.addAttribute("pruebaCommand", pruebaCommand);
		
		return "/pruebas/prueba";
	}
	
	
}
