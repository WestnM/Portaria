package br.gov.ba.ceped.portaria.dao;

import java.util.List;
import org.junit.Ignore;
import org.junit.Test;

import br.gov.ba.ceped.portaria.domain.Empresa;;

public class EmpresaDAOTest {

	@Test
	@Ignore
	public void salvar() {
		Empresa empresa = new Empresa();
		empresa.setCnpj("1235");
		empresa.setNomeFantasia("TWINT");

		EmpresaDAO empresaDAO = new EmpresaDAO();
		empresaDAO.salvar(empresa);
	}

	@Test
	@Ignore
	public void listar() {
		EmpresaDAO empresaDAO = new EmpresaDAO();
		List<Empresa> resultado = empresaDAO.listar();

		System.out.println("Quantidade de resgistros; " + resultado.size());

		for (Empresa empresa : resultado) {
			System.out.println(empresa.getCnpj() + " - " + empresa.getNomeFantasia() + " - " + empresa.getCodigo());

		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 5L;

		EmpresaDAO empresaDAO = new EmpresaDAO();
		Empresa empresa = empresaDAO.buscar(codigo);

		if (empresa == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			System.out.println("Registro encontrado:");
			System.out.println(empresa.getCodigo() + " - " + empresa.getNomeFantasia() + " - " + empresa.getCnpj());
		}
	}
	
	@Test
	@Ignore
	public void excluir() {
		Long codigo = 8L;
		EmpresaDAO empresaDAO = new EmpresaDAO();
		Empresa empresa = empresaDAO.buscar(codigo);
		if (empresa == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			empresaDAO.excluir(empresa);
			System.out.println("Registro removido:");
			System.out.println(empresa.getCodigo() + " - " + empresa.getNomeFantasia() + " - " + empresa.getCnpj());
		}
				
	}
	
	@Test
	public void editar() {
		Long codigo = 10L;
		EmpresaDAO empresaDAO = new EmpresaDAO();
		Empresa empresa = empresaDAO.buscar(codigo);
		
		if (empresa == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			System.out.println("Registro antes:");
			System.out.println(empresa.getCodigo() + " - " + empresa.getNomeFantasia() + " - " + empresa.getCnpj());
		}
		empresa.setCnpj("1012");
		empresaDAO.editar(empresa);
		System.out.println("Registro atualizado:");
		System.out.println(empresa.getCodigo() + " - " + empresa.getNomeFantasia() + " - " + empresa.getCnpj());

		
	}
}
