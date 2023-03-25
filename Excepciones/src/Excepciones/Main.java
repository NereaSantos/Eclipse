package Excepciones;

public class Main {//EN ESTE CASO ES MEJOR ARREGLAR EL ERROR

	public static void main(String[] args) {
		
		try {//RunTimeException
			
			int[] numeros = {1, 2, 3};
			
			int calculo = numeros[4];
			//System.out.println(numeros[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Posicion fuera del array");
			
		}
		catch(Exception e) {
			
			System.out.println("Algo fue mal");
			
		}
	}
	
}
