package comodinBanco;

public class Cliente {

	String DNI;
	String nombre;
	String apellido1;
	String apellido2;
	String[] apellidos = new String[2];{
	
	apellidos[0] = apellido1;
	apellidos[1] = apellido2;
	
	}
	String direccion;
	int telefono;
	
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
	
	public int getTelefono() {
	
		return telefono;
	
	}
	
	public void setTelefono(int telefono) {
	
		this.telefono = telefono;
	
	}
	
	
	
}
