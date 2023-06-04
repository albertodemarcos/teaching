package com.circuitokers.CircuitoKers.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.circuitokers.CircuitoKers.modelo.Circuito;
import com.circuitokers.CircuitoKers.utils.dto.CircuitoDto;

@Repository
public interface CircuitoRepository extends JpaRepository<Circuito, Long> {

	
	Optional<Circuito> findById(Long id);
	
	Optional<Circuito> findByNombreContaining(String nombre);
	
	Long countByNombreContaining(String nombre);
	
	@Query(" select new com.circuitokers.CircuitoKers.utils.dto.CircuitoDto(c.id, c.nombre, c.ciudad, c.pais, c.numVueltas, c.longVuelta, c.numCurvas) from Circuito c")
	List<CircuitoDto> obtieneListadoCircuitoDto();
	
	@Query(" select new com.circuitokers.CircuitoKers.utils.dto.CircuitoDto(c.nombre, c.ciudad) from Circuito c")
	List<CircuitoDto> obtieneListadoCircuitosAutocompletarDto();
}
