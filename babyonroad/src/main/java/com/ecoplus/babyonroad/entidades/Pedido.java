package com.ecoplus.babyonroad.entidades;

import java.io.Serializable;
import java.sql.Date;
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
@Table(name = "pedido")
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(targetEntity = Cliente.class)
	@JoinColumn(name = "PK_cliente_PK", nullable = false)
	private Cliente cliente;
	
	@ManyToOne(targetEntity = Plan.class)
	@JoinColumn(name = "PK_plan_PK")
	private Plan plan;
	
	@ManyToOne(targetEntity = Medico.class)
	@JoinColumn(name = "PK_medico_PK", nullable = false)
	private Medico medico;
	
	@Column(name = "fecha_pedido", nullable = false)
	private Date fecha_pedido;
	
	@ManyToOne(targetEntity = Servicio.class)
	@JoinColumn(name = "PK_servicio_PK")
	private Servicio servicio;

	public Pedido(Cliente cliente, Plan plan, Medico medico, Date fecha_pedido, Servicio servicio) {
		super();
		this.cliente = cliente;
		this.plan = plan;
		this.medico = medico;
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
		return Objects.hash(cliente, fecha_pedido, id, medico, plan, servicio);
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
		return Objects.equals(cliente, other.cliente) && Objects.equals(fecha_pedido, other.fecha_pedido)
				&& Objects.equals(id, other.id) && Objects.equals(medico, other.medico)
				&& Objects.equals(plan, other.plan) && Objects.equals(servicio, other.servicio);
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", cliente=" + cliente + ", plan=" + plan + ", medico=" + medico + ", fecha_pedido="
				+ fecha_pedido + ", servicio=" + servicio + "]";
	}
	
	

}
