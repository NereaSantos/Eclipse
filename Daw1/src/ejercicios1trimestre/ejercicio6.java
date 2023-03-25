package ejercicios1trimestre;

import java.util.*;

public class ejercicio6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Escriba una nota de 0 al 10");
		
		nota = teclado.nextInt();
		
		if(nota < 5) {
			
			System.out.println("Insuficiente");
			
		}
		
		else if(nota == 5) {
			
			System.out.println("Suficiente");
			
		}
		
		else if(nota == 6) {
			
			System.out.println("Bien");
			
		}
		
		else if(nota >= 7 && nota <= 8) {
			
			System.out.println("Notable");
			
		}
		
		else if(nota >= 9 && nota <= 10) {
			
			System.out.println("Sobresaliente");
		}
		
		else
			
			System.out.println("Nota no válida");
		
	}
	
}
