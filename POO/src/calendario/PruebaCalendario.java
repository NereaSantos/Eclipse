package calendario;

public class PruebaCalendario {

	public static void main(String[] args) {
		
		Calendario uno = new Calendario(6,4,2003);
		
		Calendario dos = new Calendario(4,9,2003);
		
		uno.setDia(20);
		System.out.println(uno);
		
		uno.incrementaDia();
		
		
	}
	
}
