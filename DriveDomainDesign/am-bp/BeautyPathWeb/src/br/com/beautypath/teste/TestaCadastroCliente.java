package br.com.beautypath.teste;

import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.beautypath.dao.ClienteDAO;
import br.com.beautypath.dao.ConnectionFactory;
import br.com.beautypath.modelo.Cliente;

public class TestaCadastroCliente {

	public static void main(String[] args) {
		
		try {
			String user = JOptionPane.showInputDialog("Digite seu usuário:");
			String pw = JOptionPane.showInputDialog("Digite a sua senha:");
			Connection c = ConnectionFactory.controlarInstancia().getConnection(user, pw);
			
			Cliente cli = new Cliente();
			ClienteDAO dao = new ClienteDAO();
			
			cli.setNome(JOptionPane.showInputDialog("Digite o nome do cliente:"));
			cli.setTelefone(JOptionPane.showInputDialog("Digite o telefone do cliente:"));
			cli.setSocialUrl(JOptionPane.showInputDialog("Entre com a rede social do cliente:"));
			cli.setEmail(JOptionPane.showInputDialog("Digite o e-mail do cliente:"));
			dao.gravar(cli, c);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}