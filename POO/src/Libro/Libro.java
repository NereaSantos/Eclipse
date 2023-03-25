package Libro;

public class Libro {

	private int codigo;
	private String titulo;
	private String autor;
	private boolean disponible = true;
	private Persona persona;

	Libro(){
		
		this.titulo = titulo;
		this.autor = autor;
		this.codigo = codigo;
		
	}
		
	Libro(String titulo, String autor, int codigo){
			
			this.titulo = titulo;
			this.autor = autor;
			this.codigo = codigo;
			
		}

	public int getCodigo() {
		
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		
		this.codigo = codigo;
	}

	public String getTitulo() {
		
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		
		this.titulo = titulo;
	}

	public String getAutor() {
		
		return this.autor;
	}

	public void setAutor(String autor) {
		
		this.autor = autor;
	}

	public boolean getDisponible() {
		
		return this.disponible;
	}

	public Persona getPersona() {
		
		return this.persona;
	}

	public void setPersona(Persona persona) {
		
		this.persona = persona;
	}
	
	public boolean prestamo(Persona p) {
		
		boolean prestamo = false;
		//Comprobar que la persona pasada por parametro al metodo no tenga mas de dos prestamos
		if(this.disponible == true && p.getNumPrestamo() < 2) {
		
			disponible = false;
			//se incrementa prestados a la persona pasada por parametro
			p.setNumPrestamo(p.getNumPrestamo()+1); 
			
			prestamo = true;
			
			System.out.println("Se ha realizado el prestamo con exito");
			
		}else if(this.disponible == true && p.getNumPrestamo() > 2) {
			
			System.out.println("Usted ha realizado el maximo de prestamos disponibles");
			
		}else{
			
			prestamo = false;
			
			System.out.println("No se ha podido prestar el libro");
			
		}
		
		return prestamo;
		
	}
	
	public boolean devolucion(Persona p) {
		
	boolean devolucion = false;
		
		if(this.disponible == false && p.getNumPrestamo() >= 1) {
			
			disponible = true;
			
			devolucion = true;
			
			System.out.println("Se ha realizado la devolucion con exito");
			
		}else{
			
			devolucion = false;
			
			System.out.println("Usted no puede devolver un libro que no ha sido prestado");
			
		}
		
			
		return devolucion;
		
	}
	
	public String toString() {
		
			return "\n Titulo del Libro: " + titulo + "\n Disponibles: " + disponible + "\n Autor: " + autor + "\n Codigo: " + codigo;
		
		}

	public boolean compara(Libro otro) {
		
		if(this.autor == otro.autor && this.titulo == otro.titulo) {
			
			return true;
			
		}else 
		
		return false;
		
	}
	
}