package Estructurasdedatos;

public class Principal {

	public static void main(String[] args) {
		
		Nodo n1 = new Nodo();
		
		n1.info = 4;
		
		System.out.println(n1.info);
		
		Nodo n2 = new Nodo();
		
		n2.info = 2;
		
		n1.siguiente = n2;
		
	}
	
}
