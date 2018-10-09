package br.com.beautypath.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.beautypath.modelo.Endereco;

public class EnderecoDAO {
	
	/**
	 * @author yuribreion
	 * @version 1.0
	 * @param end			endereço
	 * @param conexao		conexao com o banco
	 * @exception sqlException
	 * @see Endereco
	 */


	private PreparedStatement ps;
	private ResultSet rs;
	
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
	
	public List<Endereco> getEnderecos(Connection conexao) throws Exception {
		String sql = "select * from rm79935.endereco order by 1 asc";
		List<Endereco> listaEnderecos = new ArrayList<Endereco>();
		ps = conexao.prepareStatement(sql);
		rs = ps.executeQuery();
		while (rs.next()) {
			Endereco end = new Endereco();
			end.setIdEndereco(rs.getInt("COD_END"));
			end.setLogradouro(rs.getString("LOGRADOURO"));
			end.setCidade(rs.getString("CIDADE"));
			end.setCep(rs.getString("CEP"));
			end.setEstado(rs.getString("ESTADO"));
			listaEnderecos.add(end);
		}
		rs.close();
		ps.close();
		return listaEnderecos;

	}


}