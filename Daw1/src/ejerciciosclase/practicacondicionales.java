package ejerciciosclase;
import java.util.*;
public class practicacondicionales {

	public static void main(String[] arg) {
		
		Scanner teclado = new Scanner(System.in);
		
		int edad;
	
		System.out.println("¿Que edad tienes?");
		
		edad = teclado.nextInt();
		
		if (edad < 18) 
		
		System.out.println("eres menor");
		
		else if (edad <= 30)
			
			System.out.println("Eres joven");
			
		else if (edad <= 50)
			
			System.out.println("Estas mayorcito");
			
		 else if (edad < 70)
		
			System.out.println("Estas mayorcill@");
		
			else if (edad > 70)
		
		System.out.println("Cuidate");
		
		
}}
