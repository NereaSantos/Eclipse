package ejercicios1trimestre;

import java.util.*;

public class ejercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int edad;
		
		System.out.println("Escriba su edad");
		
		edad = teclado.nextInt();
		
		if(edad < 18) {
			
			System.out.println("Eres muy joven");
			
		}
		
		else if(edad < 40) {
			
			System.out.println("Eres joven");
			
		}
		
		else if(edad < 65) {
			
			System.out.println("Eres viejoven");
			
		}
		
		else 
			
			System.out.println("ciudate");
		
	}
	
}
