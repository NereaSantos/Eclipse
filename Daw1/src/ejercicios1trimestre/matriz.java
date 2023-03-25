package ejercicios1trimestre;

import java.util.*;

public class matriz {

	public static void main(String[] args) {
		
		int matrizA [][] = {{1,2},
							{4,7},
							{3,5},
							{2,4}};
		
		int matrizB [][] = new int [2][4];
		
		for (int i = 0; i < matrizA.length; i++) {
			
			for(int j = 0; j < matrizA[i].length; j++) {
				
				matrizB [j][i] = matrizA[i][j];
					
				}
			
			for(i = 0; i < matrizB.length; i++) {
				
				for(int j = 0; j < matrizB[i].length; j++) {
					
				System.out.println(matrizB[i][j]);	
					
				}
			
				System.out.println("");
				
			}
			
		}
		
	}
	
}