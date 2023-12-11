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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente  implements Serializable {

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
	
	@ManyToOne(targetEntity = Direccion.class)
	@JoinColumn(name = "PK_Direccion_PK")
	private Direccion direccion;

	public Cliente(String nombre, String apellidos, String nif, Integer telefono, String correo_electronico,
			Usuarios usuario, Direccion direccion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.telefono = telefono;
		this.correo_electronico = correo_electronico;
		this.usuario = usuario;
		this.direccion = direccion;
	}

	public Cliente() {

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
	
	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, correo_electronico, direccion, id, nif, nombre, telefono, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(apellidos, other.apellidos)
				&& Objects.equals(correo_electronico, other.correo_electronico)
				&& Objects.equals(direccion, other.direccion) && Objects.equals(id, other.id)
				&& Objects.equals(nif, other.nif) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(telefono, other.telefono) && Objects.equals(usuario, other.usuario);
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + ", telefono="
				+ telefono + ", correo_electronico=" + correo_electronico + ", usuario=" + usuario + ", direccion="
				+ direccion + "]";
	}

	

	
	

}
