package com.venta.repositorios;
import com.venta.dto.Producto;;

public interface ProductoRepository {
	public Producto findOne(Integer id);
	public Iterable<Producto> findAll();
	public void save(Producto producto);
	public void delete(Producto producto);
}
