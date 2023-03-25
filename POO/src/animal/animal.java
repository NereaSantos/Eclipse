package animal;

public class animal {

	protected String nombre;
	protected String raza;
	
	animal(){
		
		nombre = "a";
		raza = "Bengala";
		
	}
	
	String getRaza() {
		
		return raza;
		
	}
	
	String getNombre() {
		
		return nombre;
		
	}
	
	void setRaza(String raza) {
		
		this.raza = raza;
		
	}
	
	void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	void come() {
		
		System.out.println("ñam ñam");
		
	}
	
	void duerme() {
		
		System.out.println("Zzz");
		
	}
	
	public String toString() {
		
		System.out.println("animal de tipo " + raza + " con nombre " + nombre);
		
		return nombre;
		
	}
	
}
