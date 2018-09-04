package br.gov.ba.ceped.portaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.gov.ba.ceped.portaria.domain.Empresa;
import br.gov.ba.ceped.portaria.domain.Funcionario;
import br.gov.ba.ceped.portaria.domain.Pessoa;;

public class FunciorarioDAOTest {

	@Test
	@Ignore
		public void salvar() {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Westn");
		PessoaDAO westn = new PessoaDAO ();
		westn.salvar(pessoa1);
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(4L);
		
		Empresa empresa = new Empresa();
		empresa.setNomeFantasia("secti");
		empresa.setCnpj("123456");
		
		EmpresaDAO empresaDAO = new EmpresaDAO();
		empresaDAO.salvar(empresa);
					
		Funcionario funcionario = new Funcionario();
		funcionario.setCargo("ANALISTA DE SISTEMAS");
		funcionario.setMatricula("123");
		funcionario.setPessoa(pessoa);
		funcionario.setSetor("GERIM");
		funcionario.setEmpresa(empresa);
						
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		funcionarioDAO.salvar(funcionario);
	}

	@Test
	@Ignore
	public void listar() {
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		List<Funcionario> resultado = funcionarioDAO.listar();

		System.out.println("Quantidade de resgistros; " + resultado.size());

		for (Funcionario funcionario : resultado) {
			 System.out.println(funcionario);

		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 1L;

		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(codigo);

		if (funcionario == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			System.out.println("Registro encontrado:");
			System.out.println(funcionario.getCodigo());
		}
	}

	@Test
	@Ignore
	public void excluir() {
		Long codigo = 8L;
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(codigo);
		if (funcionario == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			funcionarioDAO.excluir(funcionario);
			System.out.println("Registro removido:");
			System.out.println(funcionario.getCodigo() + " - ");
		}

	}

	@Test
	@Ignore
	public void editar() {
		Long codigo = 10L;
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(codigo);

		if (funcionario == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			System.out.println("Registro antes:");
			System.out.println(funcionario.getCodigo() + " - ");
		}
		// funcionario.setCnpj("1012");
		funcionarioDAO.editar(funcionario);
		System.out.println("Registro atualizado:");
		System.out.println(funcionario.getCodigo() + " - ");

	}

}
