package com.circuitokers.CircuitoKers.convertidores;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.circuitokers.CircuitoKers.modelo.Circuito;
import com.circuitokers.CircuitoKers.repositorios.CircuitoRepository;

@Component
@ConfigurationPropertiesBinding
public class CircuitoConverter implements Converter<String, Circuito> {

	@Autowired
	private CircuitoRepository circuitoRepository;	
	
	
	@Override
	public Circuito convert(String source) {
		// TODO Auto-generated method stub
		Long id = null;
		try {
			
			id = Long.parseLong(source);
			
			Optional<Circuito> circuito = circuitoRepository.findById(id);
			
			return circuito.orElseGet(null);
		
		} catch(Exception ex) {
			
			ex.printStackTrace();
		}
		
		return null;
	}

}
