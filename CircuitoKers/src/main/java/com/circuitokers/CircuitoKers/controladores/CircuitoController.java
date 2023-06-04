package com.circuitokers.CircuitoKers.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.circuitokers.CircuitoKers.modelo.Circuito;
import com.circuitokers.CircuitoKers.servicios.CircuitoService;
import com.circuitokers.CircuitoKers.utils.command.CircuitoCommand;
import com.circuitokers.CircuitoKers.utils.dto.CircuitoDto;
import com.circuitokers.CircuitoKers.validadores.CircuitoValidator;

@Controller
public class CircuitoController {
	
	@Autowired
	private CircuitoValidator circuitoValidator;
	
	@Autowired
	private CircuitoService circuitoService;
	
	@GetMapping(value="/circuitokers/circuito/{circuito}")
	public String getCoche(@PathVariable Circuito circuito, Model model) {
		
		CircuitoCommand command = this.circuitoService.obtieneCircuito(circuito);
		
		model.addAttribute("circuito", command);
		
		return "/circuitos/circuito";
	}

	
	@GetMapping(value="/circuitokers/crearCircuito")
	public String getCrearCircuito(CircuitoCommand command, Model model) {
		
		model.addAttribute("circuitoCommand", command);
		
		return "/circuitos/crearCircuito";
	}
	
	@GetMapping(value="/circuitokers/editarCircuito/{circuito}")
	public String getEditarCircuito(@PathVariable Circuito circuito, Model model) {
		
		CircuitoCommand command = this.circuitoService.obtieneCircuito(circuito);
		
		model.addAttribute("circuitoCommand", command);
		
		return "/circuitos/crearCircuito";
	}
	
	
	@PostMapping(value="/circuitokers/crearCircuito")
	public String postCrearCircuito(@ModelAttribute("circuitoCommand") CircuitoCommand circuitoCommand, Model model, BindingResult result) throws Exception {
		
		circuitoValidator.validate(circuitoCommand, result);
		
		if(result.hasErrors()) {
			
			model.addAttribute("circuitoCommand", circuitoCommand);
			
			return "/circuitos/crearCircuito";
		}
		
		circuitoCommand = circuitoService.persisteCircuito(circuitoCommand);
		
		model.addAttribute("circuito", circuitoCommand);
		
		return "/circuitos/circuito";
	}
	
	@GetMapping(value="/circuitokers/circuitos")
	public String getListadoCircuitos( ) {
		
		
		return "/circuitos/circuitos";
	}
	
	@GetMapping(value="/circuitokers/circuitospage")
	public @ResponseBody List<CircuitoDto> getListadoCircuitoPage(  ) {
		
		List<CircuitoDto> listado = circuitoService.listadoCircuitos();
		
		return listado;
	}
}
