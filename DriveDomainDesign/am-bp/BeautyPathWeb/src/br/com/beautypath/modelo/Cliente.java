package br.com.beautypath.modelo;

public class Cliente {

	private int idCliente;
	private String nome;
	private String telefone;
	private String email;
	private String socialUrl;

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSocialUrl() {
		return socialUrl;
	}

	public void setSocialUrl(String socialUrl) {
		this.socialUrl = socialUrl;
	}

	public Cliente(int idCliente, String nome, String telefone, String email, String socialUrl) {
		super();
		setIdCliente(idCliente);
		setNome(nome);
		setTelefone(telefone);
		setEmail(email);
		setSocialUrl(socialUrl);
	}

	public Cliente() {

	}

	public String getAll() {
		return "Cod. Cliente: " + idCliente + "\nNome: " + nome + "\nTelefone: " + telefone + "\nE-mail: " + email
				+ "\nSocial URL: " + socialUrl;
	}

	public void setAll(int idCliente, String nome, String telefone, String email, String socialUrl) {
		setIdCliente(idCliente);
		setNome(nome);
		setTelefone(telefone);
		setEmail(email);
		setSocialUrl(socialUrl);
	}

}