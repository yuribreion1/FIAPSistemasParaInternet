package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.dao.ProdutoDAO;
import br.com.fiap.modelo.Produto;

public class TestePesquisaProdutoPorNome {

	public static void main(String[] args) {
		try {
			ProdutoDAO dao = new ProdutoDAO();
			List<Produto> listaProdutos = new ArrayList<Produto>();
			String strProduto = JOptionPane.showInputDialog("Digite o nome de deseja encontrar:");
			listaProdutos = dao.getPesquisaPorNome(strProduto);
			
			for (Produto produto : listaProdutos) {
				System.out.println("Código do produto: " + produto.getCodigoProduto()
				+ "\nNome do produto:" + produto.getNomeProduto()
				+ "\nValor do produto: " + produto.getValorProduto());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
