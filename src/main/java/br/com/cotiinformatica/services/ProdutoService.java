package br.com.cotiinformatica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cotiinformatica.dtos.commands.ProdutoCreateCommand;
import br.com.cotiinformatica.dtos.commands.ProdutoDeleteCommand;
import br.com.cotiinformatica.dtos.commands.ProdutoUpdateCommand;
import br.com.cotiinformatica.dtos.queries.ProdutosDto;
import br.com.cotiinformatica.infra.cache.ProdutosCache;
import br.com.cotiinformatica.infra.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private ProdutosCache produtosCache;

	public void create(ProdutoCreateCommand command) {
		// TODO
	}

	public void update(ProdutoUpdateCommand command) {
		// TODO
	}

	public void delete(ProdutoDeleteCommand command) {
		// TODO
	}

	public List<ProdutosDto> findAll() {
		// TODO
		return null;
	}

	public ProdutosDto findById(Integer id) {
		// TODO
		return null;
	}

}
