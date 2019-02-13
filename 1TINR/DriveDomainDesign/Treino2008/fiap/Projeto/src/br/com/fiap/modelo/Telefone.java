package br.com.fiap.modelo;

public class Telefone {

	private int ddd;
	private String numero;
	private int numeroCliente;
	private int codigoTelefone;

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public int getCodigoTelefone() {
		return codigoTelefone;
	}

	public void setCodigoTelefone(int codigoTelefone) {
		this.codigoTelefone = codigoTelefone;
	}

	public Telefone(int ddd, String numero, int numeroCliente, int codigoTelefone) {
		setDdd(ddd);
		setNumero(numero);
		setNumeroCliente(numeroCliente);
		setCodigoTelefone(codigoTelefone);
	}
	
	public Telefone() {
		
	}

	
}
