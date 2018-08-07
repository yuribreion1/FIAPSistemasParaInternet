package br.fiap.com.teste;

import java.sql.DriverManager;

public class Teste {
	public static void main(String[] args) {
		//url: jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL
		//user: RM79935
		//pw: 300187
		DriverManager.getConnection("jdbc:oracle:thin:@localhost", user, password)
		
	}
}
