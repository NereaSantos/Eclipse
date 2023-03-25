package ejerciciosclase;
import java.util.*;
public class numerosecreto {

	public static void main(String [] arg) {
	
		Scanner teclado = new Scanner(System.in);
		
		int intentos = 5, numsecreto, numingresado;
		
		System.out.println("Adivine el numero secreto (Del 1 al 20)");
		
		numsecreto = (int)(Math.random()* 20 + 1);
		
		numingresado = teclado.nextInt();
		
		while(numsecreto != numingresado && intentos > 1) {
			if(numsecreto > numingresado)
					System.out.println("El numero secreto es mas alto");
				else
					System.out.println("El numero secreto es mas bajo");
			intentos = intentos - 1;
			System.out.println("Le quedan " + intentos + " intentos ");
			System.out.println("Vuelva a intentarlo");
	
			numingresado = teclado.nextInt();
		}
		
		int intentosdef = 5 - intentos;
		
		if (intentos == 0)
			System.out.println("Respuesta incorrecta. El numero era  " + numsecreto);
		
		
		else if (numsecreto == numingresado)
			System.out.println("Exacto, usted adivinó el numero en " + intentosdef + " intentos ");
			System.out.println("El numero era " + numsecreto);
}}
