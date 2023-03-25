package Huevo;

public class Principal {

	public static void main(String[] args) {
		
		Clara miClara = new Clara();
		Clara Clara2 = new Clara(3.4);
		
		miClara.setVolumen(3.4);
		
		//no se puede crear un objeto sin los otros que tiene como atributos
		
		Yema miYema = new Yema("amarillo");
		Yema Yema2 = new Yema("naranja");
		Yema y1 = new Yema("naranja");
		Yema y2 = new Yema("amarillo");
		
		Huevo h = new Huevo(miYema, miClara);
		
		Huevo h1 = new Huevo(Yema2, Clara2);
		
		Huevo h3 = new Huevo(new Yema(), new Clara()); //otra manera de crear el objeto
		
		if(h.equals(h1)) {
			
			System.out.println("Los huevos son iguales");
			
		}else
			
			System.out.println("Son distintos");
		
		System.out.println(h3.GetYema().getColor()); //se pueden encadenar las veces que sea y como queramos
		
	//array de yemas
		
		Yema yemas[] = new Yema[2];
		
		yemas[0] = y1;
		yemas[1] = y2;
	}
	
}
