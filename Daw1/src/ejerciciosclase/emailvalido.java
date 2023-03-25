package ejerciciosclase;
import java.util.*;
public class emailvalido {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
	String email, com = "com", org = "org";
	
	int i, arroba = 0, punto = 0;
	
	boolean a;
	
	System.out.println("escriba un email válido");
	
		email = teclado.next();
	
	System.out.println(checkemail(email));
	
	a = checkemail("PEPE@@");
	
	System.out.println(a);
	
	teclado.close();
		
	}

	static boolean checkemail (String email) {
		
		int i, arroba = 0, punto = 0;
		
		boolean resultado = false;
		
		for( i = 0; i < email.length(); i++) {
			
			if(email.charAt(i) == '@') 
				arroba++;	
				
			else if(email.charAt(i) == '.')	
				punto++;
				
		}
		
		if(arroba == 1 && punto ==1) {
			
			resultado = true;
			
		}
		
		
		return resultado;
	
}
}