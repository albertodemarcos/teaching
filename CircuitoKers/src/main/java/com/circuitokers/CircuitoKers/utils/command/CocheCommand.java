package com.circuitokers.CircuitoKers.utils.command;

import java.io.Serializable;

public class CocheCommand implements Serializable {

	private static final long serialVersionUID = -3090225236415672459L;

	private Long id;
	private String nombre;
	private String escuderia;
	private Integer potencia;
	private Integer gananciaCurva;
	
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
