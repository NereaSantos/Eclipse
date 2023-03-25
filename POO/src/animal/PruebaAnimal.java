package animal;

public class PruebaAnimal {

	public static void main(String[] args) {
		
		animal a1 = new animal();
		
		tigre t1 = new tigre();
		
		t1.come(); //si hay dos metodos iguales en herencia (sin parametros) se proriza el del propio objeto que lo invoca
		
		t1.come(); //si hay dos metodos pero uno de ellos con parametro apareceran ambos y serán dos métodos distintos
		
		//por mucho que el objeto que hereda no tenga metodo to string lo heredará igualmente del objeto principal
		//super hace referencia al objeto principal. Acceder a atributos de la clase padre
		
	}
	
}
