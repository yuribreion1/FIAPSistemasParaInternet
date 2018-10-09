package br.com.beautypath.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.beautypath.modelo.Cliente;

public class ClienteDAO {

	private PreparedStatement ps;
	private ResultSet rs;

	/**
	 * @author yuribreion
	 * @version 1.0
	 * @param cli     cliente
	 * @param conexao conexao com o banco
	 * @exception sqlException
	 * @return gravar catalogo gravado no banco
	 * @return apagar apagar catalogo do banco
	 * @return getClientes lista os clientes no banco
	 */

	public String gravar(Cliente cli, Connection conexao) throws SQLException {
		String sql = "insert into rm79935.cliente(COD_CLI, NOME_CLI, TEL_CLI, EMAIL_CLI, SOCIAL_URL_CLI) values (SEQ_CLIENTE.NEXTVAL, ?, ?, ?, ?)";
		ps = conexao.prepareStatement(sql);
		ps.setString(1, cli.getNome());
		ps.setString(2, cli.getTelefone());
		ps.setString(3, cli.getEmail());
		ps.setString(4, cli.getSocialUrl());
		ps.execute();
		ps.close();
		return "Cliente gravado com sucesso";
	}

	/**
	 * 
	 * @param numero
	 * @return execucao do comando delete na tabela
	 * @throws SQLException
	 * @author Yuri Breion
	 */
	public int apagar(int numero, Connection conexao) throws SQLException {
		String sql = "delete from rm79935.cliente where COD_CLI = ?";
		ps = conexao.prepareStatement(sql);
		ps.setInt(1, numero);
		return ps.executeUpdate();
	}

	public List<Cliente> getClientes(Connection conexao) throws SQLException {
		String sql = "select * from rm79935.cliente order by 1 asc";
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		ps = conexao.prepareStatement(sql);
		rs = ps.executeQuery();
		while (rs.next()) {
			Cliente cli = new Cliente();
			cli.setIdCliente(rs.getInt("COD_CLI"));
			cli.setNome(rs.getString("NOME_CLI"));
			cli.setTelefone(rs.getString("TEL_CLI"));
			cli.setEmail(rs.getString("EMAIL_CLI"));
			cli.setSocialUrl(rs.getString("SOCIAL_URL_CLI"));
			listaClientes.add(cli);
		}
		rs.close();
		ps.close();
		return listaClientes;
	}
	
	// SELECT * FROM RM79935.CLIENTE WHERE NOME LIKE ?

	public List<Cliente> getPesquisaClientePorNome(String nomeCliente, Connection conexao) throws SQLException {
		String sql = "SELECT * FROM RM79935.CLIENTE WHERE NOME_CLI LIKE ?";
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		ps = conexao.prepareStatement(sql);
		ps.setString(1, "%" + nomeCliente + "%");
//		ps.setString(1, nomeCliente);
		rs = ps.executeQuery();
		while (rs.next()) {
			Cliente cli = new Cliente();
			cli.setIdCliente(rs.getInt("COD_CLI"));
			cli.setNome(rs.getString("NOME_CLI"));
			cli.setTelefone(rs.getString("TEL_CLI"));
			cli.setEmail(rs.getString("EMAIL_CLI"));
			cli.setSocialUrl(rs.getString("SOCIAL_URL_CLI"));
			listaClientes.add(cli);
		}
		rs.close();
		ps.close();
		return listaClientes;
}

}