package com.circuitokers.CircuitoKers.utils.dto;

import java.io.Serializable;

public class CircuitoDto implements Serializable {

	private static final long serialVersionUID = 7714690005283765450L;

	private Long id;
	private String nombre;
	private String ciudad;
	private String pais;
	private Integer numVueltas;
	private Integer longVuelta;
	private Integer numCurvas;
	
	//Por defecto
	public CircuitoDto() {
		
	}
	
	//CircuitoRepository.obtieneListadoCircuitosAutocompletarDto
	public CircuitoDto(String nombre, String ciudad) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
	}

	//CircuitoRepository.obtieneListadoCircuitoDto
	public CircuitoDto(Long id, String nombre, String ciudad, String pais, Integer numVueltas, Integer longVuelta,
			Integer numCurvas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		this.numVueltas = numVueltas;
		this.longVuelta = longVuelta;
		this.numCurvas = numCurvas;
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

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Integer getNumVueltas() {
		return numVueltas;
	}

	public void setNumVueltas(Integer numVueltas) {
		this.numVueltas = numVueltas;
	}

	public Integer getLongVuelta() {
		return longVuelta;
	}

	public void setLongVuelta(Integer longVuelta) {
		this.longVuelta = longVuelta;
	}

	public Integer getNumCurvas() {
		return numCurvas;
	}

	public void setNumCurvas(Integer numCurvas) {
		this.numCurvas = numCurvas;
	}

}
