package br.fiap.com.teste;

import javax.swing.JOptionPane;

import br.fiap.com.modelo.Medio;

public class testaAluno {

	public static void main(String[] args) {
		
		Medio m = new Medio();
		
		m.setCoordenacao(JOptionPane.showInputDialog("Digite o coordenador:"));
		m.setDescricao(JOptionPane.showInputDialog("Digite a descrição:"));
		m.setDuracao(Integer.parseInt(JOptionPane.showInputDialog("Digite a duração:")));
		m.setOrientadorPedagogico(JOptionPane.showInputDialog("Nome do orientador:"));
		m.setSigla(JOptionPane.showInputDialog("Digite a sigla do curso:"));
		m.setTipo(JOptionPane.showInputDialog("Digite o tipo do curso:"));
		m.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor:")));
	}

}
