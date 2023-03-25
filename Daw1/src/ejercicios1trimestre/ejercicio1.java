package ejercicios1trimestre;

import java.util.*;

public class ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado =  new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Escriba dos numeros");
		
		num1 = teclado.nextInt();
		
		num2 = teclado.nextInt();
		
		if(num1%2 == 0 && num2%2 == 0) {
			
			System.out.println("Los dos numeros son pares");
			
		}
		
		else if(num1%2 != 0 && num2%2 != 0) {
			
			System.out.println("Los numeros son impares");
			
		}
		
		else if(num1%2 == 0 && num2%2 != 0 || num1%2 != 0 && num2%2 == 0) {
			
			System.out.println("Los dos numeros son distintos");
			
		}
		
	}
	
}
