package condicionales;

import java.util.*;

public class ejercicio4 {

	public static void main(String[] args) {
	
	Scanner src = new Scanner(System.in);
	
	int segundos, horas, minutos, segundos2;
	
		System.out.println("Introduzca un numero de segundos");
	
		segundos = src.nextInt();
		
		if(segundos > 60) {
			
			minutos = segundos/60;
			
			horas = minutos/60;
			
			
			
			System.out.println(segundos + " segundos son " + horas + " horas " + minutos + " minutos " + segundos + " segundos ");
			
		}
		
	}
}
