package br.com.beautypath.web;

import java.io.IOException;
import java.sql.Connection;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.beautypath.dao.ClienteDAO;
import br.com.beautypath.dao.ConnectionFactory;

@WebServlet(urlPatterns = "lista-clientes")
public class ListaClientes extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final Logger LOGGER = Logger.getLogger("Logger");
	
	protected void doGet (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Connection conexao;
		
		try {
			conexao = ConnectionFactory.controlarInstancia().getConnection("rm79935", "300187");
			ClienteDAO dao = new ClienteDAO();
			
			dao.getClientes(conexao);
			LOGGER.info("Clientes listados");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
