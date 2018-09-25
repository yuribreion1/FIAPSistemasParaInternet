package br.com.beautypath.teste;

import java.util.List;

import javax.swing.JOptionPane;

import br.com.beautypath.dao.CatalogoDAO;
import br.com.beautypath.excecao.Excecao;
import br.com.beautypath.modelo.Catalogo;

public class TestaCatalogo {
	public static void main(String[] args) {
		try {			
			Catalogo cat = new Catalogo();
			CatalogoDAO dao = new CatalogoDAO();
			cat.setDescricao(JOptionPane.showInputDialog("Digite a descrição do catalogo:"));
			
			dao.gravar(cat);
			
			List<Catalogo> lista = dao.getCatalogos();
			for (Catalogo catalogo : lista) {
				System.out.println("Código do catalogo: " + catalogo.getIdCatalogo() + "\nDescrição: " + catalogo.getDescricao() + "\n" );
			}
			
			
		} catch (Exception e) {
			Excecao.getErro(e);
			e.printStackTrace();
		}
	}
}
