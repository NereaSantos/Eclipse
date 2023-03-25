package deberes;

import java.util.*;

public class ejercicio511arrays {

	public static void main(String[] args) {
		
		int arrayOriginal[] = {3, 4, 3, 2, 5};
		
		System.out.println(Arrays.toString(arrayOriginal));
		
		int buscar = 3;
		
		int indice [] = buscarTodos(arrayOriginal, buscar);
		
		System.out.println("El numero " + buscar + " se encuentra en los indices");
		
		System.out.println(Arrays.toString(indice));
		 
	}
	
	static int[] buscarTodos(int t[], int clave) {
		
		int encontrado[] = new int [0];
		
		for(int i = 0; i < t.length; i++) {
			
			if(t[i] == clave) {
				
				encontrado = Arrays.copyOf(encontrado, encontrado.length + 1);
				
				encontrado[encontrado.length-1] = i;
				
			}
			
		}
		
		return encontrado;
	}
	
}
