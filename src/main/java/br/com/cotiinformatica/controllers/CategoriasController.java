package br.com.cotiinformatica.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.queries.CategoriasDto;

@RestController 
@RequestMapping("/api/categorias") //1 endpoint para 4 verbos
public class CategoriasController {

	/*
	 * @PostMapping public void post() { // TODO }
	 * 
	 * @PutMapping public void put() { // TODO }
	 * 
	 * @DeleteMapping public void delete() { // TODO }
	 */
	
	@GetMapping
	public ResponseEntity<CategoriasDto> getAll() { 
		// TODO
		return null;
	}
	
	
	
	
}
