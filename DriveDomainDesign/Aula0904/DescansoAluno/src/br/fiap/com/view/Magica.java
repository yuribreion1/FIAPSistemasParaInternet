package br.fiap.com.view;

import javax.swing.JOptionPane;

public class Magica {

	public static String texto(String mensagem) {
		return JOptionPane.showInputDialog(mensagem);
	}

	public static int inteiro(String mensagem) {
		return Integer.parseInt(texto(mensagem));
	}

	public static double decimal(String mensagem) {
		return Double.parseDouble(texto(mensagem));
	}
}
