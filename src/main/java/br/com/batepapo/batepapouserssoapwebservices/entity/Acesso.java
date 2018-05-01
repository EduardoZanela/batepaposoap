package br.com.batepapo.batepapouserssoapwebservices.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="acesso", uniqueConstraints= @UniqueConstraint(columnNames= {"codUsuario", "dataHora"}, name="pk_acesso"))
@IdClass(AcessoKey.class)
public class Acesso implements Serializable{

	private static final long serialVersionUID = 1841754810367467491L;
	
	public Acesso() {
		
	}
	public Acesso(long codUsuario, Calendar dataHora) {
		super();
		this.codUsuario = codUsuario;
		this.dataHora = dataHora;
	}

	@Id
	private long codUsuario;
	@Id
	private Calendar dataHora;
	
	public long getCodUsuario() {
		return codUsuario;
	}
	public void setCodUsuario(long codUsuario) {
		this.codUsuario = codUsuario;
	}
	public Calendar getDataHora() {
		return dataHora;
	}
	public void setDataHora(Calendar dataHora) {
		this.dataHora = dataHora;
	}	
	
}
