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

import com.circuitokers.CircuitoKers.modelo.Coche;
import com.circuitokers.CircuitoKers.servicios.CocheService;
import com.circuitokers.CircuitoKers.utils.command.CocheCommand;
import com.circuitokers.CircuitoKers.utils.dto.CocheDto;
import com.circuitokers.CircuitoKers.validadores.CocheValidator;

@Controller
public class CocheController {

	@Autowired
	private CocheValidator cocheValidator;
	
	@Autowired
	private CocheService cocheService;
	
	
	@GetMapping(value="/circuitokers/coche/{coche}")
	public String getCoche(@PathVariable Coche coche, Model model) {
		
		CocheCommand command = this.cocheService.obtieneCoche(coche);
		
		model.addAttribute("coche", command);
		
		return "/coches/coche";
	}
	
	
	@GetMapping(value="/circuitokers/crearCoche")
	public String getCrearCoche(CocheCommand command, Model model) {
		
		model.addAttribute("cocheCommand", command);
		
		return "/coches/crearCoche";
	}
	
	@GetMapping(value="/circuitokers/editarCoche/{coche}")
	public String getEditarCoche(@PathVariable Coche coche, Model model) {
		
		CocheCommand command = this.cocheService.obtieneCoche(coche);
		
		model.addAttribute("cocheCommand", command);
		
		return "/coches/crearCoche";
	}
	
	@PostMapping(value="/circuitokers/crearCoche")
	public String postCrearCoche(@ModelAttribute("cocheCommand") CocheCommand cocheCommand, Model model, BindingResult result)  throws Exception {
		
		cocheValidator.validate(cocheCommand, result);
		
		if(result.hasErrors()) {
			
			model.addAttribute("cocheCommand", cocheCommand);
			
			return "/coches/crearCoche";
		}
		
		cocheCommand = cocheService.persisteCoche(cocheCommand);
		
		model.addAttribute("coche", cocheCommand);
		
		return "/coches/coche";
	}
	
	@GetMapping(value="/circuitokers/coches")
	public String getListadoCoches( ) {
		
		return "/coches/coches";
	}
	
	@GetMapping(value="/circuitokers/cochespage")
	public @ResponseBody List<CocheDto> getListadoCochesPage(  ) {
		
		List<CocheDto> listado = cocheService.listadoCoches();
		
		return listado;
	}
	
	
}
