package br.com.beautypath.bo;

import java.sql.Connection;

import br.com.beautypath.dao.ClienteDAO;
import br.com.beautypath.dao.ConnectionFactory;
import br.com.beautypath.excecao.Excecao;
import br.com.beautypath.modelo.Cliente;

public class ClienteBO {
	
	/**
	 * @author yuribreion
	 * @param cli
	 * @throws Exception
	 * @see ClienteDAO
	 */

	public void cadastraCliente(Cliente cli) throws Exception{
		Connection c = ConnectionFactory.controlarInstancia().getConnection("rm79935", "300187");
		erroCliente(cli);
		new ClienteDAO().gravar(cli, c);
	}
	
	private void erroCliente(Cliente cli)  throws Exception{
		if (cli.getNome().length() > 30) {
			throw Excecao.getErro(new Exception("O nome do cliente deve ter no máximo 30 caracteres"));
		} else if (cli.getTelefone().length() > 16) {
			throw Excecao.getErro(new Exception("O campo telefone deve ter no máximo 16 caracteres "));
		} else if (cli.getEmail().length() > 50) {
			throw Excecao.getErro(new Exception("O campo email deve ter no máximo 60 caracteres"));
		} else if (!cli.getEmail().contains("@") && !cli.getEmail().contains(".") && cli.getEmail().length() > 50) {
			throw Excecao.getErro(new Exception("E-mail incorreto"));
		}
	}
}