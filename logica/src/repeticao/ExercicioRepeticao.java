package repeticao;

import javax.swing.JOptionPane;

public class ExercicioRepeticao {
	
	
	public static void main (String[]args) {
		
		int numero2=0;
		int contador=0;
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o n?mero base")); 
		
		do {
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o chute"));
			contador+=1;
			if (numero2>numero1) {
				System.out.println("Est? chutando alto");
			}else if (numero2<numero1) {
				System.out.println("Est? chutando baixo");
			}
			}while(numero2!=numero1); 			
			System.out.println("Parab?ns, voc? acertou com " + contador + " tentativas");
						
		
	}

}
