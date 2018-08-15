package br.gov.ba.ceped.portaria.domain;

import javax.persistence.Entity;

@Entity
public class Estado extends GenericDomain {

	private String sigla;
	private String nome;

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
