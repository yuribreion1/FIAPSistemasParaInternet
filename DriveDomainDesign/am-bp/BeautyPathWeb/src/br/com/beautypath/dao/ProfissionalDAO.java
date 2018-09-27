package br.com.beautypath.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.beautypath.modelo.Profissional;

public class ProfissionalDAO {
	
	/**
	 * @author yuribreion
	 * @version 1.0
	 * @param prof			profissional
	 * @param conexao		conexao com o banco
	 * @exception sqlException
	 * @return gravar 		profissional gravado no banco
	 * @return apagar		apagar profissional do banco
	 */


	private PreparedStatement ps;
	
	public String gravar(Profissional prof, Connection conexao) throws SQLException {
		String sql = "insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL, ?, ?, ?, ?, ? )";
		ps = conexao.prepareStatement(sql);
		ps.setString(1, prof.getNome());
		ps.setString(2, prof.getTelefone());
		ps.setString(3, prof.getRegistro());
		ps.setString(4, prof.getSocialUrl());
		ps.setString(5, prof.getSocialUrl1());
		ps.execute();
		ps.close();
		return "Profissional gravado com sucesso";
	}
	
	public int apagar(int numero, Connection conexao) throws SQLException {
		String sql = "delete from rm79935.profissional where COD_PROF = ?";
		ps = conexao.prepareStatement(sql);
		ps.setInt(1, numero);
		return ps.executeUpdate();
	}


}