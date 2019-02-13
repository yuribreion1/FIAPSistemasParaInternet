package br.com.fiap.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.modelo.Cliente;

public class ClienteBO {

	public String novoCliente(Cliente cli) throws Exception {

		// Validação
		if (cli.getNomeCliente().length() > 40) {
			return "Nome inválido";
		}

		// Padronização
		cli.setNomeCliente(cli.getNomeCliente().toUpperCase());

		if (cli.getQntEstrelas() < 1 || cli.getQntEstrelas() > 5) {
			return "Quantidade de estrelas invalida";
		}

		ClienteDAO dao = new ClienteDAO();
		dao.gravar(cli);
		return "Cliente gravado com sucesso!";
	}

	public List<Cliente> consultaPorNome(String strSearch) throws Exception {
		if (strSearch.equals(null) || strSearch.length() > 40) {
			return new ArrayList<Cliente>();
		}
		ClienteDAO dao = new ClienteDAO();
		return dao.getPesquisaClientePorNome(strSearch);
	}

	public int excluirPorCodigo(int numeroCliente) throws Exception {
		if (numeroCliente < 1) {
			return 0;
		}
		ClienteDAO dao = new ClienteDAO();
		return dao.apagar(numeroCliente);

	}
	
	//Desenvolver o metodo para aumentar as estrelas e validar se já tem 5
}
