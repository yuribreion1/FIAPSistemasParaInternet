package br.com.beautypath.bo;

import br.com.beautypath.dao.ClienteDAO;
import br.com.beautypath.excecao.Excecao;
import br.com.beautypath.modelo.Cliente;

public class ClienteBO {

	public void cadastraCliente(Cliente cli) throws Exception {

		if (cli.getNome().length() > 30) {
			throw new Excecao("O nome do cliente deve ter no máximo 30 caracteres");
		} else if (cli.getTelefone().length() > 16) {
			throw new Excecao("O campo telefone deve ter no máximo 16 caracteres ");
		} else if (cli.getEmail().length() > 50) {
			throw new Excecao("O campo email deve ter no máximo 60 caracteres");
		} else {
			new ClienteDAO().gravar(cli);
		}
	}
}
