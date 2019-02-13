package br.com.beautypath.web;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.beautypath.bo.ClienteBO;
import br.com.beautypath.dao.ConnectionFactory;
import br.com.beautypath.modelo.Cliente;

@WebServlet(urlPatterns = "/cadastra-cliente")
public class CadastraCliente extends HttpServlet {

	/**
	 * @author yuribreion
	 * @version 1.0
	 * @param req http request feito pelo servlet
	 * @param res http response feito pelo servlet
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		Cliente cli = new Cliente();
		Connection conexao;
		try {
			conexao = ConnectionFactory.controlarInstancia().getConnection("rm79935", "300187");
			ClienteBO bo = new ClienteBO();

			cli.setNome(req.getParameter("nome"));
			cli.setTelefone(req.getParameter("telefone"));
			cli.setEmail(req.getParameter("email"));
			cli.setSocialUrl(req.getParameter("socialUrl"));

			bo.cadastraCliente(cli);
			conexao.close();
			res.sendRedirect("index.jsp");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}