package Libro;

public class Persona {

	private String nombre;
	private String codigo;
	
	private int numPrestamo;
	
	Persona(String nombre, String codigo){
		
		this.nombre = nombre;
		this.codigo = codigo;
		
	}
	
	//Getters y Setters
	
	String getNombre() {
		
	return this.nombre = nombre;	
		
	}
	
	 void setNombre(String nombre) {
		 
		 this.nombre = nombre;
		 
	 }
	 
	 String getCodigo() {
		 
		 return this.codigo = codigo;
		 
	 }

	 void setCodigo(String codigo) {
		 
		 this.codigo = codigo;
		 
	 }
	 
	 int getNumPrestamo() {
		 
		 return this.numPrestamo = numPrestamo;
		 
	 }
	 
	 void setNumPrestamo(int numPrestamo) {
		 
		 this.numPrestamo = numPrestamo;
		 
	 }
	 
	 public String toString() {
			
			return "\n Nombre " + nombre + "\n Codigo " + codigo + "\n Numero de prestamos " + numPrestamo;
		
		}
	 
}