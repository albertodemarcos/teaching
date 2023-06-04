package com.circuitokers.CircuitoKers.validadores;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.circuitokers.CircuitoKers.servicios.CircuitoService;
import com.circuitokers.CircuitoKers.servicios.CocheService;
import com.circuitokers.CircuitoKers.utils.command.PruebaCommand;



@Component
public class PruebaValidator implements Validator {

	@Autowired
	private CocheService cocheService;
	
	@Autowired
	private CircuitoService circuitoService;
	
	
	@Override
	public boolean supports(Class<?> clazz) {
		
		return PruebaCommand.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		PruebaCommand command = (PruebaCommand) target;
		
		if(StringUtils.isBlank(command.getNombreCoche())) {
			errors.rejectValue("nombreCoche", "ERROR.CODE", null, "Error, no has indicado el nombre del coche");
		}else if( !cocheService.existeCoche( command.getNombreCoche() ) ) {
			errors.rejectValue("nombreCoche", "ERROR.CODE", null, "Error, no existe el coche");
		}
		
		if(StringUtils.isBlank(command.getNombreCircuito())) {
			errors.rejectValue("nombreCircuito", "ERROR.CODE", null, "Error, no has indicado el nombre del circuito");
		}else if( !circuitoService.existeCircuito( command.getNombreCircuito() ) ) {
			errors.rejectValue("nombreCoche", "ERROR.CODE", null, "Error, no existe el circuito");
		}
		
	}

}
