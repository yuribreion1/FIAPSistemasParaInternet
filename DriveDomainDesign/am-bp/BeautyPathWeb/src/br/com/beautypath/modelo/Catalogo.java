package br.com.beautypath.modelo;

public class Catalogo {
	private int idCatelogo;
	private String descricao;

	public int getIdCatelogo() {
		return idCatelogo;
	}

	public void setIdCatelogo(int idCatelogo) {
		this.idCatelogo = idCatelogo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao.length() > 100) {
			this.descricao = descricao.substring(0, 100);
		} else {
			this.descricao = descricao;
		}
	}

	public Catalogo(int idCatelogo, String descricao) {
		super();
		setIdCatelogo(idCatelogo);
		setDescricao(descricao);
	}

	public Catalogo() {

	}

	public String getAll() {
		return "Cod. Catalogo: " + idCatelogo + "\nDescricao: " + descricao;
	}

	public void setAll(int idCatelogo, String descricao) {

		setIdCatelogo(idCatelogo);
		setDescricao(descricao);
	}

}
