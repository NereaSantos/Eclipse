package ejerciciosclase;
import java.util.Scanner;
public class emailvalidosubstring {

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
	}}
	
	 if(com.substring(email.length()-4) != null || org.substring(email.length()-4) != null) {
		
		System.out.println("El email es válido ");
	}
	else {
		System.out.println("El email no es válido");
	}
	
	teclado.close();
		
	}}