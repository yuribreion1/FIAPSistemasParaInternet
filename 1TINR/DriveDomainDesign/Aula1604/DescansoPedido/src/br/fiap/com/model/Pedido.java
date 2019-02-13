package br.fiap.com.model;

public class Pedido {
	private int numero;
	private double total;
	private Cliente cliente;
	private ItemPedido itemPedido;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ItemPedido getItemPedido() {
		return itemPedido;
	}

	public void setItemPedido(ItemPedido itemPedido) {
		this.itemPedido = itemPedido;
	}

	public Pedido() {
		super();
	}

	public Pedido(int numero, double total, Cliente cliente, ItemPedido itemPedido) {
		super();
		setNumero(numero);
		setTotal(total);
		setCliente(cliente);
		setItemPedido(itemPedido);
	}
	
	public void setAll(int numero, double total, Cliente cliente, ItemPedido itemPedido) {
		setNumero(numero);
		setTotal(total);
		setCliente(cliente);
		setItemPedido(itemPedido);
	}
	
	public String getAll() {
		return numero + "\n" + total + "\n" + cliente + "\n" + itemPedido; 
	}
}
