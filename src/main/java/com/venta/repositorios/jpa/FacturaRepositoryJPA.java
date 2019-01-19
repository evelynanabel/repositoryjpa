package com.venta.repositorios.jpa;


import com.venta.dto.Factura;
import com.venta.repositorios.FacturaRepository;

public class FacturaRepositoryJPA extends GenericRepositoryJPA<Factura, Integer> implements FacturaRepository {

	public FacturaRepositoryJPA() {
		super(Factura.class);
		// TODO Auto-generated constructor stub
	}

}
