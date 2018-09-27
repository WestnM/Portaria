package br.gov.ba.ceped.portaria.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/**
 * @author WestnSouza
 *
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "tbl_visitante")
public class Visitante extends GenericDomain implements Serializable {

	@ManyToOne
	@JoinColumn
	private Empresa empresa;
	
	@OneToOne
	@JoinColumn(nullable = false)
	private Pessoa pessoa;
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "Visitante [" + empresa + ", " + pessoa + "]";
	}
	
	
}