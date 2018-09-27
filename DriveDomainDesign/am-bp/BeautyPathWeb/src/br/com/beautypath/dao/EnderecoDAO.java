package br.com.beautypath.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.beautypath.modelo.Endereco;

public class EnderecoDAO {
	
	/**
	 * @author yuribreion
	 * @version 1.0
	 * @param end			endereço
	 * @param conexao		conexao com o banco
	 * @exception sqlException
	 * @return gravar 		endereco gravado no banco
	 * @return apagar		apagar endereco do banco
	 */


	private PreparedStatement ps;
	
	public String gravar(Endereco end, Connection conexao) throws SQLException {
		String sql = "insert into rm79935.endereco(COD_END, LOGRADOURO, CIDADE, CEP, ESTADO) values (SEQ_ENDERECO.NEXTVAL, ?, ?, ?, ?)";
		ps = conexao.prepareStatement(sql);
		ps.setString(1, end.getLogradouro());
		ps.setString(2, end.getCidade());
		ps.setString(3, end.getCep());
		ps.setString(4, end.getEstado());
		ps.execute();
		ps.close();
		return "Endereco gravado com sucesso";
	}
	
	public int apagar(int numero, Connection conexao) throws SQLException {
		String sql = "delete from rm79935.endereco where COD_END = ?";
		ps = conexao.prepareStatement(sql);
		ps.setInt(1, numero);
		return ps.executeUpdate();
	}

}