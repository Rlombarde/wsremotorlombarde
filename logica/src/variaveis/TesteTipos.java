package variaveis;

import javax.swing.JOptionPane;

public class TesteTipos {
	
	public static void main(String[] args) {
	
		String Produto = JOptionPane.showInputDialog("Digite o nome do produto");
		int quantidade = Integer.parseInt
				(JOptionPane.showInputDialog("Digite a quantidade"));
		float imposto = Float.parseFloat
				(JOptionPane.showInputDialog("Digite a % de imposto"));
		float valor = Float.parseFloat
				(JOptionPane.showInputDialog("Digite o Valor unit?rio"));
		
		double imposto2 = (valor * imposto);
		double valor2 = (valor + imposto);
		
		
		
		System.out.printf("Valor unit?rio com imposto ? de: R$ %.2f\n", valor + imposto);
		System.out.printf("\nValor do imposto ? de: R$ %.2f\n", imposto);
		System.out.printf("\nValor total com imposto ? de: R$ %.2f\n", valor2 * quantidade);
		System.out.printf("\nValor total sem imposto ? de: R$ %.2f\n", valor * quantidade);
		}
	}

