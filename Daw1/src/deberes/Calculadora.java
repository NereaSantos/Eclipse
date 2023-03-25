package deberes;
import java.util.*;
public class Calculadora {
	
	public static void main(String[] arg) {
	
		//definicion de variables
		double importe;
		int iva;
		Scanner teclado = new Scanner(System.in);
		
		//recogida de datos por parte del usuario
		System.out.println("Escribe el importe");
		
		importe = teclado.nextDouble();
		
		System.out.println("Escribe el iva");
		
		iva = teclado.nextInt();
		// importe*(iva/100.0) o (importe*iva)/100
		double adicional = importe*iva/100;
		
		//chequeo del calculo del importe adicional
		System.out.println("El importe adicional es:" + adicional);
		
		double importeTotal = adicional + importe;
		
		System.out.println("El importe final es:" + importeTotal);
		
		teclado.close();
	}
	}
