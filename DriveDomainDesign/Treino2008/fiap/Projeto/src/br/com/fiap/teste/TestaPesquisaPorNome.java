package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.modelo.Cliente;

public class TestaPesquisaPorNome {
	public static void main(String[] args) {
		try {
			ClienteDAO dao = new ClienteDAO();
			String strBusca = JOptionPane.showInputDialog("Digite o nome do cliente que esta buscando");
			Cliente cli = new Cliente();
			cli = dao.getPesquisaClientePorNome(strBusca);
			
			System.out.println("Numero do cliente: " + cli.getNumeroCliente() + "\n"
					+ "Nome do cliente: " + cli.getNomeCliente() + "\n"
							+ "Quantidade de estrelas: " + cli.getQntEstrelas() );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
