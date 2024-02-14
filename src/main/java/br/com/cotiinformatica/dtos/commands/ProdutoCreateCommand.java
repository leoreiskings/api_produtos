package br.com.cotiinformatica.dtos.commands;

import java.math.BigDecimal;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ProdutoCreateCommand {

	@Size(min = 8, max = 150, message = "Nome deve ter de 8 a 100 caracteres.")
	@NotBlank(message = "Nome é obrigatório.") 
	private String nome;
	
	@Size(min = 8, max = 150, message="Descrição deveter de 8 a 250 caracteres.")
	@NotBlank(message = "Descrição é obrigatório.")	
	private String descricao;
	
	@Min(value = 1, message = "Preço deve ser maior ou igual a 1.")
	private BigDecimal preco;
	
	@Min(value = 1, message="Quantidade deve sermaior ou igual a 1.")
	private Integer quantidade;
	
	@Min(value = 1, message="Id da categoriadeve ser maior ou igual a 1.")
	private Integer idCategoria;

}
