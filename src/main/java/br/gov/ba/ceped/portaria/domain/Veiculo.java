package br.gov.ba.ceped.portaria.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbl_veiculo")
public class Veiculo {
	
	@ManyToOne
	private Visitante vis_condutor;
	
	@ManyToOne
	private Funcionario fun_condutor;

	@Column(name = "veic_marca", length = 40, nullable = false)
	private String marca;

	@Column(name = "veic_modelo", length = 20, nullable = false)
	private String modelo;

	@Id
	@Column(name = "veic_placa", nullable = false, length = 8, unique = true)
	private String placa;

	@Column(name = "veic_km_entrada")
	private String km;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date veic_data;
	
	public Visitante getCondutor() {
		return vis_condutor;
	}

	public void setCondutor(Visitante condutor) {
		this.vis_condutor = condutor;
	}

	public Funcionario getFun_condutor() {
		return fun_condutor;
	}

	public void setFun_condutor(Funcionario fun_condutor) {
		this.fun_condutor = fun_condutor;
	}

	public Date getVeic_data() {
		return veic_data;
	}

	public void setVeic_data(Date veic_data) {
		this.veic_data = veic_data;
	}

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

}
