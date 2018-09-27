package br.com.beautypath.web;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.beautypath.dao.CatalogoDAO;
import br.com.beautypath.dao.ConnectionFactory;
import br.com.beautypath.modelo.Catalogo;

@WebServlet(urlPatterns = "/cadastra-catalogo")
public class CadastraCatalogo extends HttpServlet {

	/**
	 * @author yuribreion
	 * @version 1.0
	 * @param req	http request feito pelo servlet
	 * @param res	http response feito pelo servlet
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		Catalogo cat = new Catalogo();
		Connection conexao;
		
		try {
			conexao = ConnectionFactory.controlarInstancia().getConnection("rm79935", "300187");
			CatalogoDAO dao = new CatalogoDAO();
			
			cat.setDescricao(req.getParameter("descricao"));
			
			dao.gravar(cat, conexao);
			res.sendRedirect("index.jsp");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
