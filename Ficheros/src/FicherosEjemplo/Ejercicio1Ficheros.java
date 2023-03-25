package FicherosEjemplo;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ejercicio1Ficheros {

	public static void main(String[] args) {
		
		leerFichero("Fichero.txt");
		
		//no muestra nada por consola, solo "Carga" el fichero
		
	}
	
	private static void leerFichero(String nombreFichero) {
		
		//Ejemplo de excepcines comprobadas
		//Si no se gestiona el programa no compila
		//y por lo tanto no deja ejecutar
		
		try {
			FileReader lector = new FileReader(nombreFichero);
		} catch (FileNotFoundException e) {
			
			System.out.println("Fichero no encontrado");
		}
		
	}
	
}
