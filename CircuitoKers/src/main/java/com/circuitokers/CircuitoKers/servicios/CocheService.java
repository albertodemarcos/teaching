package com.circuitokers.CircuitoKers.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.circuitokers.CircuitoKers.modelo.Coche;
import com.circuitokers.CircuitoKers.repositorios.CocheRepository;
import com.circuitokers.CircuitoKers.utils.command.CocheCommand;
import com.circuitokers.CircuitoKers.utils.dto.CocheDto;

@Service
public class CocheService {

	@Autowired
	private CocheRepository cocheRepository;
	
	public CocheCommand obtieneCoche(Coche coche) {
		
		CocheCommand command = new CocheCommand();
		
		if( coche != null) {
			
			command.setId(coche.getId());
			command.setNombre(coche.getNombre());
			command.setEscuderia(coche.getEscuderia());
			command.setPotencia(coche.getPotencia());
			command.setGananciaCurva(coche.getGananciaCurva());
		}
		
		return command;
	}
	
	public CocheCommand persisteCoche(CocheCommand command) {
		
		Coche coche = null;
		
		if(command != null && command.isNew()) {
			
			coche = new Coche();
			
		} else {
			
			try {
				
				Optional<Coche> optional = cocheRepository.findById(command.getId());
				
				coche = optional.orElseThrow();
			
			} catch(Exception ex) {
				
				ex.printStackTrace();
			}
		}

		coche.setNombre(command.getNombre());
		coche.setPotencia(command.getPotencia());
		coche.setEscuderia(command.getEscuderia());
		coche.setGananciaCurva(command.getGananciaCurva());
		
		try {
			
			cocheRepository.save(coche);
			
			command.setId(coche.getId());
			
		} catch(Exception ex) {
			
			ex.printStackTrace();
		}
		
		return command;
	}
	
	public Boolean existeCoche(String nombre ) {
		
		try {
			
			Long cuantos = cocheRepository.countByNombreContaining(nombre);
			
			if( cuantos != null && cuantos.longValue() == 1 ) {
				
				return true;
			}
			
			return false;
			
		} catch(Exception ex) {
			
			ex.printStackTrace();
			
			return false;
		}
	}
	
	public List<CocheDto> listadoCoches() {
		
		try {
			
			List<CocheDto> listado = cocheRepository.obtieneListadoCocheDto();
			
			return listado;
			
		} catch(Exception ex) {
			
			ex.printStackTrace();
			
			return new ArrayList<CocheDto>();
		}
	}
	
	public void eliminaCoche() {
		
		try {
			
		} catch(Exception ex) {
			
			ex.printStackTrace();
		}
	}
	
}
