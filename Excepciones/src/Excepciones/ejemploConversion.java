package Excepciones;

public class ejemploConversion {

	public static void main(String[] args) {
	
	Animal a = new Animal();
	
	a.nombre = "pepe";
	
	Perro b = new Perro();
	
	b.raza = "callejero";
	
	//Perro c = (Perro) a; // No funciona porque no todos los animales eran perros
	
	Animal d = new Perro();
	
	Perro c = (Perro) d;
	
	c.nombre = "paco";
	
	System.out.println(c.nombre);

	Perro e = new Perro();
	
	e.nombre = "Julia";
	
	Animal f = (Animal) e; //Funciona porque todos los perros son animales
	
	//f.nombre = "Alfredo";
	
	System.out.println(f.nombre);
	
	
	
	}
}


class Animal {
	
	private String tipo;
	public String nombre;
	
	public void Dormir() {
		
		System.out.println("Estoy durmiendo como un animal");
		
	}
	
}

class Perro extends Animal {
	
	public String raza;
	
	public void Comer() {
		
		System.out.println("Me gusta comer de lo que sea, porque soy un perro");
		
	}
	
}