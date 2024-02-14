package br.com.cotiinformatica.dtos.queries;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "categorias")
public class CategoriasDto {

	@Id
	private Integer id;
	private String nome;
	private String descricao;
	
}
