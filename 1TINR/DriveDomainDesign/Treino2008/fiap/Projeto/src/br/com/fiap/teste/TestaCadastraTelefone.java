package br.com.fiap.teste;

import br.com.fiap.dao.TelefoneDAO;
import br.com.fiap.modelo.Telefone;

public class TestaCadastraTelefone {
	public static void main(String[] args) {
		try {
			TelefoneDAO dao = new TelefoneDAO();
			Telefone tel = new Telefone();
			
			tel.setDdd(11);
			tel.setNumero("222-444");
			tel.setNumeroCliente(10);
			tel.setCodigoTelefone(3);
			
			dao.gravar(tel);
			System.out.println("Telefone gravado com sucesso");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
