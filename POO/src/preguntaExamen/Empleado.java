package preguntaExamen;

public abstract class Empleado {

	public String nombre;
	public int edad;
	public double salario = 1500;
	
	
	
	public String getNombre() {
		
		return nombre;
	}



	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}



	public int getEdad() {
		
		return edad;
	}



	public void setEdad(int edad) {
		
		this.edad = edad;
	}



	public double getSalario() {
		
		return salario;
	}



	public void setSalario(double salario) {
		
		this.salario = salario;
	}



	public abstract void calcularBono();
	
}
