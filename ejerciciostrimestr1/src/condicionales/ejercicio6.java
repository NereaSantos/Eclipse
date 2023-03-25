package condicionales;

import java.util.*;

public class ejercicio6 {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		int edad;
		
		System.out.println("Introduzca su edad");
		
			edad = src.nextInt();
			
		if(edad < 18) {
			
			System.out.println("Eres muy joven");
			
		}
		else if(edad > 18 && edad < 40){
			
			System.out.println("eres joven");
			
		}
		else if(edad > 40 && edad < 65) {
			
			System.out.println("eres viejoven");
			
		}
		
		else
			
			System.out.println("ciudate");
		
	}
	
}
