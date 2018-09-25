package br.com.beautypath.modelo;

public class Catalogo {
	private int idCatalogo;
	private String descricao;

	public int getIdCatalogo() {
		return idCatalogo;
	}

	public void setIdCatalogo(int idCatelogo) {
		this.idCatalogo = idCatelogo;
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
		setIdCatalogo(idCatelogo);
		setDescricao(descricao);
	}

	public Catalogo() {

	}

	public String getAll() {
		return "Cod. Catalogo: " + idCatalogo + "\nDescricao: " + descricao;
	}

	public void setAll(int idCatelogo, String descricao) {

		setIdCatalogo(idCatelogo);
		setDescricao(descricao);
	}

}
