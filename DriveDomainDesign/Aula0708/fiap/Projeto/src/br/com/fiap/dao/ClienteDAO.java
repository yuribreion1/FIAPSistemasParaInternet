package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.modelo.Cliente;

public class ClienteDAO {

	private Connection conexao;

	public ClienteDAO() throws Exception {
		this.conexao = new ConnectionFactory().getConnection();
	}

	public void gravar(Cliente cli) throws Exception {
		String sql = "insert into RM79935.T_DDD_CLIENTE" + "(NR_CLIENTE, NM_CLIENTE, QNT_ESTRELAS)" + "VALUES (?,?,?)";

		PreparedStatement ps = conexao.prepareStatement(sql);
		ps.setInt(1, cli.getNumeroCliente());
		ps.setString(2, cli.getNomeCliente());
		ps.setInt(3, cli.getQntEstrelas());
		ps.execute();
		ps.close();
	}

	public List<Cliente> getClientes() throws Exception {
		String sql = "select * from RM79935.T_DDD_CLIENTE";
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		PreparedStatement ps = this.conexao.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Cliente cli = new Cliente();
			cli.setNumeroCliente(rs.getInt("NR_CLIENTE"));
			cli.setNomeCliente(rs.getString("NM_CLIENTE"));
			cli.setQntEstrelas(rs.getInt("QNT_ESTRELAS"));
			listaCliente.add(cli);
		}
		rs.close();
		ps.close();

		return listaCliente;

	}

	public Cliente getPesquisaClientePorNome(String nomeCliente) throws SQLException {
		String sql = "select * from RM79935.T_DDD_CLIENTE where NM_CLIENTE = ?";
		Cliente cli = new Cliente();
		PreparedStatement ps = this.conexao.prepareStatement(sql);
		ps.setString(1, nomeCliente);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			cli.setNumeroCliente(rs.getInt("NR_CLIENTE"));
			cli.setNomeCliente(rs.getString("NM_CLIENTE"));
			cli.setQntEstrelas(rs.getInt("QNT_ESTRELAS"));
		}
		rs.close();
		ps.close();
		return cli;
	}

}
