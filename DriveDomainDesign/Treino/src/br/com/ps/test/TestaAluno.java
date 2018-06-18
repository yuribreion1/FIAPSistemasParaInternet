package br.com.ps.test;

import javax.swing.JOptionPane;

import br.com.ps.model.Aluno;

public class TestaAluno {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno:"));
		aluno.setEmail(JOptionPane.showInputDialog("Digite o e-mail do aluno:"));
		aluno.setMatricula((JOptionPane.showInputDialog("Digite a matricula do aluno: ")));
		
		System.out.println("Nome: " + aluno.getNome() + "\nE-mail: " + aluno.getEmail() + "\nMatricula: " + aluno.getMatricula());
	}
}
 