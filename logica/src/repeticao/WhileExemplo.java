package repeticao;

import javax.swing.JOptionPane;

public class WhileExemplo {
	
	public static void main(String[] args) {
	
		String nome = ("");
		
	do {
	nome = JOptionPane.showInputDialog("Escreva seu nome");
		}
	
	while (nome.length()<3 || nome.length()>15);
		nome = JOptionPane.showInputDialog("Escreva seu nome com tamanho entre 3 e 15 caracteres");
			
	System.out.println("Seu nome é:" +nome);
		
		
}}
