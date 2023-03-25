package ArraysYT;

import java.util.*;

public class sortYcopyof {

	public static void main(String[] args) {
		
		int arr[] = {45, 32, 89, 12, 4, 17}; // length: 6
		
		int newarr[] = Arrays.copyOf(arr, 8); // copyOf
		
		//Arrays.sort(arr); // ordena el array de menor a mayor
		
		newarr[6] = 34;
		
		newarr[7] = 3;
		
		Arrays.sort(newarr);
		
		//newarr[8] = 22; da error ya que es mayor que el tamaño del array
		
		for(int i = 0; i < newarr.length; i++) {
			
			System.out.println(newarr[i]);
			
		}
		
	}
	
}
