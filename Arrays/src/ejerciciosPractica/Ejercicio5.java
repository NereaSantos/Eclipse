package ejerciciosPractica;

import java.util.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		int a[] = new int [10];
		int contadorP = 0, contadorN = 0, contadorC = 0;
		
		System.out.println("Escriba 10 numeros");
		
		for(int i = 0; i < a.length; i++) {
			
			a[i] = src.nextInt();
			
		}
			
			for(int i = 0; i < a.length; i++) {
				
				if(a[i] > 0) {
					
					contadorP++;
					
				}else if(a[i] < 0){
				
					contadorN++;
				
				}else {
					
					contadorC++;
					
				}
				
			}
			
			System.out.println("Hay " + contadorP + " numeros positivos " + contadorN  + " numeros negativos " + contadorC + " ceros");
			
	}
	
}
