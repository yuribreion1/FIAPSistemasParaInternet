package br.fiap.com.modelo;

public class Tecnologo extends Formacao {
	private boolean planoExtendido;
	private String am;

	public boolean isPlanoExtendido() {
		return planoExtendido;
	}

	public void setPlanoExtendido(boolean planoExtendido) {
		this.planoExtendido = planoExtendido;
	}

	public String getAm() {
		return am;
	}

	public void setAm(String am) {
		this.am = am;
	}

	public Tecnologo(String descricao, Unidade unidade, double valor, int duracao, String coordenacao, String sigla,
			boolean planoExtendido, String am) {
		super(descricao, unidade, valor, duracao, coordenacao, sigla);
		this.planoExtendido = planoExtendido;
		this.am = am;
	}

	public Tecnologo(String descricao, Unidade unidade, double valor, int duracao, String coordenacao, String sigla) {
	}

}
