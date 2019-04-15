package br.com.appservice.project.bean;

import java.sql.Date;

import javax.persistence.Entity;

@Entity
public class NotaFiscal extends AbstractEntity{
	
	private static final long serialVersionUID = 1L;
    private Date data;
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
}
