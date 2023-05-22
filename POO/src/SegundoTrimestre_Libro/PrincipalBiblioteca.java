package SegundoTrimestre_Libro;

import java.util.*;

public class PrincipalBiblioteca extends Libro
{
	private static Scanner cpc = new Scanner(System.in);
	private static Libro[] arrayLibros = new Libro[0];
	private static Persona[] arrayPersonas = new Persona[0];
	
	public static void main(String[] args)
	{
		int opcion = 0;
		
		do
		{
			// Elecciones posibles
			System.out.println();
			System.out.println("[Biblioteca]");
			System.out.println("================");
			System.out.println("1. Listado de los Libros.");
			System.out.println("2. Nuevo Libro.");
			System.out.println("3. Modificar un Libro.");
			System.out.println("4. Prestar un Libro.");
			System.out.println("5. Devolver un Libro.");
			System.out.println("6. Comparar 2 Libros.");
			System.out.print("7. Salir de la Biblioteca." + "\n");
			System.out.println("------------------------");
			System.out.println("8. Listado de Personas.");
			System.out.println("9. Nueva Persona.");
			System.out.println("10. Modificar Persona.");
			System.out.println();
			System.out.print("Opcion -> ");
			opcion = cpc.nextInt();
			System.out.println();
			
			// Métodos asociados a las elecciones
			switch (opcion)
			{ 
				case 1 -> listadoLibro();
				case 2 -> nuevoLibro();
				case 3 -> modificarLibro();
				case 4 -> prestarLibro();
				case 5 -> devolverLibro();
				case 6 -> comparador(); 
				case 7 -> salirDelMenu();
				case 8 -> listadoPersona();
				case 9 -> nuevaPersona();
				case 10-> modificarPersona();
				default -> System.out.println("Error. Elige una opcion correcta.");
			}
		}
		
		while (opcion != 7);
	}
	
	/* MÉTODOS LIBRO */
	/*=================*/
	public static void listadoLibro()
	{
		if (arrayLibros.length == 0)
		{
			System.out.println("No hay libros que mostrar.");
		}
		
			else 
			{
				System.out.println("Libros");
				System.out.println("=======");
				for (int i = 0; i < arrayLibros.length; i++)
				{
					System.out.println(arrayLibros[i]);
				}
			}
	}

	public static void nuevoLibro()
	{
		if (arrayLibros.length < 4) // Limite hardcodeado, se puede poner el limite que quieras
	    {
			cpc.nextLine(); // Para limpiar el buffer del escaner 
			
		    System.out.print("Titulo: ");
		    String titulo = cpc.nextLine();
		    
		    System.out.print("Autor: ");
		    String autor = cpc.nextLine();
	    
		    // Creamos un nuevo objeto de tipo Libro
	    	Libro libro = new Libro(titulo, autor);
	  
	    	// Creamos una copia del Array de Libros, con longitud +1
		    Libro[] anadirLibros = Arrays.copyOf(arrayLibros, arrayLibros.length + 1);
		    
		    // El objeto creado se añade a nuestro nuevo array
		    anadirLibros[anadirLibros.length - 1] = libro;
		    
		    // Y ahora asignamos el nuevo array al array de Libros
		    arrayLibros = anadirLibros;
	    	
	    	System.out.println();
	    	System.out.println("Nuevo Libro registrado.");
	    }
	    
		    else 
		    {
		    	System.out.println("No caben mas libros en la biblioteca.");
		    }
	    	
	    
	}

