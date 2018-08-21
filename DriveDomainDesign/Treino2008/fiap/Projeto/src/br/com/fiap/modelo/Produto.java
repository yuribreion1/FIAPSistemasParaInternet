package br.com.fiap.modelo;

public class Produto {

	private int codigoProduto;
	private String nomeProduto;
	private int valorProduto;

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(int valorProduto) {
		this.valorProduto = valorProduto;
	}

	public Produto(int codigoProduto, String nomeProduto, int valorProduto) {
		setCodigoProduto(codigoProduto);
		setNomeProduto(nomeProduto);
		setValorProduto(valorProduto);
	}

	public Produto() {
		
	}
}
