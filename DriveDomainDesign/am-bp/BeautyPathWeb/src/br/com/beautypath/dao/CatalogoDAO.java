package br.com.beautypath.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.beautypath.modelo.Catalogo;

public class CatalogoDAO {

	private PreparedStatement ps;
	private ResultSet rs;

	public String gravar(Catalogo cat, Connection conexao) throws SQLException {
		String sql = "insert into rm79935.catalogo(COD_CAT, DESC_CAT) values (SEQ_CATALOGO.NEXTVAL, ?)";
		ps = conexao.prepareStatement(sql);
		ps.setString(1, cat.getDescricao());
		ps.execute();
		ps.close();
		return "Catalogo gravado com sucesso";
	}

	public int apagar(int numero, Connection conexao) throws SQLException {
		String sql = "delete from rm79935.catalogo where COD_CAT = ?";
		ps = conexao.prepareStatement(sql);
		ps.setInt(1, numero);
		return ps.executeUpdate();
	}

	public List<Catalogo> getCatalogos(Connection conexao) throws Exception {
		String sql = "select * from rm79935.catalogo";
		List<Catalogo> listaCatalogos = new ArrayList<Catalogo>();
		ps = conexao.prepareStatement(sql);
		rs = ps.executeQuery();
		while (rs.next()) {
			Catalogo cat = new Catalogo();
			cat.setIdCatelogo(rs.getInt("COD_CAT"));
			cat.setDescricao(rs.getString("DESC_CAT"));
			listaCatalogos.add(cat);
		}
		rs.close();
		ps.close();
		return listaCatalogos;

	}

}
