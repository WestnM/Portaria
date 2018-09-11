package br.gov.ba.ceped.portaria.dao;

import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

import br.gov.ba.ceped.portaria.domain.Empresa;
import br.gov.ba.ceped.portaria.domain.Funcionario;
import br.gov.ba.ceped.portaria.domain.Pessoa;
import br.gov.ba.ceped.portaria.domain.Visitante;;

public class VisitanteDAOTest {

	@Test
	@Ignore
	public void salvar() {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Westn");
		PessoaDAO westn = new PessoaDAO();
		westn.salvar(pessoa1);
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(4L);

		Empresa empresa = new Empresa();
		empresa.setNomeFantasia("secti");
		empresa.setCnpj("123456");

		EmpresaDAO empresaDAO = new EmpresaDAO();
		empresaDAO.salvar(empresa);

		Visitante visitante = new Visitante();
		visitante.setPessoa(pessoa);
		visitante.setEmpresa(empresa);

		VisitanteDAO visitanteDAO = new VisitanteDAO();
		visitanteDAO.salvar(visitante);
	}

	@Test
	@Ignore
	public void listar() {
		VisitanteDAO visitanteDAO = new VisitanteDAO();
		List<Visitante> resultado = visitanteDAO.listar();

		System.out.println("Quantidade de registros; " + resultado.size());

		for (Visitante visitante : resultado) {
			System.out.println(visitante.getCodigo() + " - " + visitante.getPessoa() + " - " + visitante.getEmpresa());

		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 5L;

		VisitanteDAO visitanteDAO = new VisitanteDAO();
		Visitante visitante = visitanteDAO.buscar(codigo);

		if (visitante == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			System.out.println("Registro encontrado:");
			System.out.println(visitante.getCodigo() + " - " + visitante.getPessoa() + " - " + visitante.getEmpresa());
		}
	}

	@Test
	@Ignore
	public void excluir() {
		Long codigo = 8L;
		VisitanteDAO visitanteDAO = new VisitanteDAO();
		Visitante visitante = visitanteDAO.buscar(codigo);
		if (visitante == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			visitanteDAO.excluir(visitante);
			System.out.println("Registro removido:");
			System.out.println(visitante.getCodigo() + " - " + visitante.getPessoa() + " - " + visitante.getEmpresa());
		}

	}

	@Test
	@Ignore
	public void editar() {
		Long codigo = 6L;
		VisitanteDAO visitanteDAO = new VisitanteDAO();
		Visitante visitante = visitanteDAO.buscar(codigo);

		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Westn Melo");
		pessoa1.setCpf("123456122");
		pessoa1.setRg("12456987122");
		pessoa1.setTelefone("993414345");
		PessoaDAO westn = new PessoaDAO();
		westn.salvar(pessoa1);

		Empresa empresa = new Empresa();
		empresa.setCnpj("12345");
		empresa.setNomeFantasia("CEPED");
		EmpresaDAO empresa1 = new EmpresaDAO();
		empresa1.salvar(empresa);

		if (visitante == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			System.out.println("Registro antes:");
			System.out.println(visitante.getCodigo() + " - " + visitante.getPessoa() + " - " + visitante.getEmpresa());
		}
		visitante.setEmpresa(empresa);
		visitante.setPessoa(pessoa1);
		visitanteDAO.editar(visitante);
		;

		System.out.println("Registro atualizado:");
		System.out.println(visitante.getCodigo() + " - " + visitante.getPessoa() + " - " + visitante.getEmpresa());

	}
}
