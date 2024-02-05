package br.com.cotiinformatica.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.commands.ProdutoCreateCommand;
import br.com.cotiinformatica.dtos.commands.ProdutoUpdateCommand;
import br.com.cotiinformatica.dtos.queries.ProdutosDto;

@RestController
@RequestMapping("/api/produtos") //1 endpoint para 4 verbos
public class ProdutosController {

	@PostMapping
	public ResponseEntity<Object> post(@RequestBody ProdutoCreateCommand command) { //gravar 
		// TODO
		return null;
	} 
	
	@PutMapping
	public ResponseEntity<Object> put(@RequestBody ProdutoUpdateCommand command) { //alterar
		// TODO
		return null;
	} 
	
	@DeleteMapping("{id}")
	public ResponseEntity<Object> delete(@PathVariable("id") Integer id) { // apagar
		// TODO
		return null; 
		
	}
	
	  
	@GetMapping
	public ResponseEntity<List<ProdutosDto>> getAll() {
	
		// TODO
	return null;
	}
	
	
	
	@GetMapping("{id}")
	public ResponseEntity<ProdutosDto> getById(@PathVariable("id") Integer id) {
	
		// TODO
	return null;
	
	}
	
	
	
	
	
	
	
	
}
