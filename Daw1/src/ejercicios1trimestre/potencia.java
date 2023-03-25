package ejercicios1trimestre;

import java.util.*;

public class potencia {

	public static void main(String[] args) {
		
		int numero = 4, potencia = 2;
		
		System.out.println(potencia(numero, potencia));
		
	}
	
	static int potencia (int base, int exponente) {
		
		int total = base;
		
		for(int i= 1; i < exponente; i++)
		
			total = total*base;
			
		return (total);
	}
	
}
