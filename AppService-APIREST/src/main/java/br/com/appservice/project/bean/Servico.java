package br.com.appservice.project.bean;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Servico extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	@ApiModelProperty(notes="Nome do servico prestado", required=true)
	private String nome;
	@ApiModelProperty(notes="Descrição, detalhes do serviço", required=true)
	private String descricao;

	/**
	 * Muitos prestadores para muitos serviços
	 */
	@ManyToMany(mappedBy = "servicos")
	@ApiModelProperty(notes="Prestadores do serviço", required=true)
	private List<Prestador> prestadores;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
