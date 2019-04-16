package br.com.appservice.project.bean;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;

@Entity
public class Telefone extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	@ApiModelProperty(notes="Numero de celular ou telefone", required=true)
	private String numero;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}
