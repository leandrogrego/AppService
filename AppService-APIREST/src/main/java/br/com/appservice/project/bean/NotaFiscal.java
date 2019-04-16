package br.com.appservice.project.bean;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class NotaFiscal extends AbstractEntity {

	private static final long serialVersionUID = 1L;
	/**
	 * Definir data e hora
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@ApiModelProperty(notes = "Data de geração de Nota", required = true)
	private Date data;

	/**
	 * Uma nota fiscal para um serviço
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@ApiModelProperty(notes = "Listas de serviços do prestador", required = true)
	private Servico servico;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}
}
