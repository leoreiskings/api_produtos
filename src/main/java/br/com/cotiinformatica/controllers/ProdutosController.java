package br.com.cotiinformatica.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtos") //1 endpoint para 4 verbos
public class ProdutosController {

	@PostMapping
	public void post() { //gravar 
		// TODO
	} 
	
	@PutMapping
	public void put() { //alterar
		// TODO
	} 
	
	@DeleteMapping
	public void delete() { // apagar
		// TODO 
		
	}
	
	@GetMapping
	public void getAll() { // recuperar todos os registros
		// TODO
	}  
	
	
}
