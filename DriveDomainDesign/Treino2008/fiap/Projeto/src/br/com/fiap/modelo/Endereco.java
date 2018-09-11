package br.com.fiap.modelo;

public class Endereco {

	private int codigo;
	private String logradouro;
	private String numero;
	private String cep;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Endereco(int codigo, String logradouro, String numero, String cep) {
		setCodigo(codigo);
		setLogradouro(logradouro);
		setNumero(numero);
		setCep(cep);
	}
	
	public Endereco() {
		
	}
	
	
}
