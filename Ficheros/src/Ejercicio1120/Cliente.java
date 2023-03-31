package Ejercicio1120;

public class Cliente implements Comparable {

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

	@Override
	public int compareTo(Object o) {
	
		Cliente otro = (Cliente)o;
		
		if(this.nombre.compareTo(otro.nombre) == 1) {
			
			return 1;
			
		}else if(this.nombre.compareTo(otro.nombre) == -1) {
		
			return -1;
			
		}else {
			
			this.telefono.compareTo(otro.telefono);
			
		}
		
		return 0;
	}
	
}