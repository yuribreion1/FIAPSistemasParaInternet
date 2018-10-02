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

import br.com.beautypath.dao.ConnectionFactory;
import br.com.beautypath.dao.ProfissionalDAO;
import br.com.beautypath.modelo.Profissional;

@WebServlet(urlPatterns = "/lista-profissional")
public class ListaProfissionais extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Connection conexao;
		try {
			conexao = ConnectionFactory.controlarInstancia().getConnection("rm79935", "300187");
			List<Profissional> profissionais = new ProfissionalDAO().getProfissionais(conexao);
			req.setAttribute("profissionais", profissionais);

			RequestDispatcher dispatcher = req.getRequestDispatcher("listaProfissional.jsp");
			dispatcher.forward(req, res);
			
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
