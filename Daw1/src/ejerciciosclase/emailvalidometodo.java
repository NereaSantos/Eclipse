package ejerciciosclase;

import java.util.*;

public class emailvalidometodo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
	String email, com = "com", org = "org";
	
	int i, arroba = 0, punto = 0;
	
	System.out.println("escriba un email válido");
	
		email = teclado.next();
	
	for(i = 0; i < email.length(); i++) {
		
		if(email.charAt(i) == '@' && email.charAt(i) == '.') {
	
			arroba++;	
			
			punto++;
			
	}
	
	else if(email.endsWith(org) || email.endsWith(com)) {
		
		System.out.println("El email es válido ");
	}
	else {
		System.out.println("El email no es válido");
	}
	
	teclado.close();
		
	}}}

