package br.com.fiap.teste;

import java.util.List;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.modelo.Cliente;

public class TestaListagemClientes {

	public static void main(String[] args) {
		try {
			ClienteDAO dao = new ClienteDAO();
			List<Cliente> lista = dao.getClientes();
			for (Cliente obj : lista) {
				System.out.println(obj.getNumeroCliente() + "\n" + obj.getNomeCliente() + "\n" + obj.getQntEstrelas());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
