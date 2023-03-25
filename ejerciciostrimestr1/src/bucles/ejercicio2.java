package bucles;

import java.util.*;

public class ejercicio2 {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		int numero, contador = 0, suma = 0;
		
		System.out.println("Escribe un numero");
		
			numero = src.nextInt();
			
		while(contador < 5) {
			
			System.out.println("Escribe un numero");
			
				numero = src.nextInt();
			
				contador++;
				
				if(contador < 5) {
					
					suma = suma + numero;
					
				}
				
		}
		
		System.out.println("la suma de los numeros es " + suma);
		
	}
	
}
