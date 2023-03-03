package com.github.naomisoubhia.study_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.naomisoubhia.study_api.service.PessoaService;
import com.github.naomisoubhia.study_api_model.Pessoa;

@RestController 
@RequestMapping("/pessoas")
public class PessoaController {
	
	private PessoaService pessoaService = new PessoaService();
	
	@GetMapping
	public List<Pessoa> listAll(){
		return pessoaService.list();
	}
}
