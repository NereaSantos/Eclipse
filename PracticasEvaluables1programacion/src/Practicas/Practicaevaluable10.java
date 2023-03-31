package Practicas;
import java.util.*;

public class Practicaevaluable10 {

public static void main(String[] args){

Scanner teclado = new Scanner(System.in);

	int numero = 0, suma = 0;

	do{
	    System.out.println("Escriba un número");
	
	        numero = teclado.nextInt();
	
	        suma += numero;
	}
	while(numero != 0);
	
	    System.out.println("La suma de los numeros es " + suma);
	
	
	teclado.close();
	
	}}