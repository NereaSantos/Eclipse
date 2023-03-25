package preguntaExamen;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int b = 5;
		
		System.out.println(metodoA(b));
		System.out.println(metodoB(b));
		System.out.println(b);
	}
	
	static int metodoA(int y) {
		
		return y+8;
		
	}
	
	static int metodoB(int b) {
		
		return b+6;
		
	}
	
}

/* ¿Que devuelve este codigo?

	Syso(metodoA(b)) --> 13
	Syso(metodoB(b)) --> 11
	Syso(b) --> 5
	
*/