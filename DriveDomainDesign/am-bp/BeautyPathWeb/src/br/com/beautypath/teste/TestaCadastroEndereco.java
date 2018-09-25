package br.com.beautypath.teste;

import javax.swing.JOptionPane;

import br.com.beautypath.dao.EnderecoDAO;
import br.com.beautypath.modelo.Endereco;

public class TestaCadastroEndereco {
	public static void main(String[] args) {
		
		try {
			
			Endereco end = new Endereco();
			EnderecoDAO dao = new EnderecoDAO();
			end.setLogradouro(JOptionPane.showInputDialog("Digite o logradouro:"));
			end.setEstado(JOptionPane.showInputDialog("Digite seu estado/UF:"));
			end.setCidade(JOptionPane.showInputDialog("Digite sua cidade:"));
			end.setCep(JOptionPane.showInputDialog("Digite seu CEP:"));
			dao.gravar(end);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
