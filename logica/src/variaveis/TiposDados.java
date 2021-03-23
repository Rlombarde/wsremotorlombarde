package variaveis;

 //classe publica
	
	/*
	 *  Tipos de Dados
	 *  Alfanum�ricos: � o dado que N�O ser� utilizado em calculo matematico
	 *  (Contexto DP do Itau)CEP => 00010-009 => 00010-009
	 *  String (Javan�s)
	 *  
	 *  
	 *  N�meros: � um dado que PODE ser utilizado em c�lculo matem�tico e/ou considerado um dado critico para o sistema
	 *  (Contexto site dos Correios)CEP => 00010-009 => 1
	 *  - com casas decimais: double
	 *  - sem casas decimais: int
	 *  
	 *  Sintaxe:
	 *  <tipo do dado> <nome da variavel> = <valor/dado>
	 *  Exemplo: String marca = "SAMSUNG";
	 */

public class TiposDados {
		//main() � o Start Point da App
	public static void main (String args[]) {
			
		/* Nivel da Linguagem:
		 * Alto Nivel: mais simples para o apendizado, pois esta mais pr�ximo da linguagm humana.
		 * Baixo Nivel: mais complexa e mais pr�xima da linguagem de m�quina
		 */
		
		String nome = "1berto Sousa";
		int idade = 45;
		double altura = 1.74;
		double peso = 98.0;
		double imc = peso / (altura * altura);
		
		System.out.println("Nome..: " + nome);
		System.out.println("Idade..: " + idade);
		System.out.println("Altura..: " + altura);
		System.out.printf("\nIMC..: %.2f\n" , imc);
		System.out.printf("Ol� %s seu IMC � %.2f", nome, imc);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
