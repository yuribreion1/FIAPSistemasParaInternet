package br.com.beautypath.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public final class ConnectionFactory {
	
	/**
	 * @author yuribreion
	 * @version 1.0
	 * @param url
	 * @param user			usuário de conexao
	 * @param password		senha de acesso
	 * @exception sqlException
	 */

	private static ConnectionFactory conexao = null;

	public static ConnectionFactory controlarInstancia() {
		if (conexao == null) {
			conexao = new ConnectionFactory();
		}
		return conexao;
	}

	public Connection getConnection(String user, String pw) throws Exception {
		String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
		return DriverManager.getConnection(url, user, pw);
	}
}