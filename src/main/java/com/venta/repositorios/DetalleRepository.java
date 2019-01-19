package com.venta.repositorios;

import com.venta.dto.Detalle;

public interface DetalleRepository {
	public Detalle findOne(Integer id);
	public Iterable<Detalle> findAll();
	public void save(Detalle detalle);
	public void delete(Detalle detalle);
}
