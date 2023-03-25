package condicionales;

import java.util.*;

public class ejercicio3 {
	
	public static void main(String[] args) {

	Scanner src = new Scanner(System.in);
	
		int numero;
	
	System.out.println("Escriba un numero");
	
		numero = src.nextInt();
		
	if(numero % 2 == 0) {
		
		System.out.println("El numero es par");
		
	}else
		
		System.out.println("El numero es impar");
	
	}
	
}
