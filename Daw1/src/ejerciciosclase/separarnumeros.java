package ejerciciosclase;
import java.util.*;

public class separarnumeros {

	public static void main(String[] args) {
		
		//separar los digitos de un número
	
		Scanner teclado = new Scanner(System.in);
		
	int numero, unidad;
	
	System.out.println("Escriba un número");
	
	numero = teclado.nextInt();
	
	while(numero > 0 ) {
		
		unidad = numero % 10;
		
		System.out.println(unidad);
		
		numero = numero/10;
			
		}
	
	teclado.close();
}}
