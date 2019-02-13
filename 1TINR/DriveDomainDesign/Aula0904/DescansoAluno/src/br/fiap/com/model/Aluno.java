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
		
		if (nome.equalsIgnoreCase("churros")) {
			nome = "NOME INVALIDO";
		}
		
		//Restricao para nao fazer o banco derrubar a aplicacao
		if (nome.length() > 40) {
			//Pegando somente os 40 primeiros registros
			nome = nome.substring(0, 40);
		} else {
			this.nome = nome.toUpperCase();
		}
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
		setNome(nome);
		setRm(rm);
		setPs(ps);
		setNac(nac);
		setAm(am);
		setFaltas(faltas);
		setCurso(curso);
		setEndereco(endereco);
	}

	public Aluno() {
		super();
	}
	
	public String getPrimeiroNome() {
		//Tratamento para ter certeza que ha espaco
		if (nome.indexOf(" ") >= 0) {
			//Tratamento para contar a primeira posicao ate o primeiro espaco
			return nome.substring(0, nome.indexOf(" "));
		} else {
			return null;
		}
		
	}
	
	public String getSobreNome() {
		if (nome.indexOf(" ") >= 0) {
			//Pegando a proxima posicao depois do espaco
			return nome.substring(nome.indexOf(" ") + 1, nome.length()); 
		} else {
			return nome;
		}
	}

	public double getMedia() {
		return ((ps * .50) + (am * .30) + (nac * .20));
	}
	
	public String getStatus() {
		if(getFaltas() < 40) { 
			//Criando variavel para melhorar performance
			double media = getMedia();
			if (media >= 6) {
				return "Aprovado";
			} else if (media < 4) { 
			return "Reprovado";
		}
		return "Exame";
		} else {
			return "Reprovado por falta";
		}
		
		}
}
