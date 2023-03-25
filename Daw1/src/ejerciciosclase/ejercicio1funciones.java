package ejerciciosclase;
import java.util.*;
public class ejercicio1funciones {

	public static void main(String[] args) {
		
		int a = 8, b = 3;
		
		int resultado = mayor(a, b);
		
		System.out.println(resultado);
		
	}
		
		static int mayor(int numero1, int numero2) {
			
			int elmayor = 0;
		
		if(numero1 > numero2) {
			
			elmayor = numero1;
		}
		else if(numero1 < numero2) {
			elmayor = numero2;
		}
		else if(numero1 == numero2) {
			elmayor = 0;
		}
		
		return elmayor;
		
}}