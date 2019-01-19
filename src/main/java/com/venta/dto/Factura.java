package com.venta.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="factura")

public class Factura implements Serializable{
private static final long serialVersionUID = 1L;
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

private int id;

	
	public Factura(int id) {
	super();
	this.id = id;
}

	private String fecha;
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private int nrofactura;

	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name="idcliente")
	private Cliente cliente;
	
	

	
	public Factura(Cliente cliente, String fecha, int nrofactura) {
		super();
		this.cliente = cliente;
		this.fecha = fecha;
		this.nrofactura = nrofactura;
		
	}

	

	
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getNrofactura() {
		return nrofactura;
	}

	public void setNrofactura(int nrofactura) {
		this.nrofactura = nrofactura;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + nrofactura;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factura other = (Factura) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (id != other.id)
			return false;
		if (nrofactura != other.nrofactura)
			return false;
		return true;
	}
	
	
	
}



