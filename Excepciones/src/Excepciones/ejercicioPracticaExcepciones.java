package Excepciones;

public class ejercicioPracticaExcepciones {

	public static void main(String[] args) {
		
		division();
		
	}
	
	public static double division() {
		
	try {
		
		int j  = 0;
		int i = 200;
		int division;
		
		division = i/j;
		
		return division;
		}
		catch(Exception e){
			
			System.out.println("Error de calculo");	
			
		}finally {
			
			System.out.println("Fin del programa");
			
		}
	return 0;
	
	}
	
}
