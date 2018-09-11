package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.modelo.Cliente;
import br.com.fiap.modelo.Endereco;

public class ClienteDAO {

	private Connection conexao;
	private PreparedStatement ps;
	private ResultSet rs;

	public ClienteDAO() throws Exception {
		this.conexao = new ConnectionFactory().getConnection();
	}

	public void gravar(Cliente cli) throws Exception {
		String sql = "insert into RM79935.T_DDD_CLIENTE" + "(NR_CLIENTE, NM_CLIENTE, QNT_ESTRELAS, CD_ENDERECO)" + "VALUES (?,?,?,?)";

		ps = conexao.prepareStatement(sql);
		ps.setInt(1, cli.getNumeroCliente());
		ps.setString(2, cli.getNomeCliente());
		ps.setInt(3, cli.getQntEstrelas());
		ps.setInt(4, cli.getEndereco().getCodigo());
		ps.execute();
		ps.close();
	}

	/*
	 * Usamos o list para agrupar todas as possibilidades que fazem parte do tipo
	 * lista como Vector ou LinkedList
	 */

	public List<Cliente> getClientes() throws Exception {
		String sql = "select * from RM79935.T_DDD_CLIENTE INNER JOIN T_DDD_ENDERECO ON (RM79935.T_DDD_CLIENTE.CLI.CD_ENDERECO = RM79935.T_DDD_ENDERECO.CD_ENDERECO)";
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		ps = this.conexao.prepareStatement(sql);
		rs = ps.executeQuery();
		while (rs.next()) {
			Cliente cli = new Cliente();
			Endereco end = new Endereco();
			cli.setNumeroCliente(rs.getInt("NR_CLIENTE"));
			cli.setNomeCliente(rs.getString("NM_CLIENTE"));
			cli.setQntEstrelas(rs.getInt("QNT_ESTRELAS"));
			end.setCodigo(rs.getInt("CD_ENDERECO"));
			end.setLogradouro(rs.getString("NM_LOGRADOURO"));
			end.setNumero(rs.getString("NR_ENDERECO"));
			end.setCep(rs.getString("NR_CEP"));
			listaCliente.add(cli);
		}
		rs.close();
		ps.close();

		return listaCliente;

	}

	public List<Cliente> getPesquisaClientePorNome(String nomeCliente) throws SQLException {
		String sql = "select * from RM79935.T_DDD_CLIENTE INNER JOIN T_DDD_ENDERECO ON (RM79935.T_DDD_CLIENTE.CLI.CD_ENDERECO = RM79935.T_DDD_ENDERECO.CD_ENDERECO) where NM_CLIENTE like ?";
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		ps = this.conexao.prepareStatement(sql);
		ps.setString(1, "%" + nomeCliente + "%");
		rs = ps.executeQuery();
		while (rs.next()) {
			Cliente cli = new Cliente();
			Endereco end = new Endereco();
			cli.setNumeroCliente(rs.getInt("NR_CLIENTE"));
			cli.setNomeCliente(rs.getString("NM_CLIENTE"));
			cli.setQntEstrelas(rs.getInt("QNT_ESTRELAS"));
			end.setCodigo(rs.getInt("CD_ENDERECO"));
			end.setLogradouro(rs.getString("NM_LOGRADOURO"));
			end.setNumero(rs.getString("NR_ENDERECO"));
			end.setCep(rs.getString("NR_CEP"));
			listaClientes.add(cli);
		}
		rs.close();
		ps.close();
		return listaClientes;
	}
	
	public int promover(int numeroCliente) throws SQLException {
		
		String sql = "update RM79935.T_DDD_CLIENTE SET QNT_ESTRELAS = QNT_ESTRELAS + 1 WHERE NM_CLIENTE=?";
		ps = conexao.prepareStatement(sql);
		ps.setInt(1, numeroCliente);
		return ps.executeUpdate();
	}
	
	public int apagar(int numeroCliente) throws SQLException {
		String sql = "delete from RM79935.T_DDD_CLIENTE where NR_CLIENTE = ?";
		ps = conexao.prepareStatement(sql);
		ps.setInt(1, numeroCliente);
		return ps.executeUpdate();		
	}

}
