package Ejercicio1120;

public class Cliente {

	String nombre;
	String telefono;
	String id;
	
	Cliente(){
		
		
		
	}
	
	Cliente(String nombre, String telefono, String id){
		
		this.nombre = nombre;
		this.telefono = telefono;
		this.id = id;
	}
	
	public String getNombre() {
		
		return nombre;
	
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	
	}
	
	public String getTelefono() {
	
		return telefono;
	
	}
	
	public void setTelefono(String telefono) {
	
		this.telefono = telefono;
	
	}
	
}
