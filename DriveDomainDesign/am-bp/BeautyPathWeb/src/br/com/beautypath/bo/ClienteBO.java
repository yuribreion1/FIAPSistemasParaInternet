package br.com.beautypath.bo;

import java.sql.Connection;

import br.com.beautypath.dao.ClienteDAO;
import br.com.beautypath.dao.ConnectionFactory;
import br.com.beautypath.excecao.Excecao;
import br.com.beautypath.modelo.Cliente;

public class ClienteBO {

	public void cadastraCliente(Cliente cli) throws Exception {

		Connection c = ConnectionFactory.controlarInstancia().getConnection("rm79935", "300187");

		if (cli.getNome().length() > 30) {
			throw new Excecao("O nome do cliente deve ter no máximo 30 caracteres", null);
		} else if (cli.getTelefone().length() > 16) {
			throw new Excecao("O campo telefone deve ter no máximo 16 caracteres ", null);
		} else if (cli.getEmail().length() > 50) {
			throw new Excecao("O campo email deve ter no máximo 60 caracteres", null);
		}
		new ClienteDAO().gravar(cli, c);
	}
}