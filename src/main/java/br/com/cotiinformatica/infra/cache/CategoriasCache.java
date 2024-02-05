package br.com.cotiinformatica.infra.cache;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.cotiinformatica.dtos.queries.CategoriasDto;

@Repository
public interface CategoriasCache extends MongoRepository<CategoriasDto, Integer>{

}
