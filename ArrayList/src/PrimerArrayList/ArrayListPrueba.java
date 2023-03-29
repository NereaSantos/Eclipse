package PrimerArrayList;

import java.util.ArrayList;

public class ArrayListPrueba {

	public static void main(String[] args) {
	
		ArrayList<String> ListaString = new ArrayList<>();
		
		ListaString.add("Rojo");
		ListaString.add("Verde");
		ListaString.add("Amarillo");
		
		System.out.println("El tamaño de la lista es: " + ListaString.size());
		
		System.out.println(ListaString);
		
		ArrayList<Integer> ListaInteger = new ArrayList<>();
		
		ListaInteger.add(3);
		ListaInteger.add(7);
//		ListaInteger.remove(0); // Se debe poner el indice no el numero que se desea borrar
//		ListaInteger.remove(Integer.valueOf(7)); //ahora si se borra el numero 7
//		//si existen repetidos en los valores borra el primero que coincida (dos 7)
		
		Integer in = ListaInteger.get(0); // devuelve un integer
		
		System.out.println(in);
		System.out.println("El tamaño de la lista es: " + ListaInteger.size());		
		System.out.println(ListaInteger);
		
	}
	
}
