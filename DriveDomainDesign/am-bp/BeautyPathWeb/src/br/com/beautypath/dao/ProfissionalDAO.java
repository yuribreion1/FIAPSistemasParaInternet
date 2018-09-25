package br.com.beautypath.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.beautypath.modelo.Profissional;

public class ProfissionalDAO {

	private PreparedStatement ps;
	private Connection conexao;

	public ProfissionalDAO() throws Exception {
		this.conexao = new ConnectionFactory().getConnection();
	}
	
<<<<<<< HEAD
	public String gravar(Profissional prof, Connection conexao) throws SQLException {
		String sql = "insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (PROFISSIONAL_SEQ.NEXTVAL, ?, ?, ?, ?, ? )";
=======
	public String gravar(Profissional prof) throws SQLException {
		String sql = "insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL, ?, ?, ?, ?, ? )";
>>>>>>> b6d41cbb95e6c11889c51e0d9e196909d5dc5d36
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
	
	public int apagar(int numero) throws SQLException {
		String sql = "delete from rm79935.profissional where COD_PROF = ?";
		ps = conexao.prepareStatement(sql);
		ps.setInt(1, numero);
		return ps.executeUpdate();
	}


}
