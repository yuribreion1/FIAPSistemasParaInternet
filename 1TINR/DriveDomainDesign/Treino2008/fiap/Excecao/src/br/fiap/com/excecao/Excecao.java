package br.fiap.com.excecao;

public class Excecao extends Exception {

	/**
	 * Aula de 06/08
	 * 
	 */
	private static final long serialVersionUID = 8049692509336543579L;

	public static String trataExcecao(Exception e) {
		if (e.getClass().getName().equals("java.lang.NumberFormatException")) {
			return "Número inválido, favor refazer a operação";
		} else if (e.getClass().getName().equals("java.sql.SQLException")) {
			return "Banco de dados indisponível";
		}
		return "Houve um erro que ainda não foi tratado";

	}
}
