package br.com.fiap.connection.factory;

public class Excecao extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static String tratarExcecao(Exception e) {
		if (e.getClass().getName().equals("java.lang.NumberFormatException")) {
			return "Favor usar números";
		} else if (e.getClass().getName().equals("java.lang.SQLException")) {
			return "Favor verificar banco de dados";
		}
		return "Houve um erro que não pode ser tratado";
	}
}
