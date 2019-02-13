package br.fiap.com.main;

import br.fiap.com.model.Medico;

public class TesteMedico {
	public static void main(String[] args) {
		// System.out.println("Hello World!");

		Medico medico = new Medico();

		medico.setCRM("123456");
		medico.setEspecialidade("Oftalmologia");

		System.out.println("O CRM do médico é: " + medico.getCRM());
		System.out.println("A especialidade do médico é: " + medico.getEspecialidade());
	}
}
