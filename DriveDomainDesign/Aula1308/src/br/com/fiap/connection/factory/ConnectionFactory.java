package br.com.fiap.connection.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConnectionFactory {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		
//		int codigoCliente = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do cliente"));
		String nomeCliente = JOptionPane.showInputDialog("Digite o nome: ").toUpperCase();

//		String query = "select * from rm79935.t_ddd_cliente where nr_cliente =" + codigoCliente;
		String query = ("select * from rm79935.t_ddd_cliente where NM_CLIENTE = '"+nomeCliente+"'");
		

		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM79935", "300187");
			stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(query);

			if (rs.next()) {
				System.out.println("Logado com sucesso");
				int nrCliente = rs.getInt("NR_CLIENTE");
				String nmCliente = rs.getString("NM_CLIENTE");
				int qntEstrelas = rs.getInt("QNT_ESTRELAS");
				
				System.out.println(nrCliente + "\t" + nmCliente + "\t" + qntEstrelas + "\t");
			} else {
				System.out.println("Não foi possível logar");
			}

		} catch (Exception e) {
			System.out.println("Número inserido foi:" + Excecao.tratarExcecao(e));
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception e2) {
				System.out.println("Houve um erro: " + Excecao.tratarExcecao(e2));
				e2.printStackTrace();
			}
		}
	}

}
