package ejerciciosclase;
import java.util.*;
public class ejercicio17 {

	public static void main(String[] arg){
	
		double milimetros, centimetros, metros, centimetros2;
		
		System.out.println("escribe una distancia en milímetros");
	
		Scanner teclado = new Scanner(System.in);
		
		milimetros = teclado.nextDouble();
		
		System.out.println("escribe una distancia en centimetros");
		
		centimetros = teclado.nextDouble();
		
		System.out.println("escribe una distancia en metros");
		
		metros = teclado.nextDouble();
		
		centimetros2 = (milimetros*1000) + centimetros + (metros/1000);
		
		System.out.println("La suma de las tres es:" + centimetros2);
		
}}
