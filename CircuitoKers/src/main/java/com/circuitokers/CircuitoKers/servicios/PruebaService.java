package com.circuitokers.CircuitoKers.servicios;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.circuitokers.CircuitoKers.modelo.Circuito;
import com.circuitokers.CircuitoKers.modelo.Coche;
import com.circuitokers.CircuitoKers.repositorios.CircuitoRepository;
import com.circuitokers.CircuitoKers.repositorios.CocheRepository;
import com.circuitokers.CircuitoKers.utils.command.PruebaCommand;
import com.circuitokers.CircuitoKers.utils.dto.CircuitoDto;
import com.circuitokers.CircuitoKers.utils.dto.CocheDto;

@Service
public class PruebaService {

	@Autowired
	private CocheRepository cocheRepository;
	
	@Autowired
	private CircuitoRepository circuitoRepository;
	
	
	public BigDecimal calcularGanancia(PruebaCommand command) {
		
		Coche coche = this.recuperaCoche(command.getNombreCoche());
		
		command.setNombreCoche(coche.getNombre());
		
		Circuito circuito = this.recuperaCircuito(command.getNombreCircuito());
		
		command.setNombreCircuito(circuito.getNombre());
		
		if(coche != null && circuito != null) {
			return this.calcularGananciaDeCocheYCircuito(coche.getGananciaCurva(), circuito.getNumCurvas(), circuito.getNumVueltas() );
		}
		
		return new BigDecimal("0");
	}
	
	public List<CocheDto> obtieneTodosCochesParaPrueba() {
		
		try {
			
			List<CocheDto> listado = cocheRepository.obtieneListadoCochesAutocompletarDto();
			
			if( CollectionUtils.isEmpty(listado) ) {
				
				return new ArrayList<CocheDto>(1);
			}
			
			return listado;
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return new ArrayList<CocheDto>(1);
	}
	
	public List<CircuitoDto> obtieneTodosCircuitosParaPrueba() {
		
		try {
			
			List<CircuitoDto> listado = circuitoRepository.obtieneListadoCircuitosAutocompletarDto();
			
			if( CollectionUtils.isEmpty(listado) ) {
				
				return new ArrayList<CircuitoDto>(1); 
			}
			
			return listado;
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return new ArrayList<CircuitoDto>(1); 
	}
	
	
	private BigDecimal calcularGananciaDeCocheYCircuito(Integer gananciaCurva, Integer numCurvas, Integer numVueltas) {
		
		Integer gananciaTotal = gananciaCurva.intValue() * numCurvas.intValue() * numVueltas.intValue();
		
		return new BigDecimal(gananciaTotal);
	}
	
	private Coche recuperaCoche(String nombreCoche) {
		
		try {
			
			Optional<Coche> coche = cocheRepository.findByNombreContaining(nombreCoche);
			
			return coche.orElse(null);
			
		} catch(Exception ex) {
			
			ex.printStackTrace();
			
			return null;
		}
	}
	
	private Circuito recuperaCircuito(String nombreCircuito) {
		
		try {
			
			Optional<Circuito> circuito = circuitoRepository.findByNombreContaining(nombreCircuito);
			
			return circuito.orElse(null);
			
		} catch(Exception ex) {
			
			ex.printStackTrace();
			
			return null;
		}
	}
}
