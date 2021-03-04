package com.canalgeekdev.cliente.model;

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
	public void salvarExames(Exames exames){
		em.getTransaction().begin();
		em.merge(exames);
		em.getTransaction().commit();
		emf.close();
	}

}
