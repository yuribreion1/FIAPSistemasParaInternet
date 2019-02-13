package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.modelo.Telefone;

public class TestaListagemTelefone {

	public static void main(String[] args) {
		try {
			TelefoneDAO dao = new TelefoneDAO();
			List<Telefone> lista = dao.getTelefones();
			for (Telefone telefone : lista) {
				System.out.println("DDD: " + telefone.getDdd() 
						+ "\nNumero: " + telefone.getNumero()
						+ "\nNumero do cliente: " + telefone.getNumeroCliente()
						+ "\nCodigo do telefone: " + telefone.getCodigoTelefone()
						+ "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
