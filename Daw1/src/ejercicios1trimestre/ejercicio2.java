package ejercicios1trimestre;

import java.util.*;

public class ejercicio2 {

	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2, opcion, suma = 0, resta = 0;
		
		System.out.println("Escriba dos numeros");
		
		num1 = teclado.nextInt();
		
		num2 = teclado.nextInt();
		
		System.out.println("Escriba una opción \n 1. Suma \n 2. Resta");
		
		opcion = teclado.nextInt();
		
		if(opcion == 1) {
			
			suma = num1 + num2;
			
			System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
			
		}
		
		else if(opcion == 2) {
			
			resta = num1 - num2;
		
		System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
		
		}
	}
	
}
