package br.com.beautypath.bo;

import java.sql.Connection;

import br.com.beautypath.dao.ConnectionFactory;
import br.com.beautypath.dao.ProfissionalDAO;
import br.com.beautypath.excecao.Excecao;
import br.com.beautypath.modelo.Profissional;

public class ProfissionalBO {
	
	public void cadastraProfissional(Profissional prof) throws Exception {
		Connection c = ConnectionFactory.controlarInstancia().getConnection("rm79935", "300187");
		erroProfissional(prof);
		new ProfissionalDAO().gravar(prof, c);
	}
	
	/**
	 * @author yuribreion
	 * @see ProfissionalDAO
	 * @see Profissional
	 * @param prof
	 * @throws Exception 
	 */

	private void erroProfissional(Profissional prof) throws Exception {
		if (prof.getNome().length() > 30) {
			throw Excecao.getErro(new Exception("O nome não pode ter mais de 30 caracteres"));
		} else if (prof.getTelefone().length() > 16) {
			throw Excecao.getErro(new Exception("O telefone não deve ter mais de 16 caracteres"));
		}
		
	}

}
