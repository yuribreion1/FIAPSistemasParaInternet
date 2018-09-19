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
		if (nome.length() > 30) {
			this.nome = nome.substring(0, 30);
		} else {
			this.nome = nome.toUpperCase();
		}
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if (telefone.length() > 16) {
			this.telefone = telefone.substring(0, 16);
		} else {
			this.telefone = telefone;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (!email.contains("@") && !email.contains(".") && email.length() > 50) {
			this.email = "erro@fiap.com.br";
		} else {
			this.email = email.toLowerCase();
		}
	}

	public String getSocialUrl() {
		return socialUrl;
	}

	public void setSocialUrl(String socialUrl) {
		if (socialUrl.length() > 80) {
			this.socialUrl = socialUrl.substring(0, 80);
		} else {
			this.socialUrl = socialUrl;
		}
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