package condicionales; 

import java.util.*;

public class ejercicio5 {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		int num1, num2, respuesta, suma, resta, promedio;
		
		System.out.println("Escoja una opcion, \n 1. Suma \n 2. Resta \n 3. Promedio");
		
			respuesta = src.nextInt();
		
		System.out.println("Escriba dos numero");
		
			num1 = src.nextInt();
		
			num2 = src.nextInt();
		
		if(respuesta == 1) {
			
			suma = num1 + num2;
			
			System.out.println("La suma entre " + num1 + " y " + num2 + " es " + suma);
			
		}
		
		if(respuesta == 2) {
			
			resta = num1 - num2;
			
			System.out.println("La resta entre " + num1 + " y " + num2 + " es " + resta);
			
		}
		
		if(respuesta == 3) {
			
			promedio = (num1 + num2) /2;
			
			System.out.println("El promedio entre " + num1 + " y " + num2 + " es " + promedio);
			
		}
	
		else
			
			System.out.println("Respuesta no váloda");
		
	}
	
}
