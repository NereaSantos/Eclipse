package ejercicios1trimestre;

import java.util.*;

public class cuwntasegundos {

	public static void main(String[]args) {
		
		int horas = 0, minutos = 1, segundos = 1;
		
		System.out.println(totalSegundos(horas,minutos,segundos));
		
	}
	
	static int totalSegundos (int h, int m, int s) {
	
		return(h+ 360 + m + 60 + s);
		
	}
}
