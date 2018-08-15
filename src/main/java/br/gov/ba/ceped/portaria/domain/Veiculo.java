package br.gov.ba.ceped.portaria.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_veiculo")
public class Veiculo {

	@Column(name = "veic_marca", length = 40, nullable = false)
	private String marca;

	@Column(name = "veic_modelo", length = 20, nullable = false)
	private String modelo;

	@Column(name = "veic_placa", nullable = false, length = 7, unique = true)
	private String placa;

	@Column(name = "veic_empresa", nullable = false)
	private String empresa;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

}
