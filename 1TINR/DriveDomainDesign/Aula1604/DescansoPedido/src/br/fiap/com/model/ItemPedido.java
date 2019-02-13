package br.fiap.com.model;

public class ItemPedido {
	private Produto produto;
	private int qtde;
	private double valorUnitario;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		//Negando quantidade negativa
		if (qtde <= 0) {
			qtde = 1;
		}
		this.qtde = qtde;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public ItemPedido(Produto produto, int qtde, double valorUnitario) {
		super();
		setProduto(produto);
		setQtde(qtde);
		setValorUnitario(valorUnitario);
	}

	public ItemPedido() {
		super();
	}

	public void setAll(Produto produto, int qtde, double valorUnitario) {
		setProduto(produto);
		setQtde(qtde);
		setValorUnitario(valorUnitario);
	}

	public String getAll() {
		return produto + "\n" + qtde + "\n" + valorUnitario;
	}

}
