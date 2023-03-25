package ejerciciosclase;

import java.util.*;

public class arrays3 {

	public static void main(String[] args) {
		
		int valores[] = {4,5,9,7};
		
		//opcion 1
		System.out.println(Arrays.toString(valores));
		
		//opcion2
		
		for(int a = 0; a < valores.length; a++)
		
		System.out.print(valores[a] + " ");
		
		System.out.println("");
		
		//opcion 3
		
		for(int a: valores)
			
			System.out.println(a + " ");
		
		System.out.println("");
		
		//Pintamos de derecha a izquierda
		
		for(int a = valores.length-1; a >= 0; a--)
			
			System.out.print(valores[a] + " ");
	}
	
}
