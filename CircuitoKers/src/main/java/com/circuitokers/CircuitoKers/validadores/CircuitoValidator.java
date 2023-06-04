package com.circuitokers.CircuitoKers.validadores;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.circuitokers.CircuitoKers.utils.command.CircuitoCommand;

@Component
public class CircuitoValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return CircuitoCommand.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		
		CircuitoCommand command = (CircuitoCommand) target;
		
		if( StringUtils.isBlank( command.getNombre() ) ) {
			errors.rejectValue("nombre", "ERROR.CODE", null, "Error, no ha indicado el nombre del circuito");
		}
		
		if( StringUtils.isBlank( command.getCiudad() ) ) {
			errors.rejectValue("ciudad", "ERROR.CODE", null, "Error, indica la cuidad");
		}
		
		if( StringUtils.isBlank( command.getPais() ) ) {
			errors.rejectValue("pais", "ERROR.CODE", null, "Error, indica el país");
		}
		
		//Numero de curvas
		if(command.getNumCurvas() == null) {
			errors.rejectValue("numCurvas", "ERROR.CODE", null, "Error, indica el numero de curvas del circuito");
			
		}else if(command.getNumCurvas() != null && ( command.getNumCurvas() < 6 || command.getNumCurvas() > 20 )  ) {
			errors.rejectValue("numCurvas", "ERROR.CODE", null, "Error, el numero de curvas tiene que estar entre 6 y 20 curvas");
		}
		
		//Numero de vueltas
		if(command.getNumVueltas() == null) {
			errors.rejectValue("numVueltas", "ERROR.CODE", null, "Error, indica el numero de vueltas del circuito");			
		}else if(command.getNumVueltas() != null && (command.getNumVueltas() < 40 || command.getNumVueltas() > 80 ) ) {
			errors.rejectValue("numVueltas", "ERROR.CODE", null, "Error, el numero de vueltas tiene que estar entre 40 y 80 vueltas");
		}

		//Longitud de vuelta
		if(command.getLongVuelta() == null) {
			errors.rejectValue("longVuelta", "ERROR.CODE", null, "Error, indica la longitud de la vuelta al circuito");
		}else if(command.getLongVuelta() != null && (command.getLongVuelta() < 3000 || command.getLongVuelta() > 9000) ) {
			errors.rejectValue("longVuelta", "ERROR.CODE", null, "Error, la longitud de vuelta tiene que estar entre 3000 y 9000");
		}
		
		
	}

}
