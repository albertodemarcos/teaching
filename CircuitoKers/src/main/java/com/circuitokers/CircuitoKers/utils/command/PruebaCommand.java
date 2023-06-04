package com.circuitokers.CircuitoKers.utils.command;

import java.io.Serializable;
import java.math.BigDecimal;

public class PruebaCommand implements Serializable {

	private static final long serialVersionUID = -6246666683681824550L;

	private String nombreCoche;
	private String nombreCircuito;
	private BigDecimal gananciaTotal;

	public String getNombreCoche() {
		return nombreCoche;
	}

	public void setNombreCoche(String nombreCoche) {
		this.nombreCoche = nombreCoche;
	}

	public String getNombreCircuito() {
		return nombreCircuito;
	}

	public void setNombreCircuito(String nombreCircuito) {
		this.nombreCircuito = nombreCircuito;
	}
	
	public BigDecimal getGananciaTotal() {
		return gananciaTotal;
	}

	public void setGananciaTotal(BigDecimal gananciaTotal) {
		this.gananciaTotal = gananciaTotal;
	}

}
