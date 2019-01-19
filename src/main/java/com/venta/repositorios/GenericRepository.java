package com.venta.repositorios;

public interface GenericRepository <T, K>{
// para evitar castin pasar id 
	public T findOne(K k);
	public Iterable<T> findAll();
	public void save();
	public void delete();
	//public void update(K k);
	
	
}
