package br.com.beautypath.bo;

import java.sql.Connection;

import br.com.beautypath.dao.ConnectionFactory;
import br.com.beautypath.dao.EnderecoDAO;
import br.com.beautypath.excecao.Excecao;
import br.com.beautypath.modelo.Endereco;

public class EnderecoBO {

	public void cadastraEndereco(Endereco end) throws Exception {
		Connection c = ConnectionFactory.controlarInstancia().getConnection("rm79935", "300187");
		erroEndereco(end);
		new EnderecoDAO().gravar(end, c);
	}

	private void erroEndereco(Endereco end) throws Exception {
		if (end.getLogradouro().length() > 80) {
			throw Excecao.getErro(new Exception("Endereço não pode ter mais de 80 caracteres"));
		} else if (end.getCidade().length() > 50) {
			throw Excecao.getErro(new Exception("A cidade não pode ter mais de 50 caracteres"));
		}
	}
}
