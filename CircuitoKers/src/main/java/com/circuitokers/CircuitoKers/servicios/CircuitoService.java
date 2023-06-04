package com.circuitokers.CircuitoKers.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.circuitokers.CircuitoKers.modelo.Circuito;
import com.circuitokers.CircuitoKers.repositorios.CircuitoRepository;
import com.circuitokers.CircuitoKers.utils.command.CircuitoCommand;
import com.circuitokers.CircuitoKers.utils.dto.CircuitoDto;

@Service
public class CircuitoService {
	
	@Autowired
	private CircuitoRepository circuitoRepository;
	
	
	public CircuitoCommand obtieneCircuito(Circuito circuito) {
		
		CircuitoCommand command = new CircuitoCommand();
		
		if(circuito != null) {
			
			command.setId(circuito.getId());
			command.setNombre(circuito.getNombre());
			command.setCiudad(circuito.getCiudad());
			command.setPais(circuito.getPais());
			command.setNumVueltas(circuito.getNumVueltas());
			command.setNumCurvas(circuito.getNumCurvas());
			command.setLongVuelta(circuito.getLongVuelta());
		}
		
		return command;
	}
	
	public CircuitoCommand persisteCircuito(CircuitoCommand command) throws Exception {
		
		Circuito circuito = null;
		
		if(command != null && command.isNew()) {
			
			circuito = new Circuito();
			
		} else {
			
			try {
				
				Optional<Circuito> optional = circuitoRepository.findById(command.getId());
				
				circuito = optional.orElseThrow();
								
			} catch(Exception ex) {
				
				ex.printStackTrace();
			}
		}
		
		circuito.setNombre(command.getNombre());
		circuito.setCiudad(command.getCiudad());
		circuito.setPais(command.getPais());
		circuito.setNumCurvas(command.getNumCurvas());
		circuito.setNumVueltas(command.getNumVueltas());
		circuito.setLongVuelta(command.getLongVuelta());
		
		try {
			
			circuitoRepository.save(circuito);
			
			command.setId(circuito.getId());
			
		} catch(Exception ex) {
			
			ex.printStackTrace();
		}
		
		return command;
	}
	
	public Boolean existeCircuito(String nombre) {
		
		try {
			
			Long cuantos = circuitoRepository.countByNombreContaining(nombre);
			
			if( cuantos != null && cuantos.longValue() == 1 ) {
				
				return true;
			}
			
			return false;
			
		} catch(Exception ex) {
			
			ex.printStackTrace();
			
			return false;
		}
	}
	
	public List<CircuitoDto> listadoCircuitos() {
		
		try {
			
			List<CircuitoDto> listado = circuitoRepository.obtieneListadoCircuitoDto();
			
			return listado;
			
		} catch(Exception ex) {
			
			ex.printStackTrace();
			
			return new ArrayList<CircuitoDto>();
		}
	}
	
	public void eliminaCircuito() {
		
		try {
			
			
		} catch(Exception ex) {
			
			ex.printStackTrace();
		}
	}
	
	

}
