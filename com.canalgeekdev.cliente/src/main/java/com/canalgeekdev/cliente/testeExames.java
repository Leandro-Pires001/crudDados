package com.canalgeekdev.cliente;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import com.canalgeekdev.cliente.model.Exames;
import com.canalgeekdev.cliente.model.Pessoa;
import com.canalgeekdev.cliente.model.conecxaoExames;
import com.canalgeekdev.cliente.model.conecxaoPessoa;
         
public class testeExames {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conecxaoExames cne1 = new conecxaoExames();
		Exames exame1 = cne1.getId(1);
		
		conecxaoExames cne2 = new conecxaoExames();
		Exames exame2 = cne2.getId(2);
		
		List <Exames> exames = new ArrayList();
		exames.add(exame1);
		exames.add(exame2);
		conecxaoPessoa cnp = new conecxaoPessoa();
		Pessoa pessoa = cnp.getId(1);
		pessoa.setExames(exames);
		cnp.salvarDados(pessoa);
		
		/*Exames exame = new Exames();
		
  		Date data = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
		exame.setData(formato.format(data));
		
		exame.setDescricao("É um exame de Ultrasom");
		//exame.setPessoa(pessoas);
		
		cne1.salvarExames(exame);
			//atualizar
		/*conecxaoExames conecxaoExames2 = new conecxaoExames();
		Exames exameAtual = conecxaoExames2.getId(1);
		exameAtual.setDescricao("");
			//delete
		conecxaoExames conecxaoExames3 = new conecxaoExames();
		Exames exames = conecxaoExames3.getId(1);
		
		conecxaoExames conecxaoexames4 = new conecxaoExames();
		conecxaoExames3.removExame(exames);
			
		
		// listar
		/*conecxaoExames conecxaoExames4 = new conecxaoExames();
		List <Exames> exames5 = conecxaoExames4.listarTodos(); 
			for (Exames exames : exames5) {
				System.out.println(exames.getData() + exames.getDescricao());
			}
		*/
		}
		
		
	}


