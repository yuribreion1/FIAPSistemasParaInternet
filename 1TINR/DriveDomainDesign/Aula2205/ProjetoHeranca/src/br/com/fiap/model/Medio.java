package br.com.fiap.model;

public class Medio extends Formacao{

	private String tipo;
	private String pedagogo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPedagogo() {
		return pedagogo;
	}

	public void setPedagogo(String pedagogo) {
		this.pedagogo = pedagogo;
	}
	
	public String getAll() {
		return super.getAll() + "\n" + this.tipo + "\n" + this.pedagogo; 
	}

	public Medio(String descricao, int duracao, double valor, String tipo, String pedagogo) {
		super(descricao, duracao, valor);
		this.tipo = tipo;
		this.pedagogo = pedagogo;
	}

	public Medio() {
		super();
	}
	
	public void setAll(String descricao, int duracao, double valor, String tipo, String pedagogo) {
		super.setAll(descricao, duracao, valor);
		this.tipo = tipo;
		this.pedagogo = pedagogo;
	}
	
}
