package com.ecoplus.babyonroad.entidades;

import java.io.Serializable;
import java.util.Objects;

public class Medico extends Persona implements Serializable {

	private static final long serialVersionUID = 1L;

	private Usuarios usuario;

	public Medico(String nombre, String apellidos, String nif, Integer telefono, String correo_electronico,
			Usuarios usuario) {
		super(nombre, apellidos, nif, telefono, correo_electronico);
		this.usuario = usuario;
	}

	public Medico() {

	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(usuario);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medico other = (Medico) obj;
		return Objects.equals(usuario, other.usuario);
	}

	@Override
	public String toString() {
		return "Medico [usuario=" + usuario + "]";
	}

}
