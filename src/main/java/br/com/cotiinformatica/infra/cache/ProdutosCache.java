package br.com.cotiinformatica.infra.cache;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.cotiinformatica.dtos.queries.ProdutosDto;

@Repository
public interface ProdutosCache extends MongoRepository<ProdutosDto, Integer>{

}
