package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.modelo.Endereco;

public class EnderecoDAO {

	private PreparedStatement st;
	private Connection conexao;
	private ResultSet rs;
	
	
	public EnderecoDAO() throws SQLException {
		this.conexao = new ConnectionFactory().getConnection();
	}
	
	public String gravar(Endereco end) throws SQLException {
		//1 montar a query
		String sql = "INSERT INTO T_DDD_ENDERECO(CD_ENDERECO, NM_LOGRADOURO, NR_ENDERECO, NR_CEP) VALUES (?, ?, ?, ?) ";
		st = conexao.prepareStatement(sql);
		//2 definir parametros
		st.setInt(1, end.getCodigo());
		st.setString(2, end.getLogradouro());
		st.setString(3, end.getNumero());
		st.setString(4, end.getCep());
		st.execute();
		st.close();
		return "Gravado com sucesso";
	}
	
	public List<Endereco> getEnderecos() throws SQLException {
		String sql = "select * from rm79935.t_ddd_endereco";
		List<Endereco> listaEndereco = new ArrayList<Endereco>();
		st = this.conexao.prepareStatement(sql);
		rs = st.executeQuery();
		while (rs.next()) {
			Endereco end = new Endereco();
			end.setCodigo(rs.getInt("CD_ENDERECO"));
			end.setLogradouro(rs.getString("NM_LOGRADOURO"));
			end.setNumero(rs.getString("NM_ENDERECO"));
			end.setCep(rs.getString("NR_CEP"));
			listaEndereco.add(end);
		}
		st.close();
		rs.close();
		return listaEndereco;
		
	}
	
	public Endereco consultaPorCodigo(int codigo) throws SQLException {
		st = conexao.prepareStatement("SELECT * FROM T_DDD_ENDERECO WHERE CD_ENDERECO = ?");
		st.setInt(1, codigo);
		rs = st.executeQuery();
		if (rs.next()) {
			return new Endereco(
					rs.getInt("CD_ENDERECO"),
					rs.getString("NM_LOGRADOURO"),
					rs.getString("NR_ENDERECO"),
					rs.getString("NR_CEP")
					);
		} else {
			return new Endereco();
		}
	}
	
}
