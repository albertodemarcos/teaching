package com.circuitokers.CircuitoKers.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.circuitokers.CircuitoKers.modelo.Coche;
import com.circuitokers.CircuitoKers.utils.dto.CocheDto;

@Repository
public interface CocheRepository extends JpaRepository<Coche, Long> {

	
	Optional<Coche> findById(Long id);
	
	Optional<Coche> findByNombreContaining(String nombre);
	
	Long countByNombreContaining(String nombre);
	
	@Query(" select new com.circuitokers.CircuitoKers.utils.dto.CocheDto(c.id, c.nombre, c.escuderia, c.potencia, c.gananciaCurva) from Coche c")
	List<CocheDto> obtieneListadoCocheDto();
	
	@Query(" select new com.circuitokers.CircuitoKers.utils.dto.CocheDto(c.nombre, c.escuderia) from Coche c")
	List<CocheDto> obtieneListadoCochesAutocompletarDto();
}
