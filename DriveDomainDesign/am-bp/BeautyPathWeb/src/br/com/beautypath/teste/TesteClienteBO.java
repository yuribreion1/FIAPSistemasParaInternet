package br.com.beautypath.teste;

import javax.swing.JOptionPane;

import br.com.beautypath.bo.ClienteBO;
import br.com.beautypath.excecao.Excecao;
import br.com.beautypath.modelo.Cliente;

public class TesteClienteBO {
	
	/**
	 * @author yuribreion
	 * @param cli 
	 * @see ClienteBO
	 * @exception getErro()
	 * @throws Exception
	 */

	public static void main(String[] args) throws Exception{
		try {
			ClienteBO bo = new ClienteBO();
			Cliente cli = new Cliente();
			
			cli.setIdCliente(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID")));
			cli.setNome(JOptionPane.showInputDialog("Digite o nome: "));
			cli.setTelefone(JOptionPane.showInputDialog("Digite o telefone:"));
			cli.setEmail(JOptionPane.showInputDialog("Digite o e-mail"));
			cli.setSocialUrl(JOptionPane.showInputDialog("Digite a rede social:"));
			
			bo.cadastraCliente(cli);
			
		} catch (Exception e) {
			throw Excecao.getErro(e);
		}
	}
}
