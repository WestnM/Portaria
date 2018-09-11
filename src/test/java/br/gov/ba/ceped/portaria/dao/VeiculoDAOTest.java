package br.gov.ba.ceped.portaria.dao;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.gov.ba.ceped.portaria.domain.Empresa;
import br.gov.ba.ceped.portaria.domain.Pessoa;
import br.gov.ba.ceped.portaria.domain.Veiculo;
import br.gov.ba.ceped.portaria.domain.Visitante;

public class VeiculoDAOTest {
	@Test
	@Ignore
	public void salvar() {
		// Adicionando a empresa para poder fazer a busca
		Empresa empresa = new Empresa();
		empresa.setNomeFantasia("CEPED");
		empresa.setCnpj("1234");

		EmpresaDAO empresaDAO = new EmpresaDAO();
		empresaDAO.salvar(empresa);

		// Adicionando o condutor para poder fazer a busca
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Westn");
		PessoaDAO westn = new PessoaDAO();
		westn.salvar(pessoa1);
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(2L);

		Visitante condutor = new Visitante();
		condutor.setPessoa(pessoa);
		condutor.setEmpresa(empresa);

		VisitanteDAO visitanteDAO = new VisitanteDAO();
		visitanteDAO.salvar(condutor);

		// Salvando Veiculo
		Veiculo veiculo = new Veiculo();
		veiculo.setData(new Date());
		veiculo.setKm("57000");
		veiculo.setMarca("VW");
		veiculo.setModelo("Voyage");
		veiculo.setPlaca("JQZ-1564");
		veiculo.setCondutor(condutor);

		// Metodo Salvar da classe VeiculoDAO que herda de GenericDAO
		VeiculoDAO veiculo1 = new VeiculoDAO();
		veiculo1.salvar(veiculo);
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
		String placa = "JQZ-1564";

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
		String placa = "JQZ-1564";

		VeiculoDAO veiculoDAO = new VeiculoDAO();
		Veiculo veiculo = veiculoDAO.buscarNome("placa", placa);

		// Adicionando o condutor para poder fazer a busca
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Westn");
		pessoa1.setCpf("0213464877");
		pessoa1.setRg("2154657");
		pessoa1.setTelefone("2126455484");
		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.salvar(pessoa1);
		

		// Adicionando a empresa para poder fazer a busca
		Empresa empresa = new Empresa();
		empresa.setNomeFantasia("CEPED");
		empresa.setCnpj("123456");

		EmpresaDAO empresaDAO = new EmpresaDAO();
		empresaDAO.salvar(empresa);

		Visitante condutor = new Visitante();
		condutor.setPessoa(pessoa1);
		condutor.setEmpresa(empresa);

		VisitanteDAO visitanteDAO = new VisitanteDAO();
		visitanteDAO.salvar(condutor);
	
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
			veiculo.setKm("57002");
			veiculo.setMarca("VW");
			veiculo.setModelo("Voyage");
			veiculo.setPlaca("JQZ-1564");
			veiculo.setCondutor(condutor);
			veiculoDAO.editar(veiculo);

			System.out.println("Registro atualizado:");
			System.out.println("MARCA: " + veiculo.getMarca() + " - " + "MODELO: " + veiculo.getModelo() + " - "
					+ "KM: " + veiculo.getKm() + " - " + "PLACA: " + veiculo.getPlaca() + " - " + "DATA: "
					+ veiculo.getData() + " CONDUTOR: " + veiculo.getCondutor() + " - " + " - "
					+ veiculo.getFun_condutor());
		}
	}
}
