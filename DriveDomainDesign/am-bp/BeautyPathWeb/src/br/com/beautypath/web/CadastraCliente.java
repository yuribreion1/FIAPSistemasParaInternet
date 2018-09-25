package br.com.beautypath.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.beautypath.dao.ClienteDAO;
import br.com.beautypath.modelo.Cliente;

@WebServlet(urlPatterns = "/cadastra-cliente")
public class CadastraCliente extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		Cliente cli = new Cliente();
		try {
			ClienteDAO dao = new ClienteDAO();
			
			cli.setNome(req.getParameter("nome"));
			cli.setTelefone(req.getParameter("telefone"));
			cli.setEmail(req.getParameter("email"));
			cli.setSocialUrl(req.getParameter("socialUrl"));
			
<<<<<<< HEAD
			dao.gravar(cli, conexao);
			System.out.println("Endereço cadastrado com sucesso");
			res.sendRedirect("index.jsp");
=======
			dao.gravar(cli);
>>>>>>> b6d41cbb95e6c11889c51e0d9e196909d5dc5d36

		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
}
