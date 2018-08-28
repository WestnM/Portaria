package br.gov.ba.ceped.portaria.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "tbl_funcionarios")
public class Funcionario extends Pessoa implements Serializable {

	@Id
	@Column(name = "fun_matric", length = 40, nullable = false)
	private String matricula;

	@Column(name = "fun_setor", length = 40, nullable = false)
	private String setor;

	@Column(name = "fun_cargo", length = 40, nullable = false)
	private String cargo;
	
	@JoinColumn(nullable = false)
	private Pessoa pessoa;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

}
