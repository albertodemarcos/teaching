package com.circuitokers.CircuitoKers.validadores;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.circuitokers.CircuitoKers.utils.command.CocheCommand;

@Component
public class CocheValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return CocheCommand.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		CocheCommand command = (CocheCommand) target;
		
		if(StringUtils.isBlank(command.getNombre())) {
			errors.rejectValue("nombre", "ERROR.CODE", null, "Error, indica el nombre del coche");
		}
		
		if(StringUtils.isBlank(command.getEscuderia())) {
			errors.rejectValue("escuderia", "ERROR.CODE", null, "Error, indica el nombre de la escuderia");
		}
		
		if(command.getPotencia() == null) {
			errors.rejectValue("potencia", "ERROR.CODE", null, "Error, indica la potencia del coche");
		}
		
		if(command.getGananciaCurva() == null) {
			errors.rejectValue("gananciaCurva", "ERROR.CODE", null, "Error, indica la ganancia por curva del coche");
		}else if(command.getGananciaCurva() != null && (command.getGananciaCurva() < 4 || command.getGananciaCurva() > 10 ) ) {
			errors.rejectValue("gananciaCurva", "ERROR.CODE", null, "Error, la ganancia por curva tiene que estar entre 4 y 10 kw");
		}
	}

}
