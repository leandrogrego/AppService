package br.com.appservice.project.bean;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import br.com.appservice.project.bean.enums.Sexo;

@MappedSuperclass
public class Pessoa extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	@ApiModelProperty(notes = "Nome Pessoal", required = true)
	private String nome;
	@ApiModelProperty(notes = "CPF único", required = true)
	private String CPF;
	@ApiModelProperty(notes = "Email pessoal", required = true)
	private String email;

	/**
	 * Anotação para tipos enums Strigs
	 */
	@Enumerated(EnumType.STRING)
	@ApiModelProperty(notes = "Sexo por definição pessoal", required = true)
	private Sexo sexo;
	/**
	 * Anotação para tipo de arquivos
	 */
	@Lob
	@ApiModelProperty(notes = "foto do Usúario", required = true)
	private byte[] foto;
	/**
	 * Uma pessoa para muitos telefones
	 */
	@OneToMany
	@ApiModelProperty(notes = "Lista de telefones do Usúario", required = true)
	private List<Telefone> telefones;
	/**
	 * Muitas pessoas para um endereço
	 */
	@ManyToOne
	@ApiModelProperty(notes = "Endereço Recidencial", required = true)
	private Endereco endereco;

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

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
