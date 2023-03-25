package ejercicios1trimestre;

import java.util.*;

public class ejercicio6switch {

	public static void main(String[] aegs) {
		
		Scanner teclado = new Scanner(System.in);
		
		int nota = 0;
		
		System.out.println("Escriba una nota del 1 al 10");
		
		nota = teclado.nextInt();
		
		switch(nota) {
		
		case 1:
			
			System.out.println("insuficiente");
			
			break;
		
		case 2:
			
			System.out.println("insuficiente");
			
			break;
			
		case 3:
			
			System.out.println("insuficiente");
			
			break;
			
		case 4:
			
			System.out.println("insuficiente");
			
			break;
			
		case 5:
			
			System.out.println("Suficiente");
			
			break;
			
		case 6:
			
			System.out.println("Bien");
			
			break;
			
		case 7:
			
			System.out.println("Notable");
			
			break;
			
		case 8:
			
			System.out.println("Notable");
			
			break;
			
		case 9:
			
			System.out.println("Sobresaliente");
			
			break;
			
		case 10:
			
			System.out.println("Sobresaliente");
			
			break;
			
		}
		
	}
	
}
