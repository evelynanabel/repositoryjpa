package com.venta.repositorios;

import com.venta.dto.Factura;

public interface FacturaRepository {
	public Factura findOne(Integer id);
	public Iterable<Factura> findAll();
	public void save(Factura factura);
	public void delete(Factura factura);

}
