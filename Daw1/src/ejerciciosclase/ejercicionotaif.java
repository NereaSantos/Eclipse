package ejerciciosclase;
import java.util.*;
public class ejercicionotaif {

	public static void main(String [] arg) {
		
		Scanner teclado = new Scanner(System.in);
	
		double nota;
		
		System.out.println("Introduzca una nota");
		
		nota = teclado.nextDouble();
		
		if (nota >= 0 && nota <5 )
		System.out.println("Suspenso");
		
		if (nota == 5 )
			System.out.println("Suficiente");
		
		else if (nota == 6)
			System.out.println("Bien");
		
		else if (nota > 6 && nota <9)
			System.out.println("notable");
		
		else if (nota > 9 && nota <10)
		System.out.println("Sobresaliente");
		
		else System.out.println("Nota no valida");
		
		
}} 