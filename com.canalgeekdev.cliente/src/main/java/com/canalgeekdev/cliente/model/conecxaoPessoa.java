package com.canalgeekdev.cliente.model;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class conecxaoPessoa {

	EntityManagerFactory emf;
	EntityManager em;

	public conecxaoPessoa() {
		emf = Persistence.createEntityManagerFactory("pessoa");
		em = emf.createEntityManager();
	}
	
	public Pessoa getId(int Id) {
		em.getTransaction().begin();
		Pessoa dados = em.find(Pessoa.class, Id);
		em.getTransaction().commit();
		
		return dados;
	}

	public void salvarDados(Pessoa dados) {
		em.getTransaction().begin();
		em.merge(dados);
		em.getTransaction().commit();
		emf.close();
	}

	public void removerDados(Pessoa dados) {
		em.getTransaction().begin();
		em.remove(dados);
		em.getTransaction().commit();
		emf.close();
	}

	
	public List<Pessoa> listarTodos(){
		em.getTransaction().begin();
		javax.persistence.Query list = em.createQuery("select dados from Dados dados");
		List<Pessoa> pessoas = list.getResultList();
		em.getTransaction().commit();
		emf.close();
		return pessoas;
	}  

}
