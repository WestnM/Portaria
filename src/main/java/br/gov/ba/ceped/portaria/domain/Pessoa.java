package br.gov.ba.ceped.portaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Pessoa extends GenericDomain {
	
	@Column(name = "pes_nome", length = 40, nullable = false)
	private String nome;

	@Column(name = "pes_cpf", length = 14, unique = true)
	private String cpf;

	@Column(name = "pes_rg", length = 14, unique = true)
	private String rg;

	@Column(name = "pes_telefone")
	private String telefone;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	 
	
}
