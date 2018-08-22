package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.modelo.Cliente;

public class TestaPesquisaPorNome {
	public static void main(String[] args) {
		try {
			ClienteDAO dao = new ClienteDAO();
			String strBusca = JOptionPane.showInputDialog("Digite o nome do cliente que esta buscando");
			List<Cliente> clientes = new ArrayList<Cliente>();
			clientes = dao.getPesquisaClientePorNome(strBusca);

			for (Cliente cliente : clientes) {
				System.out.println("Numero do cliente: " + cliente.getNumeroCliente() + "\n" + "Nome do cliente: "
						+ cliente.getNomeCliente() + "\n" + "Quantidade de estrelas: " + cliente.getQntEstrelas());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
