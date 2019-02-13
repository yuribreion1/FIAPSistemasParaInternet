package br.com.beautypath.bo;

import java.sql.Connection;
import java.util.List;

import br.com.beautypath.dao.ConnectionFactory;
import br.com.beautypath.dao.EnderecoDAO;
import br.com.beautypath.excecao.Excecao;
import br.com.beautypath.modelo.Endereco;

public class EnderecoBO {
	
	/**
	 * @author yuribreion
	 * @version 1.0
	 * @param end
	 * @throws Exception
	 * @see Endereco
	 * @see EnderecoDAO
	 */

	public void cadastraEndereco(Endereco end) throws Exception {
		Connection conexao = ConnectionFactory.controlarInstancia().getConnection("rm79935", "300187");
		erroEndereco(end);
		new EnderecoDAO().gravar(end, conexao);
	}
	
	public List<Endereco> listaEnderecos() throws Exception {
		Connection conexao = ConnectionFactory.controlarInstancia().getConnection("rm79935", "300187");
		return new EnderecoDAO().getEnderecos(conexao);
	}


	private void erroEndereco(Endereco end) throws Exception {
		if (end.getLogradouro().length() > 80) {
			throw Excecao.getErro(new Exception("Endereco nao pode ter mais de 80 caracteres"));
		} else if (end.getCidade().length() > 50) {
			throw Excecao.getErro(new Exception("A cidade nao pode ter mais de 50 caracteres"));
		}
	}
}
