package com.ecoplus.babyonroad.entidades;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "medico")
public class Medico implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;
	
	@Column(name = "apellidos", nullable = false, length = 100)
	private String apellidos;
	
	@Column(name = "nif", unique = true ,nullable = false, length = 9)
	private String nif;
	
	@Column(name = "telefono", nullable = false, length = 9)
	private Integer telefono;
	
	@Column(name = "correo_electronico", nullable = false)
	private String correo_electronico;
	
	@OneToOne(targetEntity = Usuarios.class)
	@JoinColumn(name = "PK_Usuario_PK")
	private Usuarios usuario;

	public Medico(String nombre, String apellidos, String nif, Integer telefono, String correo_electronico,
			Usuarios usuario) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.telefono = telefono;
		this.correo_electronico = correo_electronico;
		this.usuario = usuario;
	}

	public Medico() {

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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
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
		return Objects.hash(apellidos, correo_electronico, id, nif, nombre, telefono, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medico other = (Medico) obj;
		return Objects.equals(apellidos, other.apellidos)
				&& Objects.equals(correo_electronico, other.correo_electronico) && Objects.equals(id, other.id)
				&& Objects.equals(nif, other.nif) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(telefono, other.telefono) && Objects.equals(usuario, other.usuario);
	}

	@Override
	public String toString() {
		return "Medico [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + ", telefono="
				+ telefono + ", correo_electronico=" + correo_electronico + ", usuario=" + usuario + "]";
	}

	

}
