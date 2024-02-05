package br.com.cotiinformatica.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	
	@Column(length = 100, nullable = false)
	private String nome;
	
	@Column(length = 250, nullable = false)
	private String descricao;
	
	@Column(nullable = false, precision = 18, scale = 2) //18 digitos com 2 casas decimais
	private BigDecimal preco;
	
	@Column(nullable = false)
	private Integer quantidade;
	
	@ManyToOne //muitos produtos para 1 categoria
	@JoinColumn(name = "idcategoria", nullable = false)
	private Categoria categoria;
	
}
