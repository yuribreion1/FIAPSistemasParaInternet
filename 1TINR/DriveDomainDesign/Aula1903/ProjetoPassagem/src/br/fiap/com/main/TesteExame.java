package br.fiap.com.main;

import br.fiap.com.model.Exame;
import br.fiap.com.model.Medico;

public class TesteExame {
	public static void main(String[] args) {
		Exame exame = new Exame();
		Medico medico = new Medico();
		exame.setAltura("1.89");
		exame.setPeso("93");
		medico.setCRM("123456");
		medico.setEspecialidade("Pediatra");
		
		//Fazendo valer a composição, atribuindo médico a exame
		exame.setMedico(medico);

		//System.out.println("Errado: " + exame.getAltura() + " - " + exame.getPeso());
		
		/*
		 * Vou errar na prova, vc esta chamando valores do médico na classe exame.
		 * */
		//System.out.println(medico.getCRM() + " - " + medico.getEspecialidade());
		
		/*
		 * Vou acertar na prova
		 * */
		System.out.println("Certo: " + exame.getMedico().getCRM() + " - " + exame.getMedico().getEspecialidade());
	}
}
