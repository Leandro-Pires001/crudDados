package com.canalgeekdev.cliente;

import java.util.List;

import com.canalgeekdev.cliente.model.conecxaoPessoa;
import com.canalgeekdev.cliente.model.Conecxao;
import com.canalgeekdev.cliente.model.Pessoa;

public class testePessoa {
	public static void main(String[] args) {
			//salvar
	conecxaoPessoa conecxao = new conecxaoPessoa();
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Felipe Galhardo");
		pessoa.setCpf("213645258");
		pessoa.setRg("104308294");
		
	 conecxao.salvarDados(pessoa);
	 
	 	
			//atualizar
		//conecxaoPessoa pc1 = new conecxaoPessoa();
		//Pessoa dados = pc1.getId(3);
		 //dados.setNome("João Acacil");
		//pc1.salvarDados(dados);
		
		
		
			//remover
		/*Conecxao conecxao = new Conecxao();
		Pessoa dados = conecxao.getId(2);
		
		Conecxao conecxao1 = new Conecxao();
		conecxao.removerDados(dados);
		
			//lista
		conecxaoPessoa cp = new conecxaoPessoa();
		List<Pessoa> pessoas = cp.listarTodos();
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome() + pessoa.getCpf() +  pessoa.getRg());
		}
			
		*/
	}
}
