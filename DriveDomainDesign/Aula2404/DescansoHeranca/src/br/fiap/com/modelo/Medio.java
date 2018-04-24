package br.fiap.com.modelo;

public class Medio extends Formacao {
	private String tipo;
	private String orientadorPedagogico;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (!tipo.equals("Tecnico") || !tipo.equals("Regular")) {
			this.tipo = "TECNICO";
			System.out.println("Tipo: " + this.tipo);
		} else {
			this.tipo = tipo.toUpperCase();
		}
	}

	public String getOrientadorPedagogico() {
		return orientadorPedagogico;
	}

	public void setOrientadorPedagogico(String orientadorPedagogico) {
		this.orientadorPedagogico = orientadorPedagogico;
	}

	public Medio(String descricao, Unidade unidade, double valor, int duracao, String coordenacao, String sigla,
			String tipo, String orientadorPedagogico) {
		super(descricao, unidade, valor, duracao, coordenacao, sigla);
		this.tipo = tipo;
		this.orientadorPedagogico = orientadorPedagogico;
	}

	public Medio() {
	}

}
