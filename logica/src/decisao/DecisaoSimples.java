package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {
	
	public static void main (String[]args) {
	
		String Disciplina = JOptionPane.showInputDialog("Digite o nome da disciplina").toUpperCase();
		
		Float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota"));
		
		Float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota"));
		
		Float media = ((nota1 + nota2) / 2);
				
		System.out.println("M�dia: " + media);
		
				if (media > 6 ) {
		System.out.println("Parab�ns");
				}		
	
				if (media<4) {
					System.out.println("Infelizmente voc� foi reprovado!");
				}
				
				if (media<6 && media>=4) {
					System.out.println("Voc� est� e exame");
				}
		
		
		
	
	
	}
}
