package br.com.beautypath.web;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.beautypath.bo.EnderecoBO;
import br.com.beautypath.dao.ConnectionFactory;
import br.com.beautypath.modelo.Endereco;

@WebServlet(urlPatterns = "/cadastra-endereco")
public class CadastraEndereco extends HttpServlet {

	/**
	 * @author yuribreion
	 * @version 1.0
	 * @param req http request feito pelo servlet
	 * @param res http response feito pelo servlet
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		Endereco end = new Endereco();
		Connection conexao;
		try {
			conexao = ConnectionFactory.controlarInstancia().getConnection("rm79935", "300187");
			EnderecoBO bo = new EnderecoBO();
			
			end.setLogradouro(req.getParameter("logradouro"));
			end.setCidade(req.getParameter("cidade"));
			end.setEstado(req.getParameter("estado"));
			end.setCep(req.getParameter("cep"));

			bo.cadastraEndereco(end);
			conexao.close();
			res.sendRedirect("index.jsp");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
