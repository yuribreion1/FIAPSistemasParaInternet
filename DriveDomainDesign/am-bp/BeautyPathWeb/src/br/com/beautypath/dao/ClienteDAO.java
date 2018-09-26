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
	 * 
	 * @param Cliente
	 * @return executa o comando insert na tabela
	 * @throws SQLException
	 * @author Yuri Breion
	 * @see Clientes + gravar(): Recebe um cliente como parametro
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
		String sql = "select * from rm79935.cliente";
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
}