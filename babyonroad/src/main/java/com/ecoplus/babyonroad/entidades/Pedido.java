package com.ecoplus.babyonroad.entidades;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;

	private Cliente cliente;
	private Plan plan;
	private Medico medico;
	private Date fecha_creada;
	private Date fecha_pedido;
	private Servicio servicio;

	public Pedido(Cliente cliente, Plan plan, Medico medico, Date fecha_creada, Date fecha_pedido, Servicio servicio) {
		super();
		this.cliente = cliente;
		this.plan = plan;
		this.medico = medico;
		this.fecha_creada = fecha_creada;
		this.fecha_pedido = fecha_pedido;
		this.servicio = servicio;
	}

	public Pedido() {

	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Date getFecha_creada() {
		return fecha_creada;
	}

	public void setFecha_creada(Date fecha_creada) {
		this.fecha_creada = fecha_creada;
	}

	public Date getFecha_pedido() {
		return fecha_pedido;
	}

	public void setFecha_pedido(Date fecha_pedido) {
		this.fecha_pedido = fecha_pedido;
	}

	public Servicio getServicio() {
		return servicio;
	}

	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cliente, fecha_creada, fecha_pedido, medico, plan, servicio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(cliente, other.cliente) && Objects.equals(fecha_creada, other.fecha_creada)
				&& Objects.equals(fecha_pedido, other.fecha_pedido) && Objects.equals(medico, other.medico)
				&& Objects.equals(plan, other.plan) && Objects.equals(servicio, other.servicio);
	}

	@Override
	public String toString() {
		return "Pedido [cliente=" + cliente + ", plan=" + plan + ", medico=" + medico + ", fecha_creada=" + fecha_creada
				+ ", fecha_pedido=" + fecha_pedido + ", servicio=" + servicio + "]";
	}

}
