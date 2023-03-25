package bucles;

import java.util.*;

public class ejercicio1 {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduzca un numero");
		
			numero = src.nextInt();
		
		while(numero > 0) {
			
			System.out.println("Introduzca un numero");
			
				numero = src.nextInt();
			
			for(int i = 1; i <= numero; i++) {
				
				for(int j = 1; j <= numero; j++) {
					
					System.out.println("*");
					
				}
				
				System.out.println("");
				
			}
			
		}
		
	}
	
}
