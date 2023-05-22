package SegundoTrimestre_Libro;

public class Persona
{
	// Atributos 
	private static int id = 1;
	
	private String nombre;
	private int codigoPersona;
	private int numeroPrestamos;
	
	// Constructores
	public Persona(String nombre)
	{
		this.nombre = nombre;
		this.codigoPersona = id++;
		this.numeroPrestamos = 0;
	}
	
	/* Getters y Setters */
	// Getters
	public String getNombre()		{return nombre;}
	public int getCodigoPersona()	{return codigoPersona;}
	public int getNumeroPrestamos() {return numeroPrestamos;}
	
	// Setters
	public void setNombre(String nombre)				{this.nombre = nombre;}
	public void setCodigoPersona(int codigoPersona)		{this.codigoPersona = codigoPersona;}
	public void setNumeroPrestamos(int numeroPrestamos) {this.numeroPrestamos = numeroPrestamos;}
	
	// toString
	public String toString()
	{
		return "[" + "Nombre: " + getNombre() + ", Codigo de Persona: " + getCodigoPersona() + ", Numero de Prestamos: " + getNumeroPrestamos() + "]" + "\n";
	}
}
