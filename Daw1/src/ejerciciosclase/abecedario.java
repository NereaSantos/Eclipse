package ejerciciosclase;
import java.util.*;
public class abecedario {

	public static void main(String[] args) {
		
		String total = "";
		
		int contador = 0;
		
		for (char letra = 'a'; letra <= 'z'; letra++){
			
			System.out.println(letra);	
			
			total = total + letra;
			
		}
		System.out.println("");	
	for (char letra = 'a'; letra <= 'z'; letra+=2){
			
			System.out.println(letra);		
			
			total = total + letra;
			
	}
				
	System.out.println("");	
	for (char letra = 'B'; letra <= 'Z'; letra+=2){
			
			System.out.println(letra);		
			
			total = total + letra;
	}
	System.out.println("");	
	for (char letra = 'z'; letra >= 'a'; letra--){
			
			System.out.println(letra);		
			
			total = total + letra;
	}
	
	
	
	System.out.println("");
	System.out.println("has generado " + total.length() + "letras");
	
			}}