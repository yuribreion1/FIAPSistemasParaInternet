package br.com.beautypath.teste;

import java.sql.Connection;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.beautypath.dao.CatalogoDAO;
import br.com.beautypath.dao.ConnectionFactory;
import br.com.beautypath.excecao.Excecao;
import br.com.beautypath.modelo.Catalogo;

public class TestaCatalogo {
	public static void main(String[] args) {
		try {
			String user = JOptionPane.showInputDialog("Digite seu usuário:");
			String pw = JOptionPane.showInputDialog("Digite a sua senha:");
			Connection c = ConnectionFactory.controlarInstancia().getConnection(user, pw);
			
			Catalogo cat = new Catalogo();
			CatalogoDAO dao = new CatalogoDAO();
			cat.setDescricao(JOptionPane.showInputDialog("Digite a descrição do catalogo:"));
			
			dao.gravar(cat, c);
			
			List<Catalogo> lista = dao.getCatalogos(c);
			for (Catalogo catalogo : lista) {
				System.out.println("Código do catalogo: " + catalogo.getIdCatelogo() + "\nDescrição: " + catalogo.getDescricao() + "\n" );
			}
			
			
		} catch (Exception e) {
			Excecao.getErro(e);
			e.printStackTrace();
		}
	}
}
