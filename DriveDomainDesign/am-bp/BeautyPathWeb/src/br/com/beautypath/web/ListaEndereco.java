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
import br.com.beautypath.dao.EnderecoDAO;
import br.com.beautypath.modelo.Endereco;

@WebServlet(urlPatterns = "/lista-endereco")
public class ListaEndereco extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Connection conexao;
		try {
			conexao = ConnectionFactory.controlarInstancia().getConnection("rm79935", "300187");
			List<Endereco> enderecos = new EnderecoDAO().getEnderecos(conexao);
			req.setAttribute("enderecos", enderecos);
			
			System.out.println(enderecos);
			
			RequestDispatcher dispatcher = req.getRequestDispatcher("listaEndereco.jsp");
			dispatcher.forward(req, res);
			
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
