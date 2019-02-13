package br.fiap.com.main;

import br.fiap.com.model.Fabricante;
import br.fiap.com.model.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		Produto produto = new Produto();
		Fabricante fabricante = new Fabricante();

		produto.setFabricante(fabricante);
		produto.setCodigo(1234);
		produto.setDescricao("IphoneX");
		produto.setValor(200.00);

		fabricante.setCnpj("02408527000185");
		fabricante.setRazaoSocial("Loja Virtual");

		System.out.print("Produto: \n" + "Codigo: " + produto.getCodigo() + "\nDescricao: " + produto.getDescricao()
				+ "\nValor: " + produto.getValor() + "\nFabricante: CNPJ: " + fabricante.getCnpj() + "\nRazao Social: "
				+ fabricante.getRazaoSocial());

	}

}
