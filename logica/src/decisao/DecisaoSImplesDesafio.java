package decisao;

import javax.swing.JOptionPane;

public class DecisaoSImplesDesafio {
	
	public static void main (String[]args) {
		
		String nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
		
		short idade = Short.parseShort(JOptionPane.showInputDialog("Digite a idade"));
		
					
				if (idade > 18 && idade < 70 ) {
		System.out.println("Voto obrigatório");
				}		
	
				if (idade < 16) {
					System.out.println("Não pode votar");
				}
				
				if (idade ==16 || idade==17 || idade>=70) {
					System.out.println("Você facultativo");
				}
				
				
	}
}

		
	

