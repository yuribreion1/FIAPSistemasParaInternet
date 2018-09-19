package br.com.beautypath.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private String host = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
	private String user = "RM79935";
	private String pw = "300187";

	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(host, user, pw);
	}
}