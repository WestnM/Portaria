package br.gov.ba.ceped.portaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.gov.ba.ceped.portaria.domain.Pessoa;
import br.gov.ba.ceped.portaria.domain.Usuario;

public class UsuarioDAOTest {

	@Test
	@Ignore
	public void salvar() {

		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(10L);

		Usuario usuario = new Usuario();
		usuario.setAtivo(true);
		usuario.setTipo('A');
		usuario.setPessoa(pessoa);
		usuario.setSenha("q1w2e3r4");

		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.salvar(usuario);

	}

	@Test
	@Ignore
	public void listar() {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		List<Usuario> resultado = usuarioDAO.listar();

		System.out.println("Quantidade de registros; " + resultado.size());

		for (Usuario usuario : resultado) {
			System.out.println(usuario.getPessoa());

		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 42L;

		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscar(codigo);

		if (usuario == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			System.out.println("Registro encontrado:");
			System.out.println(usuario.getPessoa());
		}
	}

	@Test
	@Ignore
	public void excluir() {
		Long codigo = 4L;
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscar(codigo);
		if (usuario == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			usuarioDAO.excluir(usuario);
			System.out.println("Registro removido:");
			System.out.println(usuario.getPessoa());
		}

		}

	@Test	
	@Ignore
	public void editar() {
		Long codigo = 42L;
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscar(codigo);

		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(10L);

		if (usuario == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			System.out.println("Registro antes:");
			System.out.println(usuario.getPessoa()+" - "+ usuario.getTipo());
		}
		pessoa.setCpf("06449998545");
		pessoa.setRg("1245678984");
		pessoa.setTelefone("99341-4345");
		usuario.setAtivo(true);;
		usuario.setTipo('A');
		usuario.setSenha("123456");
		usuario.setPessoa(pessoa);
		usuarioDAO.editar(usuario);		
		pessoaDAO.editar(pessoa);
		
		
		System.out.println("Registro atualizado:");
		System.out.println(usuario.getPessoa()+" - "+ usuario.getTipo());

	}
}
