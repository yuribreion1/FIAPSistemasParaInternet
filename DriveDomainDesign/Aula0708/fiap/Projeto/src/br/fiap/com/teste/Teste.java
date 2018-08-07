package br.fiap.com.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Teste {

	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM79935", "300187");
		
		try {
			System.out.println("Conexão aberta");
		} finally {
			conn.close();
			System.out.println("Conexão fechada");
		}
		
	}
}
