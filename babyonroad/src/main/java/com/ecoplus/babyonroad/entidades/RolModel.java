package com.ecoplus.babyonroad.entidades;

import java.io.Serializable;
import java.util.Objects;
import jakarta.persistence.Entity;

@Entity
public class RolModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String tipoRol;

	public RolModel() {

	}

	public RolModel(String tipoRol) {
		super();
		this.tipoRol = tipoRol;
	}

	public String getTipoRol() {
		return tipoRol;
	}

	public void setTipoRol(String tipoRol) {
		this.tipoRol = tipoRol;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(tipoRol);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RolModel other = (RolModel) obj;
		return Objects.equals(tipoRol, other.tipoRol);
	}

	@Override
	public String toString() {
		return "RolModel [tipoRol=" + tipoRol + "]";
	}

}
