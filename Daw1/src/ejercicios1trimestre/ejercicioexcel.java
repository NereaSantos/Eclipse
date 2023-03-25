package ejercicios1trimestre;

import java.util.*;

public class ejercicioexcel {

	public static void main(String[] args) {
		
		int matrizA [][] = new int [2][4];
		
		int matrizC [][] = {{2,9},
							{5,6},
							{4,3},
							{7,1}};
		
		for (int i = 0; i < matrizC.length; i++) {
			
			//matrizC[i].length es para saber la longitud de la fila (2)
			
			for(int j = 0; j < matrizC[i].length; j++) {
		
		System.out.println(matrizC[i][j]);
		
			}
		
		}
	}
	
}
