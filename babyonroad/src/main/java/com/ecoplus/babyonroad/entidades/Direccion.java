package com.ecoplus.babyonroad.entidades;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;

@Entity
public class Direccion implements Serializable {

	private static final long serialVersionUID = 1L;

	private String calle;
	private Integer numero;
	private String localidad;
	private String provincia;

	public Direccion(String calle, Integer numero, String localidad, String provincia) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
		this.provincia = provincia;
	}

	public Direccion() {

	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(calle, localidad, numero, provincia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Direccion other = (Direccion) obj;
		return Objects.equals(calle, other.calle) && Objects.equals(localidad, other.localidad)
				&& Objects.equals(numero, other.numero) && Objects.equals(provincia, other.provincia);
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", numero=" + numero + ", localidad=" + localidad + ", provincia="
				+ provincia + "]";
	}

}
