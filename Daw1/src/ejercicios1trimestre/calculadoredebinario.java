package ejercicios1trimestre;

import java.util.*;

public class calculadoredebinario {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		int respuesta;

		System.out.println("Escriba una opción: \n 0. Salir \n 1.Escribir numeros enteros \n 2. Escribir true/false \n 3. Escribir a/b");
		System.out.println("Se deben escribir unicamente numeros de tres cifras");
		
		respuesta = src.nextInt();
		
		if(respuesta == 1) {
			
			enteros();
			
		}
		
		if (respuesta == 2) {
			
			booleano();
			
		}
		
		if (respuesta == 3) {
			
			string();
			
		}
		
	}
	
	static void enteros () {
		
		Scanner src = new Scanner(System.in);
		
		int cero = 0, uno = 1, numero;
		
		System.out.println("Escriba el numero de tres cifras que quiere pasar a decimal");
		
			numero = src.nextInt();
		
			
			
	}
	
	static void booleano () {
		
		
		
	}
	
	static void string () {
		
		
		
	}
	
}
