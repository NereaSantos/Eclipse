package ejercicios1trimestre;

import java.util.*;

public class ejercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2, suma, resta, media;
		
		System.out.println("Escriba dos número");
		
		num1 = teclado.nextInt();
		
		num2 = teclado.nextInt();
		
		if(num1 >= 0 && num2 >= 0 || num1 <= 0 && num2 <= 0) {
			
			suma =  num1 + num2;
			
			resta = num1 - num2;
			
			media = (num1 + num2)/2;
			
			System.out.println("\n La suma de los numeros es " +  suma + "\n La resta de los numeros es " + resta + "\n La media de los numeros es " + media);
			
		}
		
	}
	
}
