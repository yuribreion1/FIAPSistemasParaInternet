package br.com.fiap.teste;

import java.util.List;

import br.com.fiap.dao.ProdutoDAO;
import br.com.fiap.modelo.Produto;

public class TestaListagemProdutos {

	public static void main(String[] args) {
		try {
			ProdutoDAO dao = new ProdutoDAO();
			List<Produto> listaProdutos = dao.getProdutos();

			for (Produto produto : listaProdutos) {
				System.out.println("Código do produto: " + produto.getCodigoProduto() + "\nNome do produto: "
						+ produto.getNomeProduto() + "\nValor do produto: " + produto.getValorProduto() + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
