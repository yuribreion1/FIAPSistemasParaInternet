package br.com.beautypath.teste;

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
			
			end.setIdEndereco(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do endereço")));
			end.setLogradouro(JOptionPane.showInputDialog("Digite o endereço:"));
			end.setCidade(JOptionPane.showInputDialog("Digite a cidade:"));
			end.setCep(JOptionPane.showInputDialog("Digite o CEP:"));
			end.setEstado(JOptionPane.showInputDialog("Digite o estado:"));
			
			bo.cadastraEndereco(end);
			
		} catch (Exception e) {
			throw Excecao.getErro(e);
		}
	}
}
