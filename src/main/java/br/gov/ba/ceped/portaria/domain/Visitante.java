package br.gov.ba.ceped.portaria.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "tbl_visitante")
public class Visitante extends GenericDomain implements Serializable {

	@Column(name = "vis_nome", length = 40, nullable = false)
	private String nome;

	@Column(name = "vis_cpf", nullable = false, unique = true)
	private String cpf;

	@Column(name = "vis_telefone")
	private String telefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
