package br.com.beautypath.bo;

import java.sql.Connection;

import br.com.beautypath.dao.CatalogoDAO;
import br.com.beautypath.dao.ConnectionFactory;
import br.com.beautypath.excecao.Excecao;
import br.com.beautypath.modelo.Catalogo;

public class CatalogoBO {
	
	/** 
	 * @author yuribreion
	 * @see CatalogoDAO
	 * @see Catalogo
	 * @param cat
	 * @throws Exception
	 */

	public void cadastraCatalogo(Catalogo cat) throws Exception {
		Connection c = ConnectionFactory.controlarInstancia().getConnection("rm79935", "300187");
		erroCatalogo(cat);
		new CatalogoDAO().gravar(cat, c);
	}
	
	private void erroCatalogo(Catalogo cat) throws Exception {
		if (cat.getDescricao().length() > 100) {
			throw Excecao.getErro(new Exception("Campo não pode ter mais de 100 caracteres"));
		}
	}

}
