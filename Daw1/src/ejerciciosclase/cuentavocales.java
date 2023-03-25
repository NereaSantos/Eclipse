package ejerciciosclase;
import java.util.*;
public class cuentavocales {

	public static void main(String[] args) {
		
		
		
	}
	
	public static void cuetavocales(String palabra, String a, String e, String i, String o, String u) {
		
		a = "a";
		e = "e";
		i = "i";
		o = "o";
		u = "u";
		
		boolean vocales = false;
		
		
		while(palabra != null) {
			
			if(palabra.substring(0, palabra.length()).contains(a) || palabra.substring(0, palabra.length()).contains(e) || palabra.substring(0, palabra.length()).contains(i) || palabra.substring(0, palabra.length()).contains(o) || palabra.substring(0, palabra.length()).contains(u)) {
				
				vocales = true;
				
				System.out.println(vocales); 
				
			}
			else 
				
				vocales = false;
					
				System.out.println(vocales);
			
		}
		
	}
	
}
