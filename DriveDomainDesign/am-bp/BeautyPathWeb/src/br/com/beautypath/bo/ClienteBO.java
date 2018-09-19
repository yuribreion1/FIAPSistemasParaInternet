package br.com.beautypath.bo;

import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.beautypath.dao.ClienteDAO;
import br.com.beautypath.dao.ConnectionFactory;
import br.com.beautypath.excecao.Excecao;
import br.com.beautypath.modelo.Cliente;

public class ClienteBO {

	public void cadastraCliente(Cliente cli) throws Exception {

		String user = JOptionPane.showInputDialog("Digite seu usuário:");
		String pw = JOptionPane.showInputDialog("Digite a sua senha:");
		Connection c = ConnectionFactory.controlarInstancia().getConnection(user, pw);

		if (cli.getNome().length() > 30) {
			throw new Excecao("O nome do cliente deve ter no máximo 30 caracteres");
		} else if (cli.getTelefone().length() > 16) {
			throw new Excecao("O campo telefone deve ter no máximo 16 caracteres ");
		} else if (cli.getEmail().length() > 50) {
			throw new Excecao("O campo email deve ter no máximo 60 caracteres");
		} else {
			new ClienteDAO().gravar(cli, c);
		}
	}
}
