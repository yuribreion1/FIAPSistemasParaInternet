package br.com.fiap.modelo;

public class Cliente {

	private int numeroCliente;
	private String nomeCliente;
	private int qntEstrelas;

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getQntEstrelas() {
		return qntEstrelas;
	}

	public void setQntEstrelas(int qntEstrelas) {
		this.qntEstrelas = qntEstrelas;
	}

	public Cliente(int numeroCliente, String nomeCliente, int qntEstrelas) {
		setNumeroCliente(numeroCliente);
		setNomeCliente(nomeCliente);
		setQntEstrelas(qntEstrelas);
	}

	public Cliente() {

	}

}
