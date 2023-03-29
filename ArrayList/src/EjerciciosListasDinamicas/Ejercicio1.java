package EjerciciosListasDinamicas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//numero de alturas negativo y cero (revisar)
		
	}
	
	public static int numeroAlturas() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuantas alturas desea introducir?");
		
			int numAlturas = sc.nextInt();
			
			return numAlturas;
		
	}
	
	public static void leeAlturas() {
		
		Scanner sc = new Scanner(System.in);
		
		Integer altura;
		
		ArrayList<Integer> alturas = new ArrayList<>();
		
		for(int i = 0; i < alturas.size(); i++) {
			
			System.out.println("Escribe una altura");
			
				alturas.add(altura = sc.nextInt());
			
			if(altura < 0) {
				
				System.out.println("Escribe una altura");
				
					alturas.add(altura = sc.nextInt());
				
			}
			
		}	
		
	}

	public static int calcularMedia() {
		
		ArrayList<Integer> alturas = new ArrayList<>();
		
		int media = 0;
		
		for(int i = 0; i < alturas.size(); i++) {
			
			Integer in = alturas.get(i);
			
			media = (in + in)/alturas.size();
			
		}
		
		return media;
		
	}
	
	public static int MostrarResultados() {
		
		
		
	}
	
}
