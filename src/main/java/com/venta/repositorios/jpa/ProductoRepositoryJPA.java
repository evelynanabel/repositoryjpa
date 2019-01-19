package com.venta.repositorios.jpa;

import com.venta.dto.Producto;
import com.venta.repositorios.ProductoRepository;

public class ProductoRepositoryJPA extends GenericRepositoryJPA<Producto, Integer> implements ProductoRepository {

	 
	public ProductoRepositoryJPA() {
		super (Producto.class);
		// TODO Auto-generated constructor stub
	}
	

}
