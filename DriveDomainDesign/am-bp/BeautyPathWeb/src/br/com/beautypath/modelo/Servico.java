package br.com.beautypath.modelo;

public class Servico {

	private int idServico;
	private int quantidade;
	private double valor;
	private String descricao;
	private Catalogo idCatalogo;

	public int getIdServico() {
		return idServico;
	}

	public void setIdServico(int idServico) {
		this.idServico = idServico;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao.length() > 100) {
			descricao.substring(0, 100);
		} else {
			this.descricao = descricao;
		}
	}

	public Catalogo getIdCatalogo() {
		return idCatalogo;
	}

	public void setIdCatalogo(Catalogo idCatalogo) {
		this.idCatalogo = idCatalogo;
	}

	public Servico(int idServico, int quantidade, double valor, String descricao, Catalogo idCatalogo) {
		super();
		setIdServico(idServico);
		setQuantidade(quantidade);
		setValor(valor);
		setDescricao(descricao);
		setIdCatalogo(idCatalogo);
	}

	public Servico() {
	}

}
