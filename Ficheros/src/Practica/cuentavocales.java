package Practica;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class cuentavocales {

	public static void main(String[] args) {
		//leer el fichero y escribir en el fichero cuantas vocales hay
		
		cuentavocales("Fichero.txt","a", "e", "i", "o", "u");
		
	}
	
	public static void cuentavocales(String nombreFichero,String a, String e, String i, String o, String u) {
		
		a = "a";
		e = "e";
		i = "i";
		o = "o";
		u = "u";
		
		int vocales = 0;
		String palabra = null;
		
//		while(palabra != null) {
//			
//			if(palabra.substring(0, palabra.length()).contains(a) || palabra.substring(0, palabra.length()).contains(e) || palabra.substring(0, palabra.length()).contains(i) || palabra.substring(0, palabra.length()).contains(o) || palabra.substring(0, palabra.length()).contains(u)) {
//				
//				vocales = true;
//				
//				System.out.println("El numero de vocales es " + vocales); 
//				
//			}
//			else 
//				
//				vocales = false;
//			
//		}
		
		String cadena;
		
		try {
			
			FileReader lector = new FileReader(nombreFichero);
			BufferedReader b = new BufferedReader(lector);
			
			while((palabra = b.readLine()) != null) {
				
				System.out.println(palabra);
				
				for(int  n = 0; n < palabra.length(); n++) {
				
				if(palabra.substring(0, palabra.length()).contains(a) || palabra.substring(0, palabra.length()).contains(e) || palabra.substring(0, palabra.length()).contains(i) || palabra.substring(0, palabra.length()).contains(o) || palabra.substring(0, palabra.length()).contains(u)) {
					
					vocales++;
					
					
				}
			}
				
			System.out.println("El numero de vocales es " + vocales); 
				
		}
			
		} catch(FileNotFoundException ex) {
			System.out.println("Fichero no encontrado");
		}
		catch (IOException ex) { //Este catch viene del metodo read Line
			
			ex.printStackTrace();
			
		}
		
	}
		
//		private static void leerFichero(String nombreFichero) {
//		
//		String palabra;
//		
//		try {
//			
//			FileReader lector = new FileReader(nombreFichero);
//			BufferedReader b = new BufferedReader(lector);
//			
//			while((palabra = b.readLine()) != null) {
//				
//				System.out.println(palabra);
//		
//			}
//			
//		} catch(FileNotFoundException e) {
//			System.out.println("Fichero no encontrado");
//		}
//		catch (IOException e) { //Este catch viene del metodo read Line
//			
//			e.printStackTrace();
//			
//		}
//		
//		
//	}
	
}
