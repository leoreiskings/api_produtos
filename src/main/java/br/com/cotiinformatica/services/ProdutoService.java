package br.com.cotiinformatica.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cotiinformatica.dtos.commands.ProdutoCreateCommand;
import br.com.cotiinformatica.dtos.commands.ProdutoDeleteCommand;
import br.com.cotiinformatica.dtos.commands.ProdutoUpdateCommand;
import br.com.cotiinformatica.dtos.queries.ProdutosDto;
import br.com.cotiinformatica.entities.Produto;
import br.com.cotiinformatica.infra.cache.ProdutosCache;
import br.com.cotiinformatica.infra.repositories.CategoriaRepository;
import br.com.cotiinformatica.infra.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	/*injecao de dependencia*/
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;		

	@Autowired
	private ProdutosCache produtosCache;

	public ProdutosDto create(ProdutoCreateCommand command) {
		
		
		ModelMapper modelMapper = new ModelMapper();
		
		Produto produto = modelMapper.map(command, Produto.class);
		
		produto.setCategoria(categoriaRepository.findById(command.getIdCategoria()).get());
		
		produtoRepository.save(produto);
		
		ProdutosDto dto = modelMapper.map (produto, ProdutosDto.class);
		
		produtosCache.save(dto);
		
		return dto;
		
	}

	public ProdutosDto update(ProdutoUpdateCommand command) {

		ModelMapper modelMapper = new ModelMapper();
		
		Produto produto = modelMapper.map(command, Produto.class);
		
		produto.setCategoria(categoriaRepository.findById(command.getId()).get());
		
		//gravando o produto no banco postgres
		produto.setNome(command.getNome());
		produto.setPreco(command.getPreco());
		produto.setQuantidade(command.getQuantidade());

		//gravando o ID da categoria atrelada ao produto que está sendo gravado no banco postgres
		produto.setCategoria(categoriaRepository.findById(command.getIdCategoria()).get());
		
		//gravando o produto e com o id da categoria no postgres
		produtoRepository.save(produto);
		
		ProdutosDto dto = modelMapper.map (produto, ProdutosDto.class);

		//gravando o produto no MongoDB 
		produtosCache.save(dto);
		
		return dto;
		
	}

	public ProdutosDto delete(ProdutoDeleteCommand command) {
		
		ModelMapper modelMapper = new ModelMapper();
		
		//buscando o produto no banco
		Produto produto = produtoRepository.findById(command.getId()).get();
		
		//achou o id do produto gravado no bd postgre, ele deleta
		produtoRepository.delete(produto);
		
		
		ProdutosDto dto = modelMapper.map(produto, ProdutosDto.class);
		
		//deletando do banco do banco do mongo
		produtosCache.delete(dto);
		
		return dto;
		
	}

	public List<ProdutosDto> findAll() {
		
		//dando retorno em todos os produtos gravados no MongoDB
		return produtosCache.findAll();
		
	}

	public ProdutosDto findById(Integer id) {
		// TODO
		return produtosCache.findById(id).get();
		
	}
	

}
