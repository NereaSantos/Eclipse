package EjerciciosLibro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio1014 {

	public static void main(String[] args) {
        String archivo = "carta.txt";
        int caracteres = 0;
        int lineas = 0;
        int palabras = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas++;
                caracteres += linea.length();

                // Eliminamos los espacios en blanco al principio y al final de la línea
                linea = linea.trim();

                // Si la línea no está vacía, contamos las palabras
                if (!linea.isEmpty()) {
                    // Dividimos la línea en palabras utilizando espacios en blanco como separador
                    String[] palabrasLinea = linea.split("\\s+");
                    palabras += palabrasLinea.length;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Caracteres: " + caracteres);
        System.out.println("Lineas: " + lineas);
        System.out.println("Palabras: " + palabras);
    }
	
}
