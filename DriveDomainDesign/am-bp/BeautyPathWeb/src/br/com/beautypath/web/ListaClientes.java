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

import br.com.beautypath.dao.ClienteDAO;
import br.com.beautypath.dao.ConnectionFactory;
import br.com.beautypath.modelo.Cliente;

@WebServlet(urlPatterns = "/lista-cliente")
public class ListaClientes extends HttpServlet {

	/**
	 * @author yuribreion
	 * @version 1.0
	 * @param req http request feito pelo servlet
	 * @param res http response feito pelo servlet
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Connection conexao;
		try {
			conexao = ConnectionFactory.controlarInstancia().getConnection("rm79935", "300187");
			List<Cliente> clientes = new ClienteDAO().getClientes(conexao);
			req.setAttribute("clientes", clientes);

			RequestDispatcher dispatcher = req.getRequestDispatcher("listaCliente.jsp");
			dispatcher.forward(req, res);

			conexao.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
