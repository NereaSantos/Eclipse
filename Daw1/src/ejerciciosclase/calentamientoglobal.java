package ejerciciosclase;
import java.util.*;
public class calentamientoglobal {

	public static void main(String[] arg) {
	
	Scanner teclado = new Scanner(System.in);
	
	int numero;
	
	System.out.println("Escriba un numero del 1 al 10");
	
	numero = teclado.nextInt();
	
	if (numero == 1)
      System.out.println("Temperaturas más cálidas: La acumulación de gases contaminantes hace que las temperaturas aumenten cada vez más");	
	
	else if (numero == 2)
		System.out.println("Tormentas más intensas: el nivel de inundaciones y su gravedad también irán en aumento.");
	
	else if(numero == 3)
		System.out.println("Propagación de enfermedades: Un cambio de temperatura de varios grados puede hacer que la zona templada se haga más acogedora a la propagación de determinadas enfermedades.");
	
	else if (numero == 4)
		System.out.println(" Olas de calor más fuertes: La salud e incluso la vida de miles de personas pueden verse en riesgo debido al aumento de las olas de calor, tanto en lo que se refiere a frecuencia como a intensidad.");
	
	else if (numero == 5)
		System.out.println("Derretimiento de los glaciares: Océanos con temperaturas más altas son océanos que derriten el hielo de los casquetes polares: esto significa que aumenta el nivel del mar.");
	
	else if (numero == 6)
		System.out.println("Huracanes más peligrosos: El aumento de temperatura del mar hace que los huracanes se vuelvan más violentos.");
	
	else if (numero == 7)
		System.out.println("Cambio de los ecosistemas: cambios en la duración de las estaciones, aparezcan patrones más propios de climas monzónicos");
	
	else if (numero == 8)
		System.out.println(" Aumento del nivel del mar: Desaparición de especies animales: Muchas especies de animales están viendo cómo su clima actual desaparece");
	
	else if (numero == 9)
		System.out.println("Alimentos más caros: se vierte muchísima más agua en los mares y océanos y, por tanto, aumenta el nivel del mar");
	
	else if (numero == 10)
		System.out.println("El cambio climático pone en peligro la producción de alimentos tan básicos como el trigo");
	
	else 
		System.out.println("Número no válido");
	
	teclado.close();
	
	}}
