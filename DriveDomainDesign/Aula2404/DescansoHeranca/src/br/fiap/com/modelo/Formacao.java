package br.fiap.com.modelo;

public class Formacao {

	private String descricao;
	private Unidade unidade;
	private double valor;
	private int duracao;
	private String coordenacao;
	private String sigla;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao.length() > 20) {
			this.descricao = descricao.substring(0, 19);
		}
		this.descricao = descricao.toUpperCase();
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if (valor <= 0) {
			System.out.println("O valor digitado foi menor ou igual a zero, portanto foi definido como 1");
			valor = 1;
		}
		this.valor = valor;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getCoordenacao() {
		return coordenacao;
	}

	public void setCoordenacao(String coordenacao) {
		this.coordenacao = coordenacao.toUpperCase();
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla.toUpperCase();
	}

	public Formacao(String descricao, Unidade unidade, double valor, int duracao, String coordenacao, String sigla) {
		super();
		setDescricao(descricao);
		setUnidade(unidade);
		setValor(valor);
		setDuracao(duracao);
		setCoordenacao(coordenacao);
		setSigla(sigla);
	}

	public Formacao() {
	}

}
