package FicherosEjemplo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ejercicio3 {

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
			//true sirve para que no se borre lo ya escrito en el fichero
			FileWriter escritor = new FileWriter(nombreFichero, true);
			//el true indica que se debe abrir el archivo
			BufferedWriter bw = new BufferedWriter(escritor);
			
			//escribimos en el fichero
			bw.write("Escribimos desde el programa");
			bw.newLine();
			bw.close(); //sin el close no escribe nada, hay que cerrar el ciclo
			
		} catch(FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		}
		catch (IOException e) { //Este catch viene del metodo read Line
			
			e.printStackTrace();
			
		}
		
	}
	
}
