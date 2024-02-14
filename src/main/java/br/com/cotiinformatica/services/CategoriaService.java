package br.com.cotiinformatica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cotiinformatica.dtos.queries.CategoriasDto;
import br.com.cotiinformatica.infra.cache.CategoriasCache;

@Service
public class CategoriaService {

	@Autowired
	private CategoriasCache categoriasCache;   
	
	public List<CategoriasDto> findAll(){
		
		return categoriasCache.findAll();
		
	}
	
	
}
