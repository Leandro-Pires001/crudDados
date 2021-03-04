package com.canalgeekdev.cliente;

import java.util.List;

import com.canalgeekdev.cliente.model.conecxaoPessoa;
import com.canalgeekdev.cliente.model.Pessoa;

public class testePessoa {
	public static void main(String[] args) {
			//salvar
		conecxaoPessoa conecxao = new conecxaoPessoa();
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Anderson Silva");
		pessoa.setCpf("01341933013");
		pessoa.setRg("20083401934");
		
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
