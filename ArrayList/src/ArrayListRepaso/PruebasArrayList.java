package ArrayListRepaso;

import java.util.ArrayList;

public class PruebasArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> MiArrayList = new ArrayList<String>();
		
		MiArrayList.add("Hola");
		MiArrayList.add("Adios");
		MiArrayList.add("pepe");
		
		for(String string : MiArrayList) {
			
			System.out.println(string);
			
		}
		System.out.println(" ");
		
		System.out.println(MiArrayList);
		
		System.out.println(" ");
		
		System.out.println(MiArrayList.size());
		
		System.out.println(" ");
		
		System.out.println(MiArrayList.get(2));
		
		MiArrayList.remove(0);
		
		System.err.println(" ");
		
		System.out.println(MiArrayList);
		
	}
	
}