	public static void modificarLibro()
	{
		// Si no hay libros registrados
		if (arrayLibros.length == 0) {System.out.println("Sin Libros registrados que modificar."); return;}
		
		// Codigo de libro valido o no
		boolean correcto = false; 
		
		// Posicion en el array del codigo escrito
		int posicion = 0; 
		
		System.out.print("Codigo del Libro a Modificar -> ");
		int codigoMod = cpc.nextInt();
		
		// Recorremos el array
		for (short i = 0; i < arrayLibros.length ; i++)
		{
			// 
			if (arrayLibros[i].getCodigo() == codigoMod)
			{
				//
				correcto = true;
				
				// 
				posicion = i;
			}
		}
		
		// Si el codigo introducido es valido
		if (correcto = true)
		{
			// Elecciones
			System.out.println();
			System.out.println("Que quieres modificar del Libro con Codigo de Libro: " + codigoMod);
			System.out.println("1. Titulo.");
			System.out.println("2. Autor.");
			System.out.println();
			System.out.print("Opcion -> ");
			int eleccion = cpc.nextInt();
			cpc.nextLine();
			
			// Elecciones para la modificacion de los datos del Libro
			switch (eleccion) 
			{
				case 1 -> {System.out.print("Nuevo Titulo: ");
					      String titulo = cpc.nextLine();
					      arrayLibros[posicion].setTitulo(titulo);
					      System.out.println();
					      System.out.println("Titulo del libro cambiado correctamente.");}
				
				case 2 -> {System.out.print("Nuevo Autor: ");
			      		   String autor = cpc.nextLine();
			      		   arrayLibros[posicion].setAutor(autor);
			      		   System.out.println();
					       System.out.println("Autor del libro cambiado correctamente.");}

				default -> {System.out.println("Opción Inválida.");} 
			}
		}
	}
	
	public static void prestarLibro()
	{
		System.out.println("== Prestar Libro ==");
		System.out.print("Codigo de la persona que realizara el prestamo: ");
		int codigoPersona = cpc.nextInt();
		Persona personaPrestamo = null;

		for (Persona persona : arrayPersonas) 
		{
		    if (persona.getCodigoPersona() == codigoPersona) 
		    {
		    	personaPrestamo = persona;
		    	break;
		    }
		}

		if (personaPrestamo != null) 
		{
			System.out.print("Codigo del libro a prestar: ");
			int codigoLibro = cpc.nextInt();
			Libro libroPrestamo = null;

		    for (Libro libro : arrayLibros) 
		    {
		    	if (libro.getCodigo() == codigoLibro) 
		    	{
		                libroPrestamo = libro;
		                break;
		        }
		    }

		    if (libroPrestamo != null) 
		    {
		    	libroPrestamo.prestamoLibro(personaPrestamo);
		    	System.out.println();
		    	System.out.println("Prestamo completado correctamente.");
		    } 
		    
			    else 
			    {
			    	System.out.println("El libro no se encontró en la biblioteca");
			    }
		    } 
		
		else 
		{
			System.out.println("La persona no se encontró en la biblioteca");
		}
	}
	
	public static void devolverLibro()
	{
		System.out.println("== Devolver Libro ==");
		System.out.print("Codigo del libro a devolver: ");
		int codigoLibro = cpc.nextInt();
		Libro libroDevuelto = null;

		for (Libro libro : arrayLibros) 
		{
		    if (libro.getCodigo() == codigoLibro) 
		    {
		        libroDevuelto = libro;
		        break;
		    }
		}

		  if (libroDevuelto != null) 
		  {
		      libroDevuelto.devolucionLibro(getPrestamoPersona());
		      System.out.println();
		      System.out.println("Devolucion completada correctamente.");
		  } 
		    
			  else 
			  {
			      System.out.println("El libro no se encontró en la biblioteca");
			  }
		}
	
