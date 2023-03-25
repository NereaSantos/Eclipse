package ejerciciosclase;
import java.util.*;
public class palindromo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
	
		String frase = null;
		
		int i = 0, longitud;
		
		System.out.println("Escriba una frase");
		
		frase = teclado.next();
		
		longitud = frase.length();
		
		 while(frase.charAt(i) == frase.charAt(longitud - 1) && longitud/2 != 0){
			
			 i++;
			 
			if(frase.charAt(i) == frase.charAt(longitud - 1-i)){
			
				
				System.out.println(frase + " Es palindromo");
				
			}else
				
				System.out.println(frase + " No es palindromo");
				
			}
			
			teclado.close();
			
			}
			
		
		}
