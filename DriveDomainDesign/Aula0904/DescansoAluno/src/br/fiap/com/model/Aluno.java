package br.fiap.com.model;

public class Aluno {

	private String nome;
	private int rm;
	private double ps;
	private double am;
	private double nac;
	private int faltas;
	private Curso curso;
	private Endereco endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRm() {
		return rm;
	}

	public void setRm(int rm) {
		this.rm = rm;
	}

	public double getPs() {
		return ps;
	}

	public void setPs(double ps) {
		this.ps = ps;
	}

	public double getAm() {
		return am;
	}

	public void setAm(double am) {
		this.am = am;
	}

	public double getNac() {
		return nac;
	}

	public void setNac(double nac) {
		this.nac = nac;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Aluno(String nome, int rm, double ps, double am, double nac, int faltas, Curso curso, Endereco endereco) {
		super();
		this.nome = nome;
		this.rm = rm;
		this.ps = ps;
		this.am = am;
		this.nac = nac;
		this.faltas = faltas;
		this.curso = curso;
		this.endereco = endereco;
	}

	public Aluno() {
		super();
	}
}
