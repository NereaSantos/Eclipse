package gato;

public class gato {

	//private String raza hace que no se pueda cambiar el autor a no ser que sea con un set
	
	//Ejercicio: equals con el nombre si se llaman igual. si se llaman igual devuelve true y si no false
	//array de gatos tamaño 3, cuantos gatos se llaman igual en el array.
	
	String raza;
	String color;
	String nombre;
	int edad;
	double peso;
	
	//constructor
	
	gato(String nombre){
		
		this.nombre = nombre;
		raza = "callejaero"; //valor de callejero hardcodeado
		
	}
	
	gato(){ //lo que se ponga en la variable r se va a aasignar a raza
		
		this.raza = raza;
		
	}
	
	void maullido() {
		
	System.out.println("miau");	
		
	}
	
	void ronronea() {
		
		System.out.println("rrrr");
		
	}
	
	void come(String comida) {
		
		if(comida.equalsIgnoreCase("pescado")) {
			
			System.out.println("Que rico");
			
		}else
			
			System.out.println("no lo quiero");
	}
	
	void dormir() {
		
		System.out.println("Zzz");
		
	}
	
	String pelea(gato cuatro) {
		
		String resultado = "";
		
			if(cuatro.raza.equalsIgnoreCase("callejero")) {
				
				System.out.println("No quiere pelea");
				
			}else { 
				
				System.out.println("va a mueste");
			
				
				if(this.peso > cuatro.peso) { //this hace referencia al objeto que invoca el método
				
					resultado = this.nombre;
				
				
				}else
				
					resultado =cuatro.nombre;
				}
			
			return resultado;
	
	}
	
	//Getters
	
	String getRaza() {
		
		return this.raza;
		
	}
	
	String getColor() {
		
		return this.color;
		
	}
	
	String getNombre() {
		
		return this.nombre;
		
	}
	
	int getEdad() {
		
		return this.edad;
		
	}
	
	Double getPeso() {
		
		return this.peso;
		
	}
	
	//Setter
	
	void setRaza(String raza) {
		
		this.raza = raza; //
		
	}
	
	void setColor(String color) {
		
		this.color = color;
		
	}
	
	void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	void setEdad(int edad) {
		
		this.edad = edad;
		
	}
	
	void setPeso(Double peso) {
		
		this.peso = peso;
		
	}
	
	public boolean equals(gato otro) {
		
		if(this.nombre.equals(otro.nombre)) {
			
			return true;
			
		}
		else {
			
			return false;
			
		}
	}

	gato[] gatos = new gato[3];
		
	/*gatos [0] = g1;
	
	gatos [1] = g2;
	
	gatos [2] = g3;
		
	for(int i = 0; i < 3; i++) {

		if(this.nombre.equals(g1.nombre)) {
			
		}*/
		
	}



