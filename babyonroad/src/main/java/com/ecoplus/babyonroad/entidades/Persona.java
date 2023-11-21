package com.ecoplus.babyonroad.entidades;

import java.io.Serializable;
import java.util.Objects;

public abstract class Persona implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nombre;
	private String apellidos;
	private String nif;
	private Integer telefono;
	private String correo_electronico;

	public Persona(String nombre, String apellidos, String nif, Integer telefono, String correo_electronico) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.telefono = telefono;
		this.correo_electronico = correo_electronico;
	}

	public Persona() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNif() {
		return nif;
	}

	public void setNIF(String nif) {
		this.nif = nif;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nif, apellidos, correo_electronico, nombre, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(nif, other.nif) && Objects.equals(apellidos, other.apellidos)
				&& Objects.equals(correo_electronico, other.correo_electronico) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(telefono, other.telefono);
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + nif + ", telefono=" + telefono
				+ ", correo_electronico=" + correo_electronico + "]";
	}

}
