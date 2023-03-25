package Excepciones;

public class ejercicioPracticaExcepciones2 {

public static void main(String[] args) throws Exception {
		
		
		
	}
	
	public static double division() throws Exception{
		
	try {
		
		int j  = 0;
		int i = 200;
		int division;
		
		division = i/j;
		
		return division;
		
	}catch(Exception e){
	
		System.out.println("Se ha produciodo un error");
		
	}finally {
	
			
			System.out.println("Fin del programa");
			
		}
	return 0;
	
	}
	
}
