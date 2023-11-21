package com.ecoplus.babyonroad.entidades;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;

@Entity
public class Usuarios implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nombre_Usuario;
	private String contrasena;
	private RolModel rol;

	public Usuarios(String nombre_Usuario, String contrasena, RolModel rol) {
		super();
		this.nombre_Usuario = nombre_Usuario;
		this.contrasena = contrasena;
		this.rol = rol;
	}

	public Usuarios() {

	}

	public String getNombre_Usuario() {
		return nombre_Usuario;
	}

	public void setNombre_Usuario(String nombre_Usuario) {
		this.nombre_Usuario = nombre_Usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public RolModel getRol() {
		return rol;
	}

	public void setRol(RolModel rol) {
		this.rol = rol;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(rol, contrasena, nombre_Usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuarios other = (Usuarios) obj;
		return Objects.equals(rol, other.rol) && Objects.equals(contrasena, other.contrasena)
				&& Objects.equals(nombre_Usuario, other.nombre_Usuario);
	}

	@Override
	public String toString() {
		return "Usuarios [nombre_Usuario=" + nombre_Usuario + ", contrasena=" + contrasena + ", Rol=" + rol + "]";
	}

}
