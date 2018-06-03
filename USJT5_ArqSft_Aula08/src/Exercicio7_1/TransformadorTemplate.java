package Exercicio7_1;

import javax.swing.JOptionPane;

public abstract class TransformadorTemplate {
	
	public TransformadorTemplate() {};
	public void run() {
		String input = JOptionPane.showInputDialog("Insira uma mensagem: ");
		String s = transform(input);
		print(s);
	}
	public abstract String transform(String s);
	
	public void print(String s) {
		JOptionPane.showMessageDialog(null, s);
	};
	
}
