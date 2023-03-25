package FicherosEjemplo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {

public static void main(String[] args) {
		
		leerFichero("Fichero.txt");
		
		//muestra nada por consola, solo "Carga" el fichero
		
	}
	
	private static void leerFichero(String nombreFichero) {
		
		//Ejemplo de excepcines comprobadas
		//Si no se gestiona el programa no compila
		//y por lo tanto no deja ejecutar
		
		String cadena;
		int contador_lineas = 0;
		
		try {
			FileReader lector = new FileReader(nombreFichero);
			BufferedReader b = new BufferedReader(lector);
			
			while((cadena = b.readLine()) != null) {
				
				System.out.println(cadena);
				
			}
			
		} catch(FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		}
		catch (IOException e) { //Este catch viene del metodo read Line
			
			e.printStackTrace();
			
		}
		
	}
	
}
