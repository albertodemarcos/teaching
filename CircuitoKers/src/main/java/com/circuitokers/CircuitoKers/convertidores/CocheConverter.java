package com.circuitokers.CircuitoKers.convertidores;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.circuitokers.CircuitoKers.modelo.Coche;
import com.circuitokers.CircuitoKers.repositorios.CocheRepository;

@Component
@ConfigurationPropertiesBinding
public class CocheConverter implements Converter<String, Coche> {

	@Autowired
	private CocheRepository cocheRepository;
	
	
	@Override
	public Coche convert(String source) {
		// TODO Auto-generated method stub
		Long id = null;
		
		try {
			
			id = Long.parseLong(source);
			
			Optional<Coche> coche = cocheRepository.findById(id);
			
			return coche.orElse(null);
			
		} catch(Exception ex) {
			
			ex.printStackTrace();
		}
		
		return null;
	}

}
