package com.ecoplus.babyonroad.entidades;

import java.io.Serializable;
import java.util.Objects;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuarios implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "usuario" , unique = true)
	private String nombre_Usuario;
	
	@Column(name = "password")
	private String contrasena;
	
	@ManyToOne(targetEntity = RolModel.class)
	@JoinColumn(name = "PK_rol_PK", nullable = false)
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(contrasena, id, nombre_Usuario, rol);
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
		return Objects.equals(contrasena, other.contrasena) && Objects.equals(id, other.id)
				&& Objects.equals(nombre_Usuario, other.nombre_Usuario) && Objects.equals(rol, other.rol);
	}

	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", nombre_Usuario=" + nombre_Usuario + ", contrasena=" + contrasena + ", rol="
				+ rol + "]";
	}

	
}
