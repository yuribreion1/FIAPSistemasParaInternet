package br.com.beautypath.teste;

import javax.swing.JOptionPane;

import br.com.beautypath.bo.CatalogoBO;
import br.com.beautypath.excecao.Excecao;
import br.com.beautypath.modelo.Catalogo;

public class TesteCatalogoBO {
	
	public static void main(String[] args) throws Exception {
		try {
			CatalogoBO bo = new CatalogoBO();
			Catalogo cat = new Catalogo();
			
			cat.setIdCatalogo(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do catalogo:")));
			cat.setDescricao(JOptionPane.showInputDialog("Entre com uma descrição:"));
			
			bo.cadastraCatalogo(cat);
		} catch (Exception e) {
			throw Excecao.getErro(e);
		}
	}

}
