package br.com.ps.model;

public class Aluno {
	private String nome;
	private String matricula;
	private String email;
	private Curso curso;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 30) {
			this.nome = "Nome inválido";
		} else {
			this.nome = nome.toUpperCase();
		}
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		if (matricula.matches("[0-9]+")) {
			this.matricula = matricula;
		} else {
			this.matricula = "Matricula inválida";
		}

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.indexOf("@") < 0 && email.indexOf(".") < 0) {
			this.email = "erro@empresa.com";
		} else {
			this.email = email.toLowerCase();
		}

	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}
