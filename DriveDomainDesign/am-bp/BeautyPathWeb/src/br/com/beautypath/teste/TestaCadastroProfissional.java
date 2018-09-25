package br.com.beautypath.teste;

import javax.swing.JOptionPane;

import br.com.beautypath.dao.ProfissionalDAO;
import br.com.beautypath.excecao.Excecao;
import br.com.beautypath.modelo.Profissional;

public class TestaCadastroProfissional {

	public static void main(String[] args) {
		try {
			
			Profissional prof = new Profissional();
			ProfissionalDAO dao = new ProfissionalDAO();
			
			prof.setNome(JOptionPane.showInputDialog("Digite o nome do profissional"));
			prof.setTelefone(JOptionPane.showInputDialog("Entre com o telefone:"));
			prof.setRegistro(JOptionPane.showInputDialog("Digite o registro o registro:"));
			prof.setSocialUrl(JOptionPane.showInputDialog("Digite sua primeira rede social:"));
			prof.setSocialUrl1(JOptionPane.showInputDialog("Digite sua segunda rede social"));
			
			dao.gravar(prof);
		} catch (Exception e) {
			Excecao.getErro(e);
			e.printStackTrace();
		}
	}

}
