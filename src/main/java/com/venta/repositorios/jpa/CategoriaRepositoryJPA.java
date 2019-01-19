package com.venta.repositorios.jpa;

import com.venta.dto.Categoria;
import com.venta.repositorios.CategoriaRepository;

public class CategoriaRepositoryJPA extends GenericRepositoryJPA<Categoria,Integer> implements CategoriaRepository {

	public CategoriaRepositoryJPA() {
		super(Categoria.class);
		// TODO Auto-generated constructor stub
	}
	
}