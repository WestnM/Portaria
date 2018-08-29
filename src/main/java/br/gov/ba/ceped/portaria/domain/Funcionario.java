package br.gov.ba.ceped.portaria.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
@Table(name = "tbl_funcionarios")
public class Funcionario extends GenericDomain implements Serializable {

	@Column(name = "fun_matric", length = 40, nullable = false)
	private String matricula;

	@Column(name = "fun_setor", length = 40, nullable = false)
	private String setor;

	@Column(name = "fun_cargo", length = 40, nullable = false)
	private String cargo;

	@OneToOne
	@JoinColumn(nullable = false)
	private Pessoa pessoa;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date pes_data;

	public Date getPes_data() {
		return pes_data;
	}

	public void setPes_data(Date pes_data) {
		this.pes_data = pes_data;
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
