package br.com.beautypath.modelo;

public class Catalogo {
	
	/**
	 * @author yuribreion
	 * @version 1.0
	 */
	
	private int idCatalogo;
	private String descricao;

	public int getIdCatalogo() {
		return idCatalogo;
	}

	public void setIdCatalogo(int idCatalogo) {
		this.idCatalogo = idCatalogo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	public Catalogo(int idCatalogo, String descricao) {
		super();
		setIdCatalogo(idCatalogo);
		setDescricao(descricao);
	}

	public Catalogo() {

	}

	public String getAll() {
		return "Cod. Catalogo: " + idCatalogo + "\nDescricao: " + descricao;
	}

	public void setAll(int idCatalogo, String descricao) {

		setIdCatalogo(idCatalogo);
		setDescricao(descricao);
	}

}
