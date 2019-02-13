package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.modelo.Telefone;

public class TelefoneDAO {

	private Connection conexao;

	public TelefoneDAO() throws SQLException {
		this.conexao = new ConnectionFactory().getConnection();
	}

	public void gravar(Telefone tel) throws SQLException {
		String sql = "insert into RM79935.T_LTP_TELEFONE" + "(NR_DDD, NR_TELEFONE, NR_CLIENTE, CD_TELEFONE)"
				+ "VALUES(?, ?, ?, ?)";

		PreparedStatement ps = conexao.prepareStatement(sql);
		ps.setInt(1, tel.getDdd());
		ps.setString(2, tel.getNumero());
		ps.setInt(3, tel.getNumeroCliente());
		ps.setInt(4, tel.getCodigoTelefone());
		ps.execute();
		ps.close();
	}

	public List<Telefone> getTelefones() throws SQLException {
		String sql = "select * from RM79935.T_LTP_TELEFONE";
		List<Telefone> listaTelefones = new ArrayList<Telefone>();
		PreparedStatement ps = this.conexao.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Telefone tel = new Telefone();
			tel.setDdd(rs.getInt("NR_DDD"));
			tel.setNumero(rs.getString("NR_TELEFONE"));
			tel.setNumeroCliente(rs.getInt("NR_CLIENTE"));
			tel.setCodigoTelefone(rs.getInt("CD_TELEFONE"));
			listaTelefones.add(tel);
		}
		rs.close();
		ps.close();
		return listaTelefones;
	}
}
