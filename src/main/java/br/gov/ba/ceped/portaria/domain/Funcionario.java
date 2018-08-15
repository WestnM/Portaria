package br.gov.ba.ceped.portaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "tbl_funcionarios")
public class Funcionario extends GenericDomain {
	
	@Column(name = "fun_nome", length = 40, nullable = false)
	private String nome;

	@Column(name = "fun_cpf", length = 13 , nullable = false, unique = true)
	private String cpf;
	
	@Column(name = "fun_setor", length = 40, nullable = false)
	private String setor;

	@Column(name = "fun_telefone")
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

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	


}
