package br.fiap.com.model;

public class Endereco {
	private String logradouro;
	private String numero;
	private String cep;
	private String bairro;
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
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public Endereco(String logradouro, String numero, String cep, String bairro) {
		super();
		setLogradouro(logradouro);
		setNumero(numero);
		setCep(cep);
		setBairro(bairro);
	}
	public Endereco() {
		super();
	}
}
