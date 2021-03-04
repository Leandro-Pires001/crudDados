package com.canalgeekdev.cliente;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.canalgeekdev.cliente.model.Exames;
import com.canalgeekdev.cliente.model.Pessoa;
import com.canalgeekdev.cliente.model.conecxaoExames;

public class testeExames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conecxaoExames conecxao = new conecxaoExames();
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setId(1);
		Pessoa pessoa2 = new Pessoa();
		pessoa1.setId(2);
		
		List <Pessoa> pessoas = new ArrayList();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		
		Exames exame = new Exames();
		
		Date data = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
		exame.setData(formato.format(data));
		
		exame.setDescricao("É um exame de para a vericação de glicose no sangue");
		exame.setPessoa(pessoas);
		
		conecxao.salvarExames(exame);
		
				
	}

}
