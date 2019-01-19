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
	@Table(name="detalle")

public class Detalle implements Serializable {
private static final long serialVersionUID = 1L;
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

private int id;
	
	
	private double preciounit;
	private int cantidad;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name="factura_id")
	private Factura factura;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn(name="producto_id")
	private Producto producto;
	
	

	

	public Detalle(int id) {
		super();
		this.id = id;
	}

	public Detalle(Factura factura, double preciounit, int cantidad,  Producto producto_id) {
		super();
		this.factura = factura;
		this.preciounit = preciounit;
		this.cantidad = cantidad;
		
		this.producto = producto_id;
	}

	public double getPreciounit() {
		return preciounit;
	}

	public void setPreciounit(double preciounit) {
		this.preciounit = preciounit;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cantidad;
		result = prime * result + ((factura == null) ? 0 : factura.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preciounit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((producto == null) ? 0 : producto.hashCode());
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
		Detalle other = (Detalle) obj;
		if (cantidad != other.cantidad)
			return false;
		if (factura == null) {
			if (other.factura != null)
				return false;
		} else if (!factura.equals(other.factura))
			return false;
		
		if (Double.doubleToLongBits(preciounit) != Double.doubleToLongBits(other.preciounit))
			return false;
		if (producto == null) {
			if (other.producto != null)
				return false;
		} else if (!producto.equals(other.producto))
			return false;
		return true;
	}
	

	

}

