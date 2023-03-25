package ejercicios1trimestre;

import java.util.*;

public class ejercicio8 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int antiguedad;
		
		double precio;
		
		boolean estudiante = false;
		
		System.out.println("Introduzca el precio de una revista");
		
		precio = teclado.nextInt();
		
		System.out.println("Introduzca la antiguedad del suscriptor en años");
		
		antiguedad = teclado.nextInt();
		
		System.out.println("¿El susciptor es estudiante? (true/flase) ");
		
		estudiante = teclado.nextBoolean();
		
		if(antiguedad > 5 && estudiante == true) {
			
			precio = precio*0.2;
			
		}
		
		else if (antiguedad > 5 && estudiante == false) {
			
			precio = precio*0.15;
			
		}
		
		if(antiguedad > 3 && antiguedad < 5 && estudiante == true) {
			
			precio = precio*0.10;
			
		}
		
		else if(antiguedad > 3 && antiguedad < 5 && estudiante == false) {
			
			precio = precio*0.05;
			
		}
		
		if (estudiante == true && antiguedad == 0) {
			
			precio = precio*0.02;
			
		}
		
		else if(estudiante == false && antiguedad == 0){
			
			precio = precio;
			
		}
		
		System.out.println("El precio final de sus ");
		
	}
	
}
