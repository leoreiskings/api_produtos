package br.com.cotiinformatica.configurations;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.com.cotiinformatica.dtos.queries.CategoriasDto;
import br.com.cotiinformatica.entities.Categoria;
import br.com.cotiinformatica.infra.cache.CategoriasCache;
import br.com.cotiinformatica.infra.repositories.CategoriaRepository;

@Component
public class LoadDataConfig implements ApplicationRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;	
	
	@Autowired
	private CategoriasCache categoriasCache;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
			
		List<Categoria> categorias = new ArrayList<Categoria>();
		
		categorias.add(new Categoria(1, "Informática", "Produtos de informática", null));
		categorias.add(new Categoria(2, "Eletrônicos", "Produtos eletrônicos", null)); 
		categorias.add(new Categoria(3, "Celulares", "Celulares em geral",	null));
		categorias.add(new Categoria(4, "Games", "Jogos e Consoles", null));
		categorias.add(new Categoria(5, "Livraria",	"Livraria e papelaria em geral", null));
		categorias.add(new Categoria(6, "Outros", "Produtos diversos", null));
		
		categoriaRepository.saveAll(categorias); // dando carga no banco de dados no PostGre (tabela categoria)
		
		
		ModelMapper modelMapper = new ModelMapper();		//dando carga no BD do MongoDB
		
		// copiando e convertendo uma lista para outra e a seguir fazendo a carga de gravação no MongoDB
		List<CategoriasDto> categoriasDto = modelMapper.map(categorias, new TypeToken<List<CategoriasDto>>() {
			
		}.getType());
		
		categoriasCache.saveAll(categoriasDto);		
		
	}	
}
