package variaveis;

import javax.swing.JOptionPane;

public class TiporPrimitivos {
	
	public static void main(String[] args) {
	
	
	//String time1 = "ABC";
	String time1 = JOptionPane.showInputDialog("Digite o time 1");
	String time2 = JOptionPane.showInputDialog("Digite o time 2");
	float entrada = Float.parseFloat
			(JOptionPane.showInputDialog("Entrada"));
	
	int publico = Integer.parseInt
			(JOptionPane.showInputDialog("Digite o p�blico"));
	double total = entrada * publico;
	
	System.out.printf("No jogo entre %s x %s a arrecada��o foi de: R$ %.2f", time1, time2, total);
	}
}
