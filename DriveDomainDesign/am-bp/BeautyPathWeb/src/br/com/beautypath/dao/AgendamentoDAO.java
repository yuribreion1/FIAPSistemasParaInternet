package br.com.beautypath.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

import br.com.beautypath.modelo.Agendamento;
import br.com.beautypath.modelo.Cliente;
import br.com.beautypath.modelo.Endereco;
import br.com.beautypath.modelo.Profissional;

public class AgendamentoDAO {
	
	/**
	 * @author yuribreion
	 * @version 1.0
	 * @param agd			agendamento
	 * @param conexao		conexao com o banco
	 * @exception sqlException
	 * @return gravar 		cliente gravado no banco
	 */
	
	private PreparedStatement ps;
	
	Cliente cli = new Cliente();
	Profissional prof = new Profissional();
	Endereco end = new Endereco();
	
	public String gravar(Agendamento agd, Connection conexao) throws SQLException {
		String sql = "insert into rm79935.agendamento(COD_AGD, DATA_AGD, HORA_AGD, COD_CLI, COD_PROF, OBS, COD_END) values (SEQ_AGENDAMENTO.NEXTVAL, ?, ?, ?, ?, ?, ? )";
		ps = conexao.prepareStatement(sql);
		ps.setDate(1, new Date(agd.getData().getTimeInMillis()));
		ps.setTimestamp(2, new Timestamp(agd.getHora().getTimeInMillis()));
		ps.setInt(3, cli.getIdCliente());
		ps.setInt(4, prof.getIdProfissional());
		ps.setString(5, agd.getObs());
		ps.setInt(6, end.getIdEndereco());
		ps.execute();
		ps.close();
		return "Agendamento gravado com sucesso";
	}
}
