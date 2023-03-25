package ejerciciosclase;
import java.util.*;
public class ejercicio3 {
	public static void main(String[] args) {
		Scanner miEscaner = new Scanner(System.in);
		
		//Def variable
		double numero;
		
		double numero2;
		
		double numero3;
		
		//pregunta
		System.out.println("Dime 3 notas");
		
		numero = miEscaner.nextDouble();
		numero2 = miEscaner.nextDouble();
		numero3 = miEscaner.nextDouble();
		
		double media;
		
		media= (numero + numero2 + numero3)/3;
	   
		System.out.println("La media es" + media);
		
		numero = miEscaner.nextDouble();
		
		
		
		}
	}
