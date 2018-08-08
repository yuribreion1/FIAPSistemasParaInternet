package br.fiap.com.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Teste {

	public static void main(String[] args) {

		Connection conn = null;

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM79935", "300187");
			System.out.println("Conexao aberta");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				System.out.println("Conexao fechada");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
}
