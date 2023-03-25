package Practica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjercicioListanumeros {
	
	public static void main(String[] args) {
		
		leerFichero("Fichero2.txt");
		
		
	}
	
	private static void leerFichero(String nombreFichero) {
	    String cadena;
	    double suma = 0;
	    int contador_numeros = 0;

	    try {
	        FileReader lector = new FileReader(nombreFichero);
	        BufferedReader b = new BufferedReader(lector);

	        while ((cadena = b.readLine()) != null) {
	            // Dividir la cadena en un array de String utilizando los espacios como separadores
	            String[] numeros_str = cadena.split(" ");
	            // Recorrer el array y convertir cada elemento a un tipo numérico
	            for (String numero_str : numeros_str) {
	                // Intentar convertir el String a un double
	                try {
	                    double numero = Double.parseDouble(numero_str);
	                    suma += numero;
	                    contador_numeros++;
	                } catch (NumberFormatException e) {
	                    // Ignorar el elemento si no se puede convertir a un número
	                }
	            }
	        }
	        b.close();
	    } catch (FileNotFoundException e) {
	        System.out.println("Fichero no encontrado");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    // Calcular la media aritmética si se leyeron números
	    if (contador_numeros > 0) {
	        double media = suma / contador_numeros;
	        System.out.println("La media aritmética es: " + media);
	    } else {
	        System.out.println("No se encontraron números en el fichero.");
	    }
	}

}
