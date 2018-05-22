package br.com.fiap.test;

import br.com.fiap.model.Bacharelado;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bacharelado b = new Bacharelado();
		
		b.setAll("Descricao de teste", 5, 100.00, 1, true, "Projeto");
		
		System.out.println("Dados de bacharelado:\n" + b.getAll());
	}

}
