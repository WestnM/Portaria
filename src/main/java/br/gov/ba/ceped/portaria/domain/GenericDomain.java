package br.gov.ba.ceped.portaria.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@MappedSuperclass
public class Pessoa implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;

	@Column(name = "pes_nome", length = 40, nullable = false)
	private String nome;

	@Column(name = "pes_cpf", length = 14, unique = true)
	private String cpf;

	@Column(name = "pes_rg", length = 14, unique = true)
	private String rg;

	@Column(name = "pes_telefone")
	private String telefone;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date pes_data;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

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

	public Date getData() {
		return pes_data;
	}

	public void setData(Date data) {
		this.pes_data = data;
	}
}
