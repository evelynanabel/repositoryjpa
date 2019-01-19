package com.venta.test;

import javax.persistence.*;

import org.junit.*;
import com.venta.dto.Categoria;
import com.venta.dto.Cliente;
import com.venta.dto.Producto;

public class AddTest {
	EntityManagerFactory emf;
	EntityManager em;

	@Before
	public void iniciar() {

		emf = Persistence.createEntityManagerFactory("venta");
		em = emf.createEntityManager();

	}

	@Test
	public void addcategoria() {
		em.getTransaction().begin();
		Categoria ncat = new Categoria(1, "Bebidas espirituosas");
		Categoria ncat1 = new Categoria(2, "Bebidas normales");

		em.persist(ncat);
		em.persist(ncat1);
		em.getTransaction().commit();

		Categoria c = em.find(Categoria.class, 1);
		Categoria c2 = em.find(Categoria.class, 2);
		
		em.getTransaction().begin();
		Producto p = new Producto("Cerveza Cuzqueña", 200, c);
		Producto p1 = new Producto("Cerveza Pilsen", 250, c2);

		em.persist(p);
		em.persist(p1);
		em.getTransaction().commit();
		
		em.getTransaction().begin();
		Cliente ncli= new Cliente("Rosa", "Morales", "Av. Sal y Rosas N° 450", "12345678");
		Cliente ncli2= new Cliente("Yesica", "Rosales", "Av. Sal y Rosas N° 550", "87568328");
		em.persist(ncli);
		em.persist(ncli2);
		em.getTransaction().commit();
		

	}

}
