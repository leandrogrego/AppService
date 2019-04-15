package br.com.appservice.project.bean;

import javax.persistence.Entity;

@Entity
public class Telefone extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	private String numero;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
}
