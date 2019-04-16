package br.com.appservice.project.bean;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;

@Entity
public class Endereco extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	@ApiModelProperty(notes="Rua do Usúario", required=true)
	private String Logradouro;
	@ApiModelProperty(notes="Localidade", required=true)
	private String bairro;
	@ApiModelProperty(notes="Localidade", required=true)
	private String cidade;
	@ApiModelProperty(notes="Estado residencial", required=true)
	private String uf;
	@ApiModelProperty(notes="Complemento de dados", required=true)
	private String referencia;

	public String getLogradouro() {
		return Logradouro;
	}

	public void setLogradouro(String logradouro) {
		Logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
}
