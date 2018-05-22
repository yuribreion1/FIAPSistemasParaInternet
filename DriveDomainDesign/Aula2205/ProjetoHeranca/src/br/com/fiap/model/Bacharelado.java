package br.com.fiap.model;

public class Bacharelado extends Formacao {

	private int estagio;
	private boolean estendido;
	private String projetoConclusao;

	public int getEstagio() {
		return estagio;
	}

	public void setEstagio(int estagio) {
		this.estagio = estagio;
	}

	public boolean isEstendido() {
		return estendido;
	}

	public void setEstendido(boolean estendido) {
		this.estendido = estendido;
	}

	public String getProjetoConclusao() {
		return projetoConclusao;
	}

	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}

	public String getAll() {
		return super.getAll() + "\n" + this.estagio + "\n" + this.estendido + "\n" + this.projetoConclusao;
	}

	public void setAll(String descricao, int duracao, double valor, int estagio, boolean estendido,
			String projetoConclusao) {
		super.setAll(descricao, duracao, valor);
		setEstagio(estagio);
		setEstagio(estagio);
		setProjetoConclusao(projetoConclusao);
	}

	public Bacharelado(String descricao, int duracao, double valor, int estagio, boolean estendido,
			String projetoConclusao) {
		super(descricao, duracao, valor);
		setEstagio(estagio);
		setEstagio(estagio);
		setProjetoConclusao(projetoConclusao);
	}

	public Bacharelado() {
		super();
	}
}
