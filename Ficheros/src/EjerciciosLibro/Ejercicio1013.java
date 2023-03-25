package EjerciciosLibro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Ejercicio1013 {
	
	static int[] ListaDeNumeros1 = new int[0];
	
	public static void main(String[] args) {
		
	}
	
	private static void leerFichero(String NombreFichero) {
		
		String cadena;
		
		try {
			
			FileReader lector = new FileReader(NombreFichero);
			BufferedReader b = new BufferedReader(lector);
			
			while((cadena = b.readLine()) != null) {
				
				ListaDeNumeros1 = Arrays.copyOf(ListaDeNumeros1, (ListaDeNumeros1.length+1));
				ListaDeNumeros1[ListaDeNumeros1.length-1] = Integer.parseInt(cadena);
				
			}
			
			FileReader lector2 = new FileReader(NombreFichero);
			BufferedReader b2 = new BufferedReader(lector);
			
			while((cadena = b2.readLine()) != null) {
				
				ListaDeNumeros1 = Arrays.copyOf(ListaDeNumeros1, (ListaDeNumeros1.length+1));
				ListaDeNumeros1[ListaDeNumeros1.length-1] = Integer.parseInt(cadena);
				
			}
			
			Arrays.sort(ListaDeNumeros1);
    
			b.close();
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		public static void escribeFichero(String NombreFichero) {
			
			
		}
		
	}
	
}
