package Practica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjercicioMedia {

	//tenemos una lista de alumnos  con sus notas, en el fichero debe aparecer su nombre y la media de sus notas
	
	public static void main(String[] args) {
        
		leerFichero("Fichero3.txt");
   
	}
	
	 private static void leerFichero(String nombreFichero) {

	        try {
	            File archivo = new File(nombreFichero);
	            Scanner lector = new Scanner(archivo);

	            while (lector.hasNextLine()) {
	                String linea = lector.nextLine();
	                String[] partes = linea.split(" ");
	                String nombre = partes[0];
	                int nota1 = Integer.parseInt(partes[1]);
	                int nota2 = Integer.parseInt(partes[2]);
	                int nota3 = Integer.parseInt(partes[3]);

	                int media = (nota1 + nota2 + nota3) / 3;

	                System.out.println(nombre + " " + media);
	            }

	            lector.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("Fichero no encontrado");
	        }
	    }

	}
