package PracticaEvaluableFicheros;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Familiar implements Serializable {

	private String dni;
	private String nombre;
	private Date fechaNacimiento;
	
	public Familiar(String dni, String nombre, Date fechaNacimiento2) {

		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento2;

	}
	
	public Familiar() {

		

	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public LocalDate getFechaNacimiento() {
	    return this.fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}


	 @Override
	    public String toString() {
	        return "Familiar" +
	                "\n dni: " + dni +
	                "\n nombre: " + nombre + 
	                "\n fechaNacimiento: " + fechaNacimiento;
	    }
	
}