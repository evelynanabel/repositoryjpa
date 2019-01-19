

package com.venta.test;
import org.junit.Before;
import org.junit.Test;
import com.venta.dto.Categoria;
import com.venta.dto.Cliente;
import com.venta.dto.Factura;
import com.venta.dto.Producto;
import com.venta.repositorios.jpa.CategoriaRepositoryJPA;
import com.venta.repositorios.jpa.ClienteRepositoryJPA;
import com.venta.repositorios.jpa.DetalleRepositoryJPA;
import com.venta.repositorios.jpa.FacturaRepositoryJPA;
import com.venta.repositorios.jpa.ProductoRepositoryJPA;

public class VentaRepositoryTest extends JPAUnitTest{
	ProductoRepositoryJPA repoprod;
	CategoriaRepositoryJPA repocat;
	ClienteRepositoryJPA repocli;
	FacturaRepositoryJPA repofat;
	DetalleRepositoryJPA repodet;
	

	@Before
	public void setup() {
		super.setup();
		repoprod= new ProductoRepositoryJPA();
		repoprod.setEm(em);
		repocat = new CategoriaRepositoryJPA();
		repocat.setEm(em);
		
		repocli = new ClienteRepositoryJPA();
		repocli.setEm(em);
		
		repofat = new FacturaRepositoryJPA();
		repofat.setEm(em);
		
		repodet = new DetalleRepositoryJPA();
		repodet.setEm(em);
		
		
	}
	

	@Test
	public void insertar() {
		em.getTransaction().begin();
		Categoria ncat = new Categoria(1,"Bebidas Espirituosas");
		repocat.save(ncat);
		em.getTransaction().commit();
	
	
	Categoria c = repocat.findOne(1);
		em.getTransaction().begin();
		Producto p = new Producto("Pisco Queirolo",100,c);
		repoprod.save(p);
		em.getTransaction().commit();
		
		// para el cliente
		em.getTransaction().begin();
		Cliente ncli = new Cliente("Laura", "Luna", "Jr. Las Flores", "12345678");
		//String nombre, String apellido, String direccion, String dni

		repocli.save(ncli);
		em.getTransaction().commit();
		
		// para la factura
		Cliente cli = repocli.findOne(1);
				em.getTransaction().begin();
				Factura nfat = new Factura(cli, "19-01-2018",1);
				//(Cliente cliente, String fecha, int nrofactura)
				repofat.save( nfat);
				em.getTransaction().commit();
				
				// para la detalle
				Factura fa = repofat.findOne(1);
				Producto pr = repoprod.findOne(1);
						em.getTransaction().begin();
						Detalle ndet = new Detalle(fa, 2.5,10, pr);
						//Factura factura, double preciounit, int cantidad,  Producto producto_id
						repodet.save(ndet);
						em.getTransaction().commit();
	}
}