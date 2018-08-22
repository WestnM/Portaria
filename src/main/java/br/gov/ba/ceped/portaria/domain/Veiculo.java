package br.gov.ba.ceped.portaria.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbl_veiculo")
public class Veiculo {
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Empresa empresa;

	@Column(name = "veic_marca", length = 40, nullable = false)
	private String marca;

	@Column(name = "veic_modelo", length = 20, nullable = false)
	private String modelo;

	@Id
	@Column(name = "veic_placa", nullable = false, length = 7, unique = true)
	private String placa;

	@Column(name = "veic_km_entrada")
	private String km;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date veic_data;
	
	public Date getData() {
		return veic_data;
	}

	public void setData(Date data) {
	this.veic_data = data;
	}
	
	public String getMarca() {
		return marca;
	}

	public String getKm() {
		return km;
	}

	public void setKm(String km) {
		this.km = km;
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
	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
}
