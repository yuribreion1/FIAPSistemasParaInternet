package br.com.beautypath.modelo;

public class Endereco {
	
	/**
	 * @author yuribreion
	 * @version 1.0
	 */

	private int idEndereco;
	private String logradouro;
	private String cidade;
	private String cep;
	private String estado;

	public int getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		if (logradouro.length() > 30) {
			
			this.logradouro = logradouro.substring(0, 30);
		} else {
			this.logradouro = logradouro;
		}
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		if (cidade.length() > 22) {
			
			this.cidade = cidade.substring(0, 22);
		} else {
			this.cidade = cidade;
		}
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		if (cep.length() > 9) {
			
			this.cep = cep.substring(0, 9);
		} else {
			this.cep = cep;
		}
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		if (estado.length() > 30) {
			
			this.estado = estado.substring(0, 30);
		} else {
			this.estado = estado;
		}
	}

	public Endereco(int idEndereco, String logradouro, String cidade, String cep, String estado) {
		super();
		setIdEndereco(idEndereco);
		setLogradouro(logradouro);
		setCidade(cidade);
		setCep(cep);
		setEstado(estado);
	}

	public Endereco() {

	}
	
	public void setAll(int idEndereco, String logradouro, String cidade, String cep, String estado) {
		setIdEndereco(idEndereco);
		setLogradouro(logradouro);
		setCidade(cidade);
		setCep(cep);
		setEstado(estado);
	}
}
