package br.gov.ba.ceped.portaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Empresa extends GenericDomain{

	@Column(name = "tbl_nomeFantasia",length = 50)
	private String nomeFantasia;
	
	@Column(name = "tbl_cnpj", length = 30 , nullable = false)
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

	@Override
	public String toString() {
		return "Empresa [nomeFantasia = " + nomeFantasia + ", cnpj = " + cnpj + "]";
	}

}
