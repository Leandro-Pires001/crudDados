package com.canalgeekdev.cliente.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name = "Exames")
public class Exames {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String descricao;
	private String data;
	
	@ManyToMany
	@JoinTable(name = "Escritos", joinColumns = @JoinColumn(name = "exames_id"), 
	inverseJoinColumns = @JoinColumn(name = "pessoa_id"))
	private List <Pessoa> Pessoas;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public List<Pessoa> getPessoa() {
		return Pessoas;
	}

	public void setPessoa(List<Pessoa> pessoa) {
		Pessoas = pessoa;
	}

	
	

}
