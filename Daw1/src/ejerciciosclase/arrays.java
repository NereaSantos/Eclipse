package ejerciciosclase;

public class arrays {

	public static void main(String[] args) {
	
	double[] notas = {5.5, 8.7, 7.2};
	
	double suma = 0;
	
	for(int i = 0; i < notas.length; i++) {
		
		suma += notas[i];
		
	}
	
	double media = suma/notas.length;
	
	System.out.println("La media es " + media);
	
}}