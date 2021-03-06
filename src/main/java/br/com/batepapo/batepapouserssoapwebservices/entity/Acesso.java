package br.com.batepapo.batepapouserssoapwebservices.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="acesso", uniqueConstraints= @UniqueConstraint(columnNames= {"codusuario", "datahora"}, name="pk_acesso"))
@IdClass(AcessoKey.class)
public class Acesso implements Serializable{

	private static final long serialVersionUID = 1841754810367467491L;
	
	public Acesso() {
		
	}
	public Acesso(Usuario codUsuario, Calendar dataHora) {
		this.codUsuario = codUsuario;
		this.dataHora = dataHora;
	}

	@Id
	@ManyToOne
	@JoinColumn(name="codUsuario", referencedColumnName="codUsuario",foreignKey = @ForeignKey(name = "fk_acesso_usuario"))
	private Usuario codUsuario;
	@Id
	@Column(name="datahora")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataHora;
	
	public Usuario getCodUsuario() {
		return codUsuario;
	}
	public void setCodUsuario(Usuario codUsuario) {
		this.codUsuario = codUsuario;
	}
	public Calendar getDataHora() {
		return dataHora;
	}
	public void setDataHora(Calendar dataHora) {
		this.dataHora = dataHora;
	}	
	
}
