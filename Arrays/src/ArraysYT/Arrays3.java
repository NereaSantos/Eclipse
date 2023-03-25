package ArraysYT;

public class Arrays3 {

	public static void main(String[] args) {
		
		int[] matriz = new int[150];
		
		for(int i = 0; i < matriz.length; i++){
			
			matriz[i] = (int)Math.round(Math.random()*100);
			
		}
		
		for(int j: matriz) {
			
			System.out.print(j + " ");
			
		}
		
	}

}
