package ComodinBanco;

public class Cliente {

	String DNI;
	String nombre;
	String apellido1;
	String apellido2;
	String direccion;
	String telefono;
	
	Cliente(){
		
		
		
	}
	
	Cliente(String DNI, String nombre, String apellido1, String apellido2, String direccion, String telefono){
		
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.direccion = direccion;
		this.telefono = telefono;
		
	}
	
	public String getDNI() {
		
		return DNI;
	
	}
	
	public void setDNI(String dni) {
	
		DNI = dni;
	
	}
	
	public String getNombre() {
	
		return nombre;
	
	}
	
	public void setNombre(String nombre) {
	
		this.nombre = nombre;
	
	}
	
	public String getDireccion() {
	
		return direccion;
	
	}
	
	public void setDireccion(String direccion) {
	
		this.direccion = direccion;
	
	}
	
	public String getTelefono() {
	
		return telefono;
	
	}
	
	public void setTelefono(String telefono) {
	
		this.telefono = telefono;
	
	}
	
	
	
}
