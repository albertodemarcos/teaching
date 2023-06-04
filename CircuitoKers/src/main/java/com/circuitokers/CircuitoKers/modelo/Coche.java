package com.circuitokers.CircuitoKers.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Coche implements Serializable {

	private static final long serialVersionUID = 8290886752319379299L;

	private Long id;
	private String nombre;
	private String escuderia;
	private Integer potencia;
	private Integer gananciaCurva;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COCHE_SEQ")
	@SequenceGenerator(name="COCHE_SEQ",sequenceName="SEQUENCE_COCHE", allocationSize=1)
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
