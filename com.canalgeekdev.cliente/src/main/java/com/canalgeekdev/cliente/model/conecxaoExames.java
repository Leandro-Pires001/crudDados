package com.canalgeekdev.cliente.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class conecxaoExames {
	
	EntityManager em;
	EntityManagerFactory emf;
	
	public conecxaoExames() {
		emf = Persistence.createEntityManagerFactory("pessoa");
		em = emf.createEntityManager();
	}
	public Exames getId(int Id) {
		em.getTransaction().begin();
		Exames exame = em.find(Exames.class, Id);
		em.getTransaction().commit();
		
		return exame;
	}
	public void salvarExames(Exames exames){
		em.getTransaction().begin();
		em.merge(exames);
		em.getTransaction().commit();
		emf.close();
	}
	public void removExame(Exames exames){
		em.getTransaction().begin();
		em.remove(exames);
		em.getTransaction().commit();
		emf.close();
	}
	public List<Exames> listarTodos(){
		em.getTransaction().begin();
		javax.persistence.Query list = em.createQuery("select exames from Exames exames");
		List<Exames> exames = list.getResultList();
		em.getTransaction().commit();
		
		return exames;
	}	
}
