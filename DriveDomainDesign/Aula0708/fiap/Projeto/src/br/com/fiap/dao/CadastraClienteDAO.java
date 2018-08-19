package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.fiap.model.Cliente;

public class CadastraClienteDAO {

	private Connection conexao;

	public CadastraClienteDAO() throws Exception {
		this.conexao = new ConnectionFactory().getConnection();
	}

	public void gravar(Cliente cli) throws Exception {
		String sql = "insert into T_DDD_CLIENTE" + "(NR_CLIENTE, NM_CLIENTE, QNT_ESTRELAS) values" + "(?,?,?)";

		PreparedStatement ps = conexao.prepareStatement(sql);
		ps.setInt(1, cli.getNumeroCliente());
		ps.setString(2, cli.getNomeCliente());
		ps.setInt(3, cli.getQntEstrelas());
		ps.execute();
		ps.close();
	}
}
