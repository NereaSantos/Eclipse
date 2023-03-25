package condicionales;

import java.util.*;

public class ejercicio1 {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.println("Escribe dos numeros");
		
			numero1 = src.nextInt();
			
			numero2 = src.nextInt();
			
		if(numero1 % 2 == 0 && numero2 % 2 == 0) {
			
			System.out.println("Los dos numero son pares");
			
		}
		
		else if(numero1 % 2 != 0 && numero2 % 2 != 0) {
				
			System.out.println("Los dos numeros son impares");
				
			}
		
		else if(numero1 % 2 == 0 && numero2 % 2 != 0 || numero1 %2 != 0 && numero2 % 2 == 0) {
			
			System.out.println("Los numero son distintos");
			
		}
		
		}
	
	
	}
	