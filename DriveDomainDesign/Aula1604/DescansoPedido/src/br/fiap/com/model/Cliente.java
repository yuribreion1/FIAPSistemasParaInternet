package br.fiap.com.model;

public class Cliente {
	private String nome;
	private String email;
	private String login;
	private String senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.length() > 40) {
			nome = "NOME INVALIDO";
		} else {
			this.nome.toUpperCase();
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.indexOf("@") < 0 || email.indexOf(".") < 0) {
			email = "erro@fiap.com.br";
		}
		this.email = email.toLowerCase();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		if (login.length() >= 8 && login.length() <= 15) {
			this.login = login;
		} else {
			login = null;
		}
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Cliente() {
		super();
	}

	public Cliente(String nome, String email, String login, String senha) {
		super();
		setNome(nome);;
		setEmail(email);
		setLogin(login);
		setSenha(senha);
	}

	public void setAll(String nome, String email, String login, String senha) {
		setNome(nome);;
		setEmail(email);
		setLogin(login);
		setSenha(senha);
	}
	
	public String getAll() { 
		return nome + "\n" + email + "\n" + login + "\n" + senha;
	}
}
