package br.com.fiap.model;

public class Formacao {
	
	/**
	 * @author yuribreion
	 * @serial 1
	 * 
	 */

	private String descricao;
	private int duracao;
	private double valor;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Formacao(String descricao, int duracao, double valor) {
		super();
		setDescricao(descricao);;
		setDuracao(duracao);;
		setValor(valor);
	}

	public Formacao() {
		super();
	}
	
	public String getAll() {
		return descricao + "\n" + duracao + "\n" + valor; 
	}

	public void setAll(String descricao, int duracao, double valor) {
		setDescricao(descricao);
		setDuracao(duracao);
		setValor(valor);		
	}

}
