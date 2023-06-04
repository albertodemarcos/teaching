package com.circuitokers.CircuitoKers.utils.dto;

import java.io.Serializable;

public class CocheDto implements Serializable {

	private static final long serialVersionUID = 7243568382796455441L;
	
	private Long id;
	private String nombre;
	private String escuderia;
	private Integer potencia;
	private Integer gananciaCurva;
	
	//Por defecto
	public CocheDto() {
		
	}
	
	//CocheRepository.obtieneListadoCochesAutocompletarDto
	public CocheDto(String nombre, String escuderia) {
		super();
		this.nombre = nombre;
		this.escuderia = escuderia;
	}
	
	//CocheRepository.obtieneListadoCocheDto
	public CocheDto(Long id, String nombre, String escuderia, Integer potencia, Integer gananciaCurva) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.escuderia = escuderia;
		this.potencia = potencia;
		this.gananciaCurva = gananciaCurva;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	public Integer getPotencia() {
		return potencia;
	}

	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}

	public Integer getGananciaCurva() {
		return gananciaCurva;
	}

	public void setGananciaCurva(Integer gananciaCurva) {
		this.gananciaCurva = gananciaCurva;
	}
	
	
	

}
