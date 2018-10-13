package br.com.beautypath.teste;

import java.util.List;

import javax.swing.JOptionPane;

import br.com.beautypath.bo.ProfissionalBO;
import br.com.beautypath.excecao.Excecao;
import br.com.beautypath.modelo.Profissional;

public class TesteProfissionalBO {
	
	/**
	 * @author yuribreion
	 * @version 1.0
	 * @param args
	 * @throws Exception
	 */
	
	public static void main(String[] args) throws Exception {
		try {
			ProfissionalBO bo = new ProfissionalBO();
			Profissional prof = new Profissional();

			do {
				prof.setNome(JOptionPane.showInputDialog("Digite o nome: "));
				prof.setTelefone(JOptionPane.showInputDialog("Digite o telefone: "));
				prof.setRegistro(JOptionPane.showInputDialog("Digite o registro: "));
				prof.setSocialUrl(JOptionPane.showInputDialog("Rede social: "));
				prof.setSocialUrl1(JOptionPane.showInputDialog("Rede social 1: "));

				bo.cadastraProfissional(prof);
			} while (JOptionPane.showConfirmDialog(null, "Deseja continuar", "Teste Profissional",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
			{
				List<Profissional> profissionais = bo.listaProfissionais();
				for (Profissional profissional : profissionais) {
					System.out.println("\nID: " + profissional.getIdProfissional() + "\nNome: " + profissional.getNome()
							+ "\nTelefone: " + profissional.getTelefone() + "\nRegistro: " + profissional.getRegistro()
							+ "\nRede social: " + profissional.getSocialUrl() + "\nRede social 1: "
							+ profissional.getSocialUrl1() + "\n===============\n");
				}
			}

		} catch (Exception e) {
			throw Excecao.getErro(e);
		}
	}
}
