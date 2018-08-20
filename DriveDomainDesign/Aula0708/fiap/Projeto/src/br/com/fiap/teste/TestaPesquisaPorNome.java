package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.modelo.Cliente;

public class TestaPesquisaPorNome {
	public static void main(String[] args) {
		try {
			ClienteDAO dao = new ClienteDAO();
			Cliente cli = new Cliente();
			String strBusca = JOptionPane.showInputDialog("Digite o nome do cliente que esta buscando");

			cli = dao.getPesquisaClientePorNome(strBusca);
// TODO verificar		System.out.println(cli.getNomeCliente());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
