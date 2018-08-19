package br.com.fiap.teste;

import java.sql.SQLException;

import br.com.fiap.dao.ConnectionFactory;

public class TestaConexao {
	public static void main(String[] args) {
		
		
		try {
			new ConnectionFactory().getConnection();
			System.out.println("Conexão aberta");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				System.out.println("Conexão fechada");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
