package br.com.appservice.project.bean;

import javax.persistence.Entity;

@Entity
public class Prestador extends Pessoa {
	
	private static final long serialVersionUID = 1L;
	private String senha;
	private int pontuacao;
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
}
