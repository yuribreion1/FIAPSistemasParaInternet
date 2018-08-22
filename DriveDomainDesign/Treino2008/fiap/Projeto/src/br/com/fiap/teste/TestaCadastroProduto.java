package br.com.fiap.teste;

import br.com.fiap.dao.ProdutoDAO;
import br.com.fiap.modelo.Produto;

public class TestaCadastroProduto {

	public static void main(String[] args) {
		try {
			Produto prod = new Produto();
			ProdutoDAO dao = new ProdutoDAO();
			prod.setCodigoProduto(1);
			prod.setNomeProduto("Livro de Java");
			prod.setValorProduto(99);
			dao.gravar(prod);
			System.out.println("Produto gravado com sucesso");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
