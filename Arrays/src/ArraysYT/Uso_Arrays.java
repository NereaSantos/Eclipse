package ArraysYT;

public class Uso_Arrays {
	
	public static void main (String[] args) {
		
		int [] matriz = new int [5];
		
		//int matriz [] = new int [5];
		
		matriz [0] = 5;
		
		matriz [1] = 3;
		
		matriz [2] = 60;
		
		matriz [3] = 17;
		
		matriz [4] = 23;
		
		//Esto es util solo cuando la matriz tiene pocos elementos
		
		/*System.out.println(matriz[3]);
		System.out.println(matriz[1]);
		System.out.println(matriz[0]);
		System.out.println(matriz[2]);
		System.out.println(matriz[4]);*/
		
		//esto es ,as util cuando hay muchos elementos en una matriz
		
		for(int i = 0; i < 5; i++) {
			
			System.out.println("matriz 1: " + matriz[i]);
			
		}
		
		int [] matriz2 = {5, 38, 72, 24, 3};
		
		for(int i = 0; i < 5; i++) {
					
					System.out.println( "matriz 2: " + matriz[i]);
					
				}
		
		// .length llega hasta el final de la matriz segun su longitud y no hay que hardcodear la longitud de la matriz
		
		int [] matriz3 = {5, 38, 72, 24, 3, 43, 123, 544, 543, 1, 6};
		
		for(int i = 0; i < matriz3.length; i++) {
			
			System.out.println( "matriz 3: " + matriz3[i]);
			
		}
		
	}

}
