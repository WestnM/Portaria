package br.gov.ba.ceped.portaria.dao;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.gov.ba.ceped.portaria.domain.Pessoa;
import br.gov.ba.ceped.portaria.domain.Veiculo;
import br.gov.ba.ceped.portaria.domain.Visitante;

public class VeiculoDAOTest {
	@Test
	@Ignore
	public void salvar() {
		VisitanteDAO visitanteDAO = new VisitanteDAO();
		Visitante visitante = visitanteDAO.buscar(30L);
		
		// Salvando Veiculo
		Veiculo veiculo = new Veiculo();
		veiculo.setData(new Date());
		veiculo.setKm("57000");
		veiculo.setMarca("VW");
		veiculo.setModelo("Voyage");
		veiculo.setPlaca("JQZ-1567");
		veiculo.setCondutor(visitante);

		// Metodo Salvar da classe VeiculoDAO que herda de GenericDAO
		VeiculoDAO veiculoDAO = new VeiculoDAO();
		veiculoDAO.salvar(veiculo);
	}

	@Test
	@Ignore
	public void listar() {
		VeiculoDAO veiculoDAO = new VeiculoDAO();
		List<Veiculo> resultado = veiculoDAO.listar();

		System.out.println("Quantidade de registros; " + resultado.size());

		for (Veiculo veiculo : resultado) {
			System.out.println("MARCA: " + veiculo.getMarca() + " - " + "MODELO: " + veiculo.getModelo() + " - "
					+ "KM: " + veiculo.getKm() + " - " + "PLACA: " + veiculo.getPlaca() + " - " + "DATA: "
					+ veiculo.getData() + " CONDUTOR: " + veiculo.getCondutor() + " - " + " - "
					+ veiculo.getFun_condutor());

		}
	}

	@Test
	@Ignore
	public void buscar() {
		String placa = "JQZ-1567";

		VeiculoDAO veiculoDAO = new VeiculoDAO();
		Veiculo veiculo = veiculoDAO.buscarNome("placa", placa);
		if (veiculo == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			System.out.println("Registro encontrado:");
			System.out.println("MARCA: " + veiculo.getMarca() + " - " + "MODELO: " + veiculo.getModelo() + " - "
					+ "KM: " + veiculo.getKm() + " - " + "PLACA: " + veiculo.getPlaca() + " - " + "DATA: "
					+ veiculo.getData() + " CONDUTOR: " + veiculo.getCondutor() + " - " + " - "
					+ veiculo.getFun_condutor());
		}
	}

	@Test
	@Ignore
	public void excluir() {
		String placa = "JQZ-1564";

		VeiculoDAO veiculoDAO = new VeiculoDAO();
		Veiculo veiculo = veiculoDAO.buscarNome("placa", placa);
		if (veiculo == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			veiculoDAO.excluir(veiculo);
			System.out.println("Registro removido:");
			System.out.println("MARCA: " + veiculo.getMarca() + " - " + "MODELO: " + veiculo.getModelo() + " - "
					+ "KM: " + veiculo.getKm() + " - " + "PLACA: " + veiculo.getPlaca() + " - " + "DATA: "
					+ veiculo.getData() + " CONDUTOR: " + veiculo.getCondutor() + " - " + " - "
					+ veiculo.getFun_condutor());
		}

	}

	@Test
	@Ignore
	public void editar() {
		String placa = "JQZ-1565";

		VeiculoDAO veiculoDAO = new VeiculoDAO();
		Veiculo veiculo = veiculoDAO.buscarNome("placa", placa);

		// Adicionando o condutor para poder fazer a busca
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(10L);
		pessoa.setNome("Westn Melo");
		
		// Adicionando a empresa para poder fazer a busca
		VisitanteDAO visitanteDAO = new VisitanteDAO();
		Visitante visitante = visitanteDAO.buscar(30L);
		visitante.setPessoa(pessoa);
	
		if (veiculo == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			System.out.println("Registro antes:");
			System.out.println("MARCA: " + veiculo.getMarca() + " - " + "MODELO: " + veiculo.getModelo() + " - "
					+ "KM: " + veiculo.getKm() + " - " + "PLACA: " + veiculo.getPlaca() + " - " + "DATA: "
					+ veiculo.getData() + " CONDUTOR: " + veiculo.getCondutor() + " - " + " - "
					+ veiculo.getFun_condutor());
		
			// Salvando Veiculo
			veiculo.setData(new Date());
			veiculo.setKm("57022");
			veiculo.setPlaca("JQZ-1566");
			veiculo.setCondutor(visitante);
			veiculoDAO.editar(veiculo);

			System.out.println("Registro atualizado:");
			System.out.println("MARCA: " + veiculo.getMarca() + " - " + "MODELO: " + veiculo.getModelo() + " - "
					+ "KM: " + veiculo.getKm() + " - " + "PLACA: " + veiculo.getPlaca() + " - " + "DATA: "
					+ veiculo.getData() + " CONDUTOR: " + veiculo.getCondutor() + " - " + " - "
					+ veiculo.getFun_condutor());
		}
	}
}
