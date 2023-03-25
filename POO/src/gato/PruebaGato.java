package gato;

public class PruebaGato {

	public static void main(String[] args) {
		
		gato felix = new gato();
		felix.nombre = "felix";
		felix.peso = 10;

			System.out.println(felix.raza);
		
		
		gato dos = new gato("pardo");
		dos.nombre = "Garfiel";
		dos.peso = 20;
		
		
			System.out.println(dos.raza);
		
		gato tres = new gato("pardo");
		tres.nombre = "tres";		
		
			System.out.println(tres.raza);
		
		dos.maullido();
		tres.ronronea();
		felix.come("Pescado");
	
		System.out.println(felix.pelea(dos));
		
		felix.raza = "sabado";
		
		System.out.println(felix.getRaza());
		
		gato g1 = new gato("gato");
		gato g2 = new gato("gatodos");
		gato g3 = new gato("gatotres");
		
	}
	
}