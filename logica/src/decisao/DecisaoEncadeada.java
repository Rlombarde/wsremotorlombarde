package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {
	
	public static void main (String[]args) {
	
	short faltas = Short.parseShort(JOptionPane.showInputDialog("Faltas"));
	String disciplina = 
			JOptionPane.showInputDialog("Disciplina: ").toUpperCase();	
	if (faltas>20) {
		System.out.println("Reprovado por faltas");
	}else {
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));
		float media = (nota1+nota2)/2;
		System.out.println("M�dia: " + media);
		if (media>=6) {
			System.out.println("Parab�ns!\nAprovado na disciplina: " + disciplina);
		} else if (media<4) {
			System.out.println("Infelizmente voc� foi reprovado!!!");
		} else  {
			System.out.println("Voc� ter� mais uma chance");
		}
	}
}
	
}