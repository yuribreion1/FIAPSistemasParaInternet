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

				cli.setNome(JOptionPane.showInputDialog("Digite o nome: ").toUpperCase());
				cli.setTelefone(JOptionPane.showInputDialog("Digite o telefone:").toUpperCase());
				cli.setEmail(JOptionPane.showInputDialog("Digite o e-mail").toUpperCase());
				cli.setSocialUrl(JOptionPane.showInputDialog("Digite a rede social:").toUpperCase());

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
				String strSearch = JOptionPane.showInputDialog("Digite o nome que deseja buscar: ").toUpperCase();

				List<Cliente> clienteRetornado = bo.getPesquisaClientePorNome(strSearch);

				for (Cliente cliente : clienteRetornado) {
					System.out.println("Cliente retornado da busca:\n " + cliente + "\n");
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
			throw Excecao.getErro(e);
		}
	}
}
