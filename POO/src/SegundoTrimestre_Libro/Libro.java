package SegundoTrimestre_Libro;

public class Libro 
{
	// Atributos
	private static int id = 1;
	
	private int codigo;
	private String titulo;
	private String autor;
	private boolean disponible;
	private static Persona prestamoPersona;
	
	/* Constructores */ 
	// Por defecto
	public Libro()
	{
		
	}
	
	// Con todos los parámetros para los Libros y las Personas
	public Libro(String titulo, String autor)
	{
		this.codigo = id++;
		this.titulo = titulo;
		this.autor = autor;
		this.disponible = true;
		Libro.prestamoPersona = null;
	}
	
	/* Getters y Setters */
	// Getters 
	public int getCodigo() 						{return codigo;}
	public String getTitulo() 					{return titulo;}
	public String getAutor()					{return autor;}
	public boolean isDisponible()				{return disponible;}
	public static Persona getPrestamoPersona()  {return prestamoPersona;}

	// Setters
	public void setCodigo(int codigo)						{this.codigo = codigo;}
	public void setTitulo(String titulo)					{this.titulo = titulo;}
	public void setAutor(String autor)						{this.autor = autor;}
	public void setDisponible(boolean disponible)			{this.disponible = disponible;}
	public void setPrestamoPersona(Persona prestamoPersona) {Libro.prestamoPersona = prestamoPersona;}
	
	/* Métodos */
	// Préstamo de un libro
	public boolean prestamoLibro(Persona persona)
	{
		if (isDisponible())
	    {
	        disponible = false;
	        prestamoPersona = persona;
	        persona.setNumeroPrestamos(persona.getNumeroPrestamos() + 1);
	        return true;
	    }
		
			else 
			{
				return false;
			}
	}
	
	
	// Devolución de un libro
	public boolean devolucionLibro(Persona persona)
	{
		 if (!disponible)
		 {
			 disponible = true;
			 prestamoPersona = null;
			 persona.setNumeroPrestamos(persona.getNumeroPrestamos() - 1);
			 return true;
		 }
		 
			 else 
			 {
				 return false;
			 }
	}
	
	// toString, para mostrar la informacion de los libros
	public String toString()
	{
		String estadoPrestamo = disponible ? "Disponible" : "No Disponible";
		String propietario = (prestamoPersona != null) ? prestamoPersona.getNombre() : "Sin Dueno";
		return "[" + "Codigo: " + getCodigo() + ", Titulo: " + getTitulo() + ", Autor: " + getAutor() + ", Estado: " + estadoPrestamo + ", Prestado a: " + propietario + "]";
	}
	
	// Comparador de Libros basado en titulo y autor
	public boolean equals(Libro libro2) 
	{
	    return this.getTitulo().equalsIgnoreCase(libro2.getTitulo()) && this.getAutor().equalsIgnoreCase(libro2.getAutor());
	}
		
}