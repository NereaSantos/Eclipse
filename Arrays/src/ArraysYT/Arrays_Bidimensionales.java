package ArraysYT;

public class Arrays_Bidimensionales {

	public static void main (String[] args) {
		
		int [] [] matriz2D = {
				{10, 15,18,19,21},
				{1, 95,38,49,2},
				{0, 75,28,10,41},
				{40, 97,79,59,31}
		};
		
		/*matriz2D[0][0] = 15;
		matriz2D[0][1] = 25;
		matriz2D[0][2] = 91;
		matriz2D[0][3] = 5;
		matriz2D[0][4] = 87;
		
		matriz2D[1][0] = 65;
		matriz2D[1][1] = 65;
		matriz2D[1][2] = 55;
		matriz2D[1][3] = 90;
		matriz2D[1][4] = 15;
		
		matriz2D[2][0] = 62;
		matriz2D[2][1] = 26;
		matriz2D[2][2] = 74;
		matriz2D[2][3] = 16;
		matriz2D[2][4] = 8;
		
		matriz2D[3][0] = 64;
		matriz2D[3][1] = 16;
		matriz2D[3][2] = 47;
		matriz2D[3][3] = 48;
		matriz2D[3][4] = 28;*/
		
		/*for(int i = 0; i < 4; i++) {
		
			System.out.println();
			
			for(int j = 0; j < 5; j++) {
			
				System.out.print(matriz2D[i][j] + " ");
				
				
			}
			
			System.out.println(" ");*/
		
		for(int[]fila: matriz2D) {
			
			System.out.println();
			
			for(int i: fila) {
				
				System.out.println(i + " ");
			}
			
		}
		
	}
	
}
