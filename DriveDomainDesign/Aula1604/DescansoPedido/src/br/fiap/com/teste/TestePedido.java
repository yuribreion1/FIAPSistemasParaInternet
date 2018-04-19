package br.fiap.com.teste;

import br.fiap.com.model.Cliente;
import br.fiap.com.model.ItemPedido;
import br.fiap.com.model.Pedido;
import br.fiap.com.model.Produto;

public class TestePedido {

	public static void main(String[] args) {
		
		Cliente c = new Cliente();
		Produto p = new Produto();
		ItemPedido i = new ItemPedido();
		Pedido pedido = new Pedido();
		
		System.out.println(pedido.getAll());
	}

}
