package br.com.beautypath.modelo;

public class Profissional {
	private int idProfissional;
	private String nome;
	private String telefone;
	private String registro;
	private String socialUrl;
	private String socialUrl1;

	public int getIdProfissional() {
		return idProfissional;
	}

	public void setIdProfissional(int idProfissional) {
		this.idProfissional = idProfissional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 30) {
			this.nome = nome.substring(0, 30);
		} else {
			this.nome = nome;
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

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		if (registro.length() > 30) {
			this.registro = registro.substring(0, 30);
		} else {
			this.registro = registro;
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

	public String getSocialUrl1() {
		return socialUrl1;
	}

	public void setSocialUrl1(String socialUrl1) {
		if (socialUrl1.length() > 80) {
			this.socialUrl1 = socialUrl1.substring(0, 80);
		} else {
			this.socialUrl1 = socialUrl1;
		}
	}

	public Profissional(int idProfissional, String nome, String telefone, String registro, String socialUrl,
			String socialUrl1) {
		super();
		setIdProfissional(idProfissional);
		setNome(nome);
		setTelefone(telefone);
		setRegistro(registro);
		setSocialUrl(socialUrl1);
		setSocialUrl1(socialUrl1);
	}

	public Profissional() {

	}

}
