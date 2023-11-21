package com.ecoplus.babyonroad.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Servicio implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nombre;
	private BigDecimal precio;

	public Servicio(String nombre, BigDecimal precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public Servicio() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Servicio other = (Servicio) obj;
		return Objects.equals(nombre, other.nombre) && Objects.equals(precio, other.precio);
	}

	@Override
	public String toString() {
		return "Servicio [nombre=" + nombre + ", precio=" + precio + "]";
	}

}
