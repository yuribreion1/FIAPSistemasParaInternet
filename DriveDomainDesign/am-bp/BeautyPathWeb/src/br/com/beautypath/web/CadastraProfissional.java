package br.com.beautypath.web;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.beautypath.dao.ConnectionFactory;
import br.com.beautypath.dao.ProfissionalDAO;
import br.com.beautypath.modelo.Profissional;

@WebServlet(urlPatterns = "/cadastra-profissional")
public class CadastraProfissional extends HttpServlet {

	/**
	 * @author yuribreion
	 * @version 1.0
	 * @param req http request feito pelo servlet
	 * @param res http response feito pelo servlet
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Profissional prof = new Profissional();
		Connection conexao;
		try {
			conexao = ConnectionFactory.controlarInstancia().getConnection("rm79935", "300187");
			ProfissionalDAO dao = new ProfissionalDAO();

			prof.setNome(req.getParameter("nome"));
			prof.setTelefone(req.getParameter("telefone"));
			prof.setRegistro(req.getParameter("registro"));
			prof.setSocialUrl(req.getParameter("socialUrl"));
			prof.setSocialUrl1(req.getParameter("socialUrl1"));

			dao.gravar(prof, conexao);
			System.out.println("Profissional cadastrado com sucesso");
			res.sendRedirect("index.jsp");
			
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
