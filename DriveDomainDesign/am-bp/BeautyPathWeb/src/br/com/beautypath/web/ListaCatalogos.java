package br.com.beautypath.web;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.beautypath.dao.CatalogoDAO;
import br.com.beautypath.dao.ConnectionFactory;
import br.com.beautypath.modelo.Catalogo;

@WebServlet(urlPatterns = "/lista-catalogo")
public class ListaCatalogos extends HttpServlet {

	/**
	 * @author yuribreion
	 * @version 1.0
	 * @param req	http request feito pelo servlet
	 * @param res	http response feito pelo servlet
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Connection conexao;
		try {
			conexao = ConnectionFactory.controlarInstancia().getConnection("rm79935", "300187");
			List<Catalogo> catalogos = new CatalogoDAO().getCatalogos(conexao);
			req.setAttribute("catalogos", catalogos);
			
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("listaCatalogo.jsp");
			dispatcher.forward(req, res);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
