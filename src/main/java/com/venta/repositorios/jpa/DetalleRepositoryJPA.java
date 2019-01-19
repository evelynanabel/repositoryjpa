package com.venta.repositorios.jpa;

import com.venta.dto.Detalle;
import com.venta.repositorios.DetalleRepository;

public class DetalleRepositoryJPA extends GenericRepositoryJPA<Detalle, Integer> implements DetalleRepository {

	public DetalleRepositoryJPA() {
		super(Detalle.class);
		// TODO Auto-generated constructor stub
	}
}
