package com.ecoplus.babyonroad.entidades;

import java.io.Serializable;
import java.util.Objects;

public class Cliente extends Persona implements Serializable {

	private static final long serialVersionUID = 1L;

	private Direccion direccion;
	private Usuarios usuario;

	public Cliente(String nombre, String apellidos, String nif, Integer telefono, String correo_electronico,
			Direccion direccion, Usuarios usuario) {
		super(nombre, apellidos, nif, telefono, correo_electronico);
		this.direccion = direccion;
		this.usuario = usuario;
	}

	public Cliente() {

	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
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
		result = prime * result + Objects.hash(direccion, usuario);
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
		Cliente other = (Cliente) obj;
		return Objects.equals(direccion, other.direccion) && Objects.equals(usuario, other.usuario);
	}

	@Override
	public String toString() {
		return "Cliente [direccion=" + direccion + ", usuario=" + usuario + "]";
	}

}
