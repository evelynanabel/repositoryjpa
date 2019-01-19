package com.venta.repositorios.jpa;

import com.venta.dto.Cliente;

import com.venta.repositorios.ClienteRepository;

public class ClienteRepositoryJPA extends GenericRepositoryJPA<Cliente, Integer> implements ClienteRepository {

	public ClienteRepositoryJPA() {
		super(Cliente.class);
		// TODO Auto-generated constructor stub
	}

	

}
