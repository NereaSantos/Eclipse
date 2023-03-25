package condicionales;

import java.util.*;

public class ejercicio2 {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		int numero1, numero2, resultado;
		String respuesta;
		
		System.out.println("Introduzca dos numeros");
		
			numero1 = src.nextInt();
			
			numero2 = src.nextInt();
		
		System.out.println("Elige una opción: \n 1. '+' para sumar \n 2. '-' para restar");
		
			respuesta = src.next();
		
		if(respuesta.equals("+")) {
			
			resultado = numero1 + numero2;
			
		}
		
		else if(respuesta.equals("-")) {
			
			resultado = numero1 - numero2;
			
		}
		
	}
	
}
