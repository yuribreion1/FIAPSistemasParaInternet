package br.com.fiap.modelo;

public class Cliente {

	private int numeroCliente;
	private String nomeCliente;
	private int qntEstrelas;
	private Endereco endereco;

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

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

	public Cliente(int numeroCliente, String nomeCliente, int qntEstrelas, Endereco endereco) {
		setNumeroCliente(numeroCliente);
		setNomeCliente(nomeCliente);
		setQntEstrelas(qntEstrelas);
		setEndereco(endereco);
	}
	
	public Cliente() {
		
	}

	

}
