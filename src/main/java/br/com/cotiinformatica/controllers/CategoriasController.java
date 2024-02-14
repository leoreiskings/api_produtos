package br.com.cotiinformatica.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.queries.CategoriasDto;
import br.com.cotiinformatica.services.CategoriaService;

@RestController 
@RequestMapping("/api/categorias") //1 endpoint para 4 verbos
public class CategoriasController {
	
	// A camada de controle chama os metodos da Camada Service para fazer os metodos do CRUD
	
	/*
	 * @PostMapping public void post() { // TODO }
	 * 
	 * @PutMapping public void put() { // TODO }
	 * 
	 * @DeleteMapping public void delete() { // TODO }
	 */
	
	@Autowired
	private CategoriaService categoriaService;	
	
	@GetMapping
	public ResponseEntity<List<CategoriasDto>> getAll() { 
		
		return ResponseEntity.status(200)
				.body(categoriaService.findAll()); 
	}	
	
}
