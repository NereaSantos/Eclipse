package ejercicios1trimestre;

import java.util.*;

public class ejercicio7 {
	
	public static void main(String[] args) {

	Scanner teclado = new Scanner(System.in);
	
	int aforo, entradas;
	
	double precio;
	
	System.out.println("Intrudizca el aforo máximo del local");
	
	aforo = teclado.nextInt();
	
	System.out.println("introduzca el precio de la entrada");
	
	precio = teclado.nextInt();
	
	System.out.println("Introduzca el numero de entradas vendidas");
	
	entradas = teclado.nextInt();
	
	if(entradas <= aforo*0.2) {
		
		System.out.println("El concierto debe cancelarse");
		
	}
	
	if(entradas <= aforo*0.5) {
	
		precio = precio*0.25;
		
		System.out.println("Se ha realizado un descuento en el precio de las entradas debido al aforo. \n Ahora el precio es de " + precio + " euros");
		
	}
	
	}
	
}
