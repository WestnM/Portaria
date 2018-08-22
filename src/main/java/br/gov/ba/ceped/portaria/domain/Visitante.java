package br.gov.ba.ceped.portaria.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "tbl_visitante")
public class Visitante extends Pessoa implements Serializable {
	
	@Column(name = "vis_empresa", length = 40, nullable = false)
	private String empresa;

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
}