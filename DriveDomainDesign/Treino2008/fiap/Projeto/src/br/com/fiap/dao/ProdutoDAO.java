package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.modelo.Produto;

public class ProdutoDAO {

	private Connection conexao;

	public ProdutoDAO() throws SQLException {
		this.conexao = new ConnectionFactory().getConnection();
	}

	public void gravar(Produto prod) throws SQLException {
		String sql = "insert into rm79935.t_ddd_produto(CD_PRODUTO, NM_PRODUTO, VL_PRODUTO) values (?,?,?)";

		PreparedStatement ps = this.conexao.prepareStatement(sql);
		ps.setInt(1, prod.getCodigoProduto());
		ps.setString(2, prod.getNomeProduto());
		ps.setInt(3, prod.getValorProduto());
		ps.execute();
		ps.close();

	}

	public List<Produto> getProdutos() throws SQLException {
		String sql = "select * from rm79935.t_ddd_produto";
		List<Produto> listaProdutos = new ArrayList<Produto>();
		PreparedStatement ps = this.conexao.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Produto prod = new Produto();
			prod.setCodigoProduto(rs.getInt("CD_PRODUTO"));
			prod.setNomeProduto(rs.getString("NM_PRODUTO"));
			prod.setValorProduto(rs.getInt("VL_PRODUTO"));
			listaProdutos.add(prod);
		}
		ps.close();
		rs.close();
		return listaProdutos;
	}

	public List<Produto> getPesquisaPorNome(String strProduto) throws SQLException {
		String sql = "select * from rm79935.t_ddd_produto where nm_produto like ?";
		List<Produto> buscaProduto = new ArrayList<Produto>();
		PreparedStatement ps = this.conexao.prepareStatement(sql);
		ps.setString(1, "%" + strProduto + "%");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Produto prod = new Produto();
			prod.setCodigoProduto(rs.getInt("CD_PRODUTO"));
			prod.setNomeProduto(rs.getString("NM_PRODUTO"));
			prod.setValorProduto(rs.getInt("VL_PRODUTO"));
			buscaProduto.add(prod);
		}
		ps.close();
		rs.close();
		return buscaProduto;
	}
}
