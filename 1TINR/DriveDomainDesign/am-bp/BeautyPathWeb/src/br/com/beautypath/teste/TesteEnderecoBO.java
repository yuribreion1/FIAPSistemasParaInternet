package br.com.beautypath.teste;

import java.util.List;

import javax.swing.JOptionPane;

import br.com.beautypath.bo.EnderecoBO;
import br.com.beautypath.excecao.Excecao;
import br.com.beautypath.modelo.Endereco;

public class TesteEnderecoBO {
	
	/**
	 * @author yuribreion
	 * @param args
	 * @throws Exception
	 * @see EnderecoBO
	 * @see Endereco
	 */
	public static void main(String[] args) throws Exception {
		try {
			EnderecoBO bo = new EnderecoBO();
			Endereco end = new Endereco();
			do {
				end.setLogradouro(JOptionPane.showInputDialog("Digite o endereco:"));
				end.setCidade(JOptionPane.showInputDialog("Digite a cidade:"));
				end.setCep(JOptionPane.showInputDialog("Digite o CEP:"));
				end.setEstado(JOptionPane.showInputDialog("Digite o estado:"));
				
				bo.cadastraEndereco(end);
				
			} while (JOptionPane.showConfirmDialog(null, "Deseja continuar", "Teste Endereco",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0); 
			{
				List<Endereco> enderecos = bo.listaEnderecos();
				for (Endereco endereco : enderecos) {
					System.out.println(
							"ID: " + endereco.getIdEndereco() + "\nEndereco: " + endereco.getLogradouro() + "\nCidade: " + endereco.getCidade()
							+ "\nCEP: " + endereco.getCep() + "\nEstado: " + endereco.getEstado() + "\n===============\n");
				}
			}
			
		} catch (Exception e) {
			throw Excecao.getErro(e);
		}
	}
}
