package variaveis;

public class TipoString {

	public static void main (String[]args) {
		
		String email = "rafAel@GMAil.cOm";
		System.out.println("Original: " + email);
		System.out.println("Minuscula: " + email.toLowerCase());
		System.out.println("Maiúscula: " + email.toUpperCase());
		System.out.println("Qtde Caracteres: " + email.length());
		System.out.println("É igual: " + email.equals("rafael"));
		
		// if (email.indexOf("@")>-1)
		if (email.contains("@")==true){
				System.out.println("Usuário é..: " + email.substring(0,email.indexOf("2")));
	}
	
		
	
}
