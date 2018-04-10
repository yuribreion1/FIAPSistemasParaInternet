package br.fiap.com.model;

public class Curso {
	private String descricao;
	private double valor;
	private int duracao;
	private String titulacao;

	public Curso() {
		super();
	}

	public Curso(String descricao, double valor, int duracao, String titulacao) {
		super();
		this.descricao = descricao;
		this.valor = valor;
		this.duracao = duracao;
		this.titulacao = titulacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

}
