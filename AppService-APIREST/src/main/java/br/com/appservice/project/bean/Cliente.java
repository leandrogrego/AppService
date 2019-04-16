package br.com.appservice.project.bean;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;

@Entity
public class Cliente extends Pessoa {

	private static final long serialVersionUID = 1L;
	@ApiModelProperty(notes="Senha de acesso do Usúario", required=true)
	private String senha;

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
