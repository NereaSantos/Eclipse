package ArraysYT;

public class EjemploPractico {

	public static void main(String[] args) {
		
		double acumulado, interes = 0.10;
		
		double[][] saldo = new double [6][5];
		
		for(int i = 0; i < 6; i++) {
			
			saldo [i][0] = 10000.00;
			
			acumulado = 10000.00;
			
			for(int j = 1; j < 5; j++) {
				
				acumulado = acumulado + (acumulado*interes);
				
				saldo[i][j] = acumulado;
				
			}
			
			interes = interes + 0.01;	
			
		}
		
		for(int z = 0; z < 6; z++) {
			
			for(int h = 0; h < 5; h++) {
				
				System.out.println(saldo [z][h]);
				
				System.out.println(" ");
			}
			
		}
		
	}
	
}
