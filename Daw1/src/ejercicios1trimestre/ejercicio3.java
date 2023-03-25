package ejercicios1trimestre;

import java.util.*;

public class ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num;
		
		System.out.println("Escriba un número");
		
		num = teclado.nextInt();
		
		if(num/2 == 0) {
			
			System.out.println("El numero es par");
			
		}
		
		else
			
			System.out.println("El numero es impar");
		
	}
	
}
