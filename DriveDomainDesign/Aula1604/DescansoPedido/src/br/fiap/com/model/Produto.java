package br.fiap.com.model;

public class Produto {
	private int codigo;
	private String descricao;
	private double valor;
	private int qtde;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public Produto() {
		super();
	}

	public Produto(int codigo, String descricao, double valor, int qtde) {
		super();
		setCodigo(codigo);
		setDescricao(descricao);
		setValor(valor);
		setQtde(qtde);
	}

	public void setAll(int codigo, String descricao, double valor, int qtde) {
		setCodigo(codigo);
		setDescricao(descricao);
		setValor(valor);
		setQtde(qtde);
	}

	public String getAll() {
		return codigo + "\n" + descricao + "\n" + valor + "\n" + qtde;
	}

}
