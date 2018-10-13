package br.com.beautypath.excecao;

public class Excecao extends Exception{
	
	/**
	 * @author yuribreion
	 * @return Exception
	 * @param msg
	 * @param Exception e
	 */
	private static final long serialVersionUID = 1L;
	
	private String msg;
	
	public Excecao(String msg) {
		super(msg);
		this.msg = msg;
	}
	

	public static Exception getErro(Exception e) {
		if (e.getClass().getName().equals("java.lang.NumberFormatException")) {
			return new Exception("Erro de preenchimento, campo deve ser numerico\n");
		} else if (e.getClass().getName().equals("java.sql.SQLSyntaxErrorException")) {
			return new Exception("Erro na sintaxe do script sql");
		} else if (e.getClass().getName().equals("java.io.FileNotFoundException")) {
			return new Exception("Erro no carregamento do arquivo");
		} else if (e.getClass().getName().equals("java.sql.SQLIntegrityConstraintViolationException")) {
			return new Exception("Antes de inserir um registro para esta funcionalidade, inserir seus dependentes");
		} else if (e.getClass().getName().equals("java.sql.SQLRecoverableException")) {
			return new Exception("Banco de dados nao esta respondendo");
		}else {
			return new Exception(e.getMessage());
		}
	}
		
}
