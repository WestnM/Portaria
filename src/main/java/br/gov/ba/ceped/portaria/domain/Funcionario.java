package br.gov.ba.ceped.portaria.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "tbl_funcionarios")
public class Funcionario extends Pessoa {

	@Column(name = "fun_matric", length = 40, nullable = false)
	private String matricula;

	@Column(name = "fun_setor", length = 40, nullable = false)
	private String setor;
	
	@Column(name = "fun_cargo", length = 40, nullable = false)
	private String cargo;
	
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
