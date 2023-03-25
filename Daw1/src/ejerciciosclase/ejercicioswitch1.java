package ejerciciosclase;
import java.util.*;
public class ejercicioswitch1 {
	
	public static void main(String [] arg) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzcan una nota");
		
		int nota = teclado.nextInt();
		
		switch (nota) {
		
		case 0,1,2,3,4 ->
		System.out.println("Insuficiente");
		case 5 ->
		System.out.println("Suficiente");
		case 6 ->
		System.out.println("Bien");
		case 7,8 ->
		System.out.println("notable");
		case 9,10 ->
		System.out.println("Sobresaliente");
		default ->
		System.out.println("nota no valida");
		
		}}}