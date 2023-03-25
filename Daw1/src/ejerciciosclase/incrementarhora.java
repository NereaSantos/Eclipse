package ejerciciosclase;
import java.util.*;
public class incrementarhora {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		int horas = 0, minutos = 0, segundos = 0, dias = 0, incremento = 0;
		
		System.out.println("Escriba la hora en horas");
		
		horas = teclado.nextInt();
		
		System.out.println("Escriba la hora en minutos");
		
		minutos = teclado.nextInt();
		
		System.out.println("Escriba la hora en segundos");
		
		segundos = teclado.nextInt();
		
		System.out.println("Escriba los segundos que desea incrementar la hora");
		
		incremento =teclado.nextInt();
		
		while(horas >= 0 && minutos >= 0 && segundos >= 0) {
			
			incremento = incremento + segundos;
			
			if(segundos >= 60) {
				
				segundos = 0;
				
				minutos ++;
				
			}
			
			else if (minutos >= 60) {
				
				minutos = 0;
				
				horas++;	
					
				}
			
			else if (horas >= 24) {
			
				horas = 0;
				
				dias++;
				
			}
			
			System.out.println("La hora tras su incremento es: " + horas + "horas" + minutos + "minutos" + segundos + "segundos");
			
			
			teclado.close();
			}}}
