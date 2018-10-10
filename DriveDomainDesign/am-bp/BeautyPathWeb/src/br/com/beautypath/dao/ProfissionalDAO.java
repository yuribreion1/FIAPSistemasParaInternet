package br.com.beautypath.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	private ResultSet rs;
	
	public String gravar(Profissional prof, Connection conexao) throws SQLException {
		String sql = "insert into rm79935.profissional(COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF) values (SEQ_PROFISSIONAL.NEXTVAL, ?, ?, ?, ?, ? )";
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
	
	public List<Profissional> getProfissionais(Connection conexao) throws Exception {
		String sql = "SELECT COD_PROF, NOME_PROF, TEL_PROF, REG_PROF, SOCIAL_URL_1_PROF, SOCIAL_URL_2_PROF FROM RM79935.PROFISSIONAL";
		List<Profissional> listaProfissionals = new ArrayList<Profissional>();
		ps = conexao.prepareStatement(sql);
		rs = ps.executeQuery();
		while (rs.next()) {
			Profissional prof = new Profissional();
			prof.setIdProfissional(rs.getInt("COD_PROF"));
			prof.setNome(rs.getString("NOME_PROF"));
			prof.setTelefone(rs.getString("TEL_PROF"));
			prof.setRegistro("REG_PROF");
			prof.setSocialUrl(rs.getString("SOCIAL_URL_1_PROF"));
			prof.setSocialUrl1(rs.getString("SOCIAL_URL_2_PROF"));
			listaProfissionals.add(prof);
		}
		rs.close();
		ps.close();
		return listaProfissionals;

	}
}