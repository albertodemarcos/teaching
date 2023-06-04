package com.circuitokers.CircuitoKers.utils.command;

import java.io.Serializable;

public class CircuitoCommand implements Serializable {

	private static final long serialVersionUID = 1300206714538128080L;

	private Long id;
	private String nombre;
	private String ciudad;
	private String pais;
	private Integer numVueltas;
	private Integer longVuelta;
	private Integer numCurvas;
	
	public Boolean isNew() {
		return id == null ? Boolean.TRUE : Boolean.FALSE;
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
