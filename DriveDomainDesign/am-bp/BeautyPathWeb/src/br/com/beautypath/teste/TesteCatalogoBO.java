package br.com.beautypath.teste;

import java.util.List;

import javax.swing.JOptionPane;

import br.com.beautypath.bo.CatalogoBO;
import br.com.beautypath.excecao.Excecao;
import br.com.beautypath.modelo.Catalogo;

public class TesteCatalogoBO {
	
	/**
	 * @author yuribreion
	 * @version 1.0
	 * @param args
	 * @throws Exception
	 * @see Catalogo
	 * @see CatalogoDAO
	 */

	public static void main(String[] args) throws Exception {
		try {
			CatalogoBO bo = new CatalogoBO();
			Catalogo cat = new Catalogo();
			do {

				cat.setDescricao(JOptionPane.showInputDialog("Entre com uma descrição:"));

				bo.cadastraCatalogo(cat);
			} while (JOptionPane.showConfirmDialog(null, "Deseja continuar", "Teste Catalogo",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
			{
				List<Catalogo> catalogos = bo.listaCatalogos();
				for (Catalogo catalogo : catalogos) {
					System.out.println(
							"ID: " + catalogo.getIdCatalogo() + "\nDescrição: " + catalogo.getDescricao() + "\n");
				}
			}

		} catch (Exception e) {
			throw Excecao.getErro(e);
		}
	}

}
