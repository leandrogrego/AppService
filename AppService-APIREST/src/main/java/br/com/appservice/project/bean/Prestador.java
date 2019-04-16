package br.com.appservice.project.bean;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Prestador extends Pessoa {

	private static final long serialVersionUID = 1L;
	@ApiModelProperty(notes="Senha de acesso do Usúario", required=true)
	private String senha;
	@ApiModelProperty(notes="Pontuação por serviço", required=true)
	private int pontuacao;

	/**
	 * Muitos prestadores para muitos serviços
	 */
	@ManyToMany(cascade = CascadeType.ALL)
	@ApiModelProperty(notes="Listas de serviço", required=true)
	private List<Servico> servicos;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}
}
