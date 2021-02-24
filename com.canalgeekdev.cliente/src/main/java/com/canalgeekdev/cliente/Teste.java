package com.canalgeekdev.cliente;

import java.util.List;

import com.canalgeekdev.cliente.model.Conecxao;
import com.canalgeekdev.cliente.model.Pessoa;

public class Teste {
	public static void main(String[] args) {
			//salvar
		Conecxao conecxao = new Conecxao();
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Gustavo Pinho");
		pessoa.setCpf("01341931014");
		pessoa.setRg("20083402034");
		
	 conecxao.salvarDados(pessoa);
		
			//atualizar
		//Conecxao conecxao = new Conecxao();
		
		//Dados dados = conecxao.getId(3);
		// dados.setNome("João Acacil");
		//conecxao.salvarDados(dados);
		
		
		
			//remover
		//Conecxao conecxao = new Conecxao();
		//Dados dados = conecxao.getId(2);
		
		//Conecxao conecxao1 = new Conecxao();
		//conecxao.removerDados(dados);
		
			//lista
		//List<Dados> dados = conecxao.listarTodos();
		
		//for (Dados dados2 : dados) {
			//System.out.println(dados2.getNome() + dados2.getCpf() +  dados2.getRg());
		//}
	}
}