	public static void comparador()
	{
		System.out.println("Codigo de los libros a comparar");
		System.out.println("===========================");
		System.out.print("Libro 1 -> ");
		int codigo1 = cpc.nextInt();
		
		System.out.print("Libro 2 -> ");
		int codigo2 = cpc.nextInt();
		
		// Creamos objetos de tipo libro para poder hacer la comparacion, nulos para poder asignarles los datos luego
		Libro libro1 = null;
        Libro libro2 = null;
        
        // Recorre el array de libros
		for (Libro libro : arrayLibros) 
		{
			// Si no hay objetos de tipo libro nulos y si el codigo introducido coincide con el del libro
			// se le asignan los datos del libro seleccionado a libro1
            if (libro != null && libro.getCodigo() == codigo1) 
            {
                libro1 = libro;
            } 
            	// Lo mismo con el otro libro
	            else if (libro != null && libro.getCodigo() == codigo2) 
	            {
	                libro2 = libro;
	            }
        }

        // Verificar si los libros existen y compararlos por título y autor
		if (libro1 != null && libro2 != null) 
        {
            boolean iguales = libro1.equals(libro2);
            
            // Si el resultado que devuelva el equals y se asigne a la variable es true, los libros son iguales
            if (iguales) 
            {
            	System.out.println();
                System.out.println("Los libros son iguales.");
            } 
            	// Si el equals devuelve false, son diferentes
	            else 
	            {
	            	System.out.println();
	                System.out.println("Los libros son diferentes.");
	            }
        } 
        	// Si los codigos introducidos no coinciden con ningun objeto en el array
	        else 
	        {
	        	System.out.println();
	            System.out.println("No se encontraron los libros.");
	        }
    }
	
	/* MÉTODOS PERSONA */
	/*=================*/
	public static void listadoPersona()
	{
		if (arrayPersonas.length == 0)
		{
			System.out.println("No hay Personas registradas que mostrar.");
		}
		
			else 
			{
				System.out.println();
				System.out.println("Personas");
				System.out.println("=========");
				for (int i = 0; i < arrayPersonas.length; i++)
				{
					System.out.println(arrayPersonas[i]);
				}
			}
	}
	
	public static void nuevaPersona()
	{
		if (arrayPersonas.length < 4) // Limite hardcodeado, se puede poner el limite que quieras
		{
			cpc.nextLine(); // Para limpiar el buffer del escaner 
			
		    System.out.print("Nombre: ");
		    String nombre = cpc.nextLine();

		    // Creamos un nuevo objeto de tipo Libro
	    	Persona persona = new Persona(nombre);
	  
	    	// Creamos una copia del Array de Libros, con longitud +1
		    Persona[] anadirPersonas = Arrays.copyOf(arrayPersonas, arrayPersonas.length + 1);
		    
		    // El objeto creado se añade a nuestro nuevo array
		    anadirPersonas[anadirPersonas.length - 1] = persona;
		    
		    // Y ahora asignamos el nuevo array al array de Libros
		    arrayPersonas = anadirPersonas;
	    	
	    	System.out.println();
	    	System.out.println("Nueva Persona registrada.");
		}
		
			else 
		    {
		    	System.out.println("No se pueden agregar mas Personas, espacio lleno.");
		    }
	}

	public static void modificarPersona()
	{
		// Si no hay libros registrados
		if (arrayPersonas.length == 0) {System.out.println("No hay Personas registradas para modificar."); return;}
				
		// Codigo de libro valido o no
		boolean correcto = false; 
				
		// Posicion en el array del codigo escrito
		int posicion = 0; 
				
		System.out.print("Codigo de la Persona a Modificar -> ");
		int codigoMod = cpc.nextInt();
				
		// Recorremos el array
		for (short i = 0; i < arrayPersonas.length ; i++)
		{
			// 
			if (arrayPersonas[i].getCodigoPersona() == codigoMod)
			{
				//
				correcto = true;
						
				// 
				posicion = i;
			}
		}
				
			// Si el codigo introducido es valido
			if (correcto = true)
			{
				System.out.println();
				System.out.println("Que quieres modificar de la Persona con Codigo de Persona: " + codigoMod);
				System.out.println();
				System.out.println("1. Nombre.");
				System.out.println();
				System.out.print("Opcion -> ");
				int eleccion = cpc.nextInt();
				cpc.nextLine();
				
				switch (eleccion)
				{
					case 1 ->{System.out.print("Nuevo Nombre -> ");
							  String nombre = cpc.nextLine();
							  arrayPersonas[posicion].setNombre(nombre);
							  System.out.println();
							  System.out.println("Nombre de la Persona cambiada correctamente.");}
			
					default -> System.out.println("Opcion incorrecta");
				}
			}
		}	

	// Salir del menú la biblioteca
	public static void salirDelMenu()
	{
		System.out.println("Hasta la proxima.");
	}

}