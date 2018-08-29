package br.gov.ba.ceped.portaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table (name = "tbl_empresa")
public class Empresa extends GenericDomain{

	@Column(length = 50)
	private String nomeFantasia;
	
	@Column(length = 30)
	private String cnpj;


	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
