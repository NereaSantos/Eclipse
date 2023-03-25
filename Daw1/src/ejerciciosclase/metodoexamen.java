package ejerciciosclase;

import java.util.*;

public class metodoexamen {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner src = new Scanner(System.in);
		
		System.out.println("Escriba un numero");
		
		numero = src.nextInt();
		
		numeroPositivo(1);
		
		while(numero != 0) {
			
			System.out.println("escriba otro numero");
			
			numero = src.nextInt();
			
			numeroPositivo(1);
			
		}
		
	}
	


static boolean numeroPositivo(int numero) {
	
	boolean resultado = false;
	
	if(numero > 0) {
		
		resultado = true;
		
		System.out.println("positivo es " + resultado);
		
	}
	
	return resultado;
	
}

}