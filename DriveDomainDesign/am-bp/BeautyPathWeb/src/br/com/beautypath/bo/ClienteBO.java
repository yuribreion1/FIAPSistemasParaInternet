package br.com.beautypath.bo;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import br.com.beautypath.dao.ClienteDAO;
import br.com.beautypath.dao.ConnectionFactory;
import br.com.beautypath.excecao.Excecao;
import br.com.beautypath.modelo.Cliente;

public class ClienteBO {
	
	/**
	 * @author yuribreion
	 * @version 1.0
	 * @param cli
	 * @throws Exception
	 * @see ClienteDAO
	 * @see Cliente
	 */

	public void cadastraCliente(Cliente cli) throws Exception{
		Connection conexao = ConnectionFactory.controlarInstancia().getConnection("rm79935", "300187");
		erroCliente(cli);
		new ClienteDAO().gravar(cli, conexao);
	}
	
	public List<Cliente> listaClientes() throws Exception {
		Connection conexao = ConnectionFactory.controlarInstancia().getConnection("rm79935", "300187");
		return new ClienteDAO().getClientes(conexao);
	}
	
	public List<Cliente> getPesquisaClientePorNome(String strSearch) throws Exception {
		Connection conexao = ConnectionFactory.controlarInstancia().getConnection("rm79935", "300187");
		if (strSearch.equals(null) || strSearch.length() > 40) {
			return new ArrayList<Cliente>();
		}
		ClienteDAO dao = new ClienteDAO();
		return dao.getPesquisaClientePorNome(strSearch, conexao);
}
	
	private void erroCliente(Cliente cli)  throws Exception{
		if (cli.getNome().length() > 30) {
			throw Excecao.getErro(new Exception("O nome do cliente deve ter no máximo 30 caracteres"));
		} else if (cli.getTelefone().length() > 16) {
			throw Excecao.getErro(new Exception("O campo telefone deve ter no máximo 16 caracteres "));
		} else if (cli.getEmail().length() > 50) {
			throw Excecao.getErro(new Exception("O campo email deve ter no máximo 60 caracteres"));
		} else if (!cli.getEmail().contains("@")) {
			throw Excecao.getErro(new Exception("E-mail incorreto"));
		}
	}
}