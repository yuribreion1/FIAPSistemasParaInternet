package br.com.beautypath.teste;

import java.util.List;

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

	public static void main(String[] args) throws Exception {
		try {
			ClienteBO bo = new ClienteBO();
			Cliente cli = new Cliente();

			do {

				cli.setNome(JOptionPane.showInputDialog("Digite o nome: "));
				cli.setTelefone(JOptionPane.showInputDialog("Digite o telefone:"));
				cli.setEmail(JOptionPane.showInputDialog("Digite o e-mail"));
				cli.setSocialUrl(JOptionPane.showInputDialog("Digite a rede social:"));

				bo.cadastraCliente(cli);

			} while (JOptionPane.showConfirmDialog(null, "Deseja continuar", "Teste Cliente", JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE) == 0);
			{
				List<Cliente> clientes = bo.listaClientes();
				for (Cliente cliente : clientes) {
					System.out.println("ID: " + cliente.getIdCliente() + "\nNome: " + cliente.getNome() + "\nTelefone: "
							+ cliente.getTelefone() + "\nE-mail: " + cliente.getEmail() + "\nRede social: "
							+ cliente.getSocialUrl() + "\n==============\n");
				}

			}
		} catch (Exception e) {
			throw Excecao.getErro(e);
		}
	}
}
