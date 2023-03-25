package ejerciciosclase;
import java.util.*;
public class numeroyedad {

	public static void main(String [] arg) {
	
		int edad;
		double numero;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime tu número favorito");
		
		numero = teclado.nextDouble();
		
		System.out.println("Dime tu edad");
		
		edad = teclado.nextInt();
		
		if (numero/2 == 0)
		
		System.out.println("Tu numero es par");
		
		 else if (edad <18)
		
		System.out.println("Eres menor");
		
		 else System.out.println("Eres mayor");
		
		
}}
