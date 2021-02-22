package com.canalgeekdev.cliente.model;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conecxao {

	EntityManagerFactory emf;
	EntityManager em;

	public Conecxao() {
		emf = Persistence.createEntityManagerFactory("pessoa");
		em = emf.createEntityManager();
	}
	
	public Dados getId(int Id) {
		em.getTransaction().begin();
		Dados dados = em.find(Dados.class, Id);
		em.getTransaction().commit();
		
		return dados;
	}

	public void salvarDados(Dados dados) {
		em.getTransaction().begin();
		em.merge(dados);
		em.getTransaction().commit();
		emf.close();
	}

	public void removerDados(Dados dados) {
		em.getTransaction().begin();
		em.remove(dados);
		em.getTransaction().commit();
		emf.close();
	}

	
	public List<Dados> listarTodos(){
		em.getTransaction().begin();
		javax.persistence.Query list = em.createQuery("select dados from Dados dados");
		List<Dados> pessoas = list.getResultList();
		em.getTransaction().commit();
		emf.close();
		return pessoas;
	}  

}
