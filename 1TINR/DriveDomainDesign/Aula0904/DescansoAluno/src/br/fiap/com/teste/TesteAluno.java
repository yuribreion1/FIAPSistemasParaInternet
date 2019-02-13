package br.fiap.com.teste;

import br.fiap.com.model.Aluno;
import br.fiap.com.model.Curso;
import br.fiap.com.model.Endereco;
import br.fiap.com.view.Magica;

public class TesteAluno {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Aluno a = new Aluno();
		Curso c = new Curso();
		Endereco e = new Endereco();
		
		//Definindo valores de aluno
		a.setNome(Magica.texto("Nome"));
		a.setRm(Magica.inteiro("RM"));
		a.setPs(Magica.decimal("Digite a PS"));
		a.setAm(Magica.decimal("Digite a AM"));
		a.setNac(Magica.decimal("Digite a NAC"));
		a.setFaltas(Magica.inteiro("Faltas"));
		
		/*
		//Atribuindo curso a aluno
		a.setCurso(c);
		
		//Definindo valores de curso
		c.setDescricao(Magica.texto("Descricao:"));
		c.setDuracao(Magica.inteiro("Duracao"));
		c.setTitulacao(Magica.texto("Titulacao"));
		c.setValor(Magica.decimal("Valor"));
		
		//Atribuindo endereco a aluno
		a.setEndereco(e);
		
		//Definindo valores de endereco
		e.setBairro(Magica.texto("Bairro"));
		e.setCep(Magica.texto("CEP"));
		e.setLogradouro(Magica.texto("Logradouro"));
		e.setNumero(Magica.texto("Numero"));
		*/
		
		System.out.println("Nome: " + a.getPrimeiroNome());
		System.out.println("Sobrenome: " + a.getSobreNome());
		//System.out.println("Sua media semestral e: " + a.getMedia());
		System.out.println(a.getStatus());

	
	}
}
