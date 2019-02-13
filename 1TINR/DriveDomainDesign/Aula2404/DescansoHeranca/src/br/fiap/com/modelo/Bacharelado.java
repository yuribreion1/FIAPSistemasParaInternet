package br.fiap.com.modelo;

public class Bacharelado extends Formacao{
	private String projetoConclusao;
	private int cargaHorariaEstagio;
	private boolean planoEstendido;

	public String getProjetoConclusao() {
		return projetoConclusao;
	}

	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}

	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}

	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}

	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}

	public Bacharelado(String descricao, Unidade unidade, double valor, int duracao, String coordenacao, String sigla,
			String projetoConclusao, int cargaHorariaEstagio, boolean planoEstendido) {
		super(descricao, unidade, valor, duracao, coordenacao, sigla);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
		this.planoEstendido = planoEstendido;
	}

	public Bacharelado(String descricao, Unidade unidade, double valor, int duracao, String coordenacao, String sigla) {
	}
	
	

}
