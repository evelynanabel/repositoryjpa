package com.venta.repositorios.jpa;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.venta.repositorios.GenericRepository;

public class GenericRepositoryJPA<T, K> implements GenericRepository<T, K> {
	
	private EntityManager em;
	private Class<T> tipo;

	public GenericRepositoryJPA(Class<T> tipo) {
		this.tipo =tipo;
	}

	public T findOne(K k) {
		// TODO consulta pa+ra cualquier clase
		return em.find(tipo, k);
	}

	public Iterable<T> findAll() {
		// TODO Auto-generated method stub
		CriteriaBuilder cb = this.em.getCriteriaBuilder();
		CriteriaQuery<T> consulta = cb.createQuery(tipo);
		Root<T> raiz = consulta.from(tipo);
		consulta.select(raiz);
		TypedQuery<T> miconsulta =  em.createQuery(consulta);
		return miconsulta.getResultList();
	
	}

	public void save(T tipo) {
		// TODO Auto-generated method stub
		em.persist(tipo);
		
	}

	public void delete(T tipo) {
		// TODO Auto-generated method stub
		em.remove(tipo);
		
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public void save() {
		// TODO Auto-generated method stub
		
	}

	public void delete() {
		// TODO Auto-generated method stub
		
	}

	

	

}
