package br.com.beautypath.excecao;

public class Excecao extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Excecao(String msg, Throwable cause) {
		super(msg, cause);
	}
	

	public static String getErro(Exception e) {
		if (e.getClass().getName().equals("java.lang.NumberFormatException")) {
			return "Erro de preenchimento\n";
		} else if (e.getClass().getName().equals("java.sql.SQLSyntaxErrorException")) {
			System.out.println("Erro na sintaxe do script sql");
		} else if (e.getClass().getName().equals("java.io.FileNotFoundException")) {
			System.out.println("Erro no carregamento do arquivo");
		} else if (e.getClass().getName().equals("java.sql.SQLIntegrityConstraintViolationException")) {
			System.out.println("Antes de inserir um registro para esta funcionálidade, inserir seus dependentes");
		} else if (e.getClass().getName().equals("java.sql.SQLRecoverableException")) {
			System.out.println("Banco de dados não esta respondendo");
		}else {
			return "Erro ainda nao mapeado";
		}
		return "Houve um erro";
	}
	
}
