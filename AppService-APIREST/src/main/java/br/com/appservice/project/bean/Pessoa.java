package br.com.appservice.project.bean;

import java.sql.Blob;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Pessoa extends AbstractEntity {

	private static final long serialVersionUID = 1L;
    private String nome;
    private String CPF;
    private String email;
    private Blob foto;
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Blob getFoto() {
		return foto;
	}
	public void setFoto(Blob foto) {
		this.foto = foto;
	}
}
