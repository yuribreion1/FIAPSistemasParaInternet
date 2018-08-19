package br.com.fiap.teste;

import br.com.fiap.dao.CadastraClienteDAO;
import br.com.fiap.model.Cliente;

public class TestaCadastraCliente {

	public static void main(String[] args) {
		
		try {
			Cliente cli = new Cliente();
			CadastraClienteDAO cliDao = new CadastraClienteDAO();
			cli.setNomeCliente("João da Silva");
			cli.setNumeroCliente(123);
			cli.setQntEstrelas(3);
			cliDao.gravar(cli);
			System.out.println("Cliente cadastrado");
		} catch (Exception e) {
			System.out.println("Houve um erro");
			e.printStackTrace();
		}

	}

}
