package com.github.naomisoubhia.study_api.service;

import java.util.ArrayList;
import java.util.List;

import com.github.naomisoubhia.study_api_model.Pessoa;



public class PessoaService {
	private List<Pessoa> pessoas;
	
	public PessoaService(){
		load();
	} 
	
	private void load(){

		//Para criar pessoas
		pessoas = new ArrayList<>();
		Pessoa pessoa = new Pessoa();
		pessoa.setId(1L);
		pessoa.setNome("AC");
		pessoas.add(pessoa);
		
		pessoa.setId(2L);
		pessoa.setNome("Pelé");
		pessoas.add(pessoa);
		
		pessoa.setId(3L);
		pessoa.setNome("Messi");
		pessoas.add(pessoa);
		 

	}
	
	public List<Pessoa> list(){
		return pessoas;
	}
}
