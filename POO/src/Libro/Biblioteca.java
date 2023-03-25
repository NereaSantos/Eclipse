package Libro;

import java.util.*;

public class Biblioteca {

	static Scanner src = new Scanner(System.in);
	
	public static void main(String[] args) {

		Persona paco = new Persona("Paco", "p1");
		Persona pepe = new Persona("Pepe", "p2");
		Persona maria = new Persona("Maria", "p3");

		Persona ListaPersonas[] = new Persona[3];
		
		ListaPersonas[0] = paco;
		ListaPersonas[1] = pepe;
		ListaPersonas[2] = maria;
		
		Libro ListaLibros[] = new Libro[5];
	
	int respuesta = 0;
	String respuesta2;
	
	
	do{
		
		System.out.println("0. Salir" + "\n 1. Listado de libros en la biblioteca " + "\n 2. Nuevo Libro " + "\n 3. Modificar Libro " + "\n 4. Prestar Lbro " + "\n 5. Devolver libro " + "\n 6. Comparar 2 libros " + "\n 7. Borrar libro");
		
			respuesta = src.nextInt();
		
			if(respuesta == 1) {
				
				MostrarLista(ListaLibros);
					
					}
			
			else if(respuesta == 2) {
			
				NuevoLibro(ListaLibros);
					
			}
			
			else if(respuesta == 3) {
				
				if(ArrayVacio(ListaLibros) == true) {
					
					System.out.println("La lista esta vacia");
					
					
				}else if(ArrayVacio(ListaLibros) ==false) {
				
				ModificarLibro(ListaLibros);
				
				
			}
			}
			else if(respuesta == 4) {
				
				String codigoP;
				int codigo, posicion, contador;
				boolean operacion;
				
				if(ArrayVacio(ListaLibros) == true) {
					
					System.out.println("La lista esta vacia");
					
					
				}
				else {
					
					MostrarLista(ListaLibros);
					
					MostrarPersonas(ListaPersonas);
					
				System.out.println("Escriba el codigo de la persona que realizara el prestamo (p1, p2, p3)");
				
					codigoP = src.next();
					
				System.out.println("Escribe el codigo del libro que se desea prestar");
				
					codigo = src.nextInt();
					
					PrestarLibro(ListaLibros, codigo, ListaPersonas, codigoP);
					
				
				}
			}
	
			
			else if(respuesta == 5) {
				
				String codigoP;
				int codigo;
				
				if(ArrayVacio(ListaLibros) == true) {
									
									System.out.println("La lista esta vacia");
									
									
				}else if(ArrayVacio(ListaLibros) ==false) {
				
					MostrarLista(ListaLibros);
					MostrarPersonas(ListaPersonas);
					
				System.out.println("Escriba el codigo de la persona que realizara la devolucion");
				
					codigoP = src.next();
					
				System.out.println("Escribe el codigo del libro que se desea devolver");
				
					codigo = src.nextInt();
						
					DevolverLibro(ListaLibros, codigo, ListaPersonas, codigoP);
						
						
					}
				
				}
	
			else if(respuesta == 6) {
			
			int codigo1, codigo2, posicion1, posicion2;
			boolean igual = false;
			
			if(ArrayVacio(ListaLibros) == true) {
				
				System.out.println("La lista esta vacia");
				
			}
			else if(ArrayVacio(ListaLibros) ==false) {
			
				MostrarLista(ListaLibros);
				
			System.out.println("Escriba el codigo del primer libro a comparar");
			
				codigo1 = src.nextInt();
				
			System.out.println("Escriba el codigo del segundo libro a comparar");
			
				codigo2 = src.nextInt();
			
			if(Comprobar(ListaLibros, codigo1) == Comprobar(ListaLibros, codigo2)) {
				
				posicion1 = GetPosicion(ListaLibros, codigo1);
				
				posicion2 = GetPosicion(ListaLibros, codigo2);
				
				igual = ListaLibros[posicion1].compara(ListaLibros[posicion2]);
				
				System.out.println("Los libros son iguales (true: Si false: No.) --> " +  igual);
				
			}
				
		}
			
	}
		
			else if(respuesta == 7) {
			
			int codigo, posicion = 0;
			Libro ListaLibros2 [] = new Libro[ListaLibros.length-1];
			
			if(ArrayVacio(ListaLibros) == true) {
				
				System.out.println("La lista esta vacia");
				
			}
			else if(ArrayVacio(ListaLibros) ==false) {
			
				MostrarLista(ListaLibros);
				
			System.out.println("Escriba el codigo del libro que desea borrar");
			
				codigo = src.nextInt();
						
				BorrarLibro(ListaLibros, codigo);	
				
		}
	}
		
			else if(respuesta == 0) {
			
			System.out.println("Ha salido del programa");
			
		}

		while (respuesta < 0 || respuesta > 7) {
			
			System.out.println("introduzca una respuesta valida (1, 2, 3, 4, 5, 6, 7)");
			
				System.out.println("\n" + " 0. Salir" + "\n 1. Listado de libros en la biblioteca " + "\n 2. Nuevo Libro " + "\n 3. Modificar Libro " + "\n 4. Prestar Lbro " + "\n 5. Devolver libro " + "\n 6. Comparar 2 libros " + "\n 7. Borrar libro");
				
				 respuesta = src.nextInt();
			
		}
		
	
	}while(respuesta > 0 && respuesta <= 7);
}
	
	

	

	public static void NuevoLibro(Libro ListaLibros[]){ 
		
		boolean agregado = false;
		String titulo, autor;
			
			System.out.println("Escriba el titulo del libro que quiere añadir");
			
				titulo = src.next();
				
			System.out.println("Escriba el autor del libro que quiere añadir");

				autor = src.next();
				
			System.out.println("Escriba el codigo del libro que quiere añadir");

				int codigo = src.nextInt();
			
			for(int i = 0; i < ListaLibros.length; i++) {
				
				if(ListaLibros[i] == null && Comprobar(ListaLibros, codigo) != 1) {
					
					ListaLibros[i] = new Libro(titulo, autor, codigo);
					
					agregado = true;
					
					break;
					
				}
				
			}
			
			if(!agregado) {
				
				System.out.println("No se ha podido agregar el libro a la biblioteca");
				
			}
			
}
	
	public static void ModificarLibro(Libro ListaLibros[]) {
		
		Scanner src = new Scanner(System.in);
		
		int respuesta = 0, posicion = 0, codigo = 0, contador;
		String nuevoTitulo, nuevoAutor;
		
		while(ArrayVacio(ListaLibros) == true) {
			
			System.out.println("0. Salir" + "\n 1. Listado de libros en la biblioteca " + "\n 2. Nuevo Libro " + "\n 3. Modificar Libro " + "\n 4. Prestar Lbro " + "\n 5. Devolver libro " + "\n 6. Comparar 2 libros " + "\n 7. Borrar libro");
			
			respuesta = src.nextInt();
			
		}
		
			MostrarLista(ListaLibros);
		
		System.out.println("Escriba el codigo del libro que desea Modificar");
		
			codigo = src.nextInt();
		
			posicion = GetPosicion(ListaLibros, codigo);
			
		System.out.println("Escriba su preferencia de modificacion (1. Titulo 2. Autor)");
		
			respuesta = src.nextInt();
			
			if(respuesta == 1) {
				
				System.out.println("Escriba el titulo nuevo");
		
					nuevoTitulo = src.next();
					
					ListaLibros[posicion].setTitulo(nuevoTitulo);
	
			}else if(respuesta == 2) {
				
				System.out.println("Escriba el autor nuevo");
				
					nuevoAutor = src.next();
				
					ListaLibros[posicion].setAutor(nuevoAutor);
					
			}else {
				
				System.out.println("Escriba un aopcion valida");
				
			}
	
}
	
	public static int Comprobar(Libro ListaLibros[], int cont) {
		
		int contador = 0;
		
		for(int i = 0; i< ListaLibros.length && ListaLibros[i] != null; i++) {
			
			if(cont == ListaLibros[i].getCodigo()) {
				
				contador = 1;	
			
			break;
			
			}
		}
		
		return contador;
	}

	public static int GetPosicion(Libro ListaLibros[], int cod) {
		
		int posicion = 0;
		
		for(int i = 0; i < ListaLibros.length && ListaLibros[i] != null; i++) {
			
			if(cod == ListaLibros[i].getCodigo()) {
				
				 posicion = i;
				
			}
			
		}
		
		return posicion;
		
	}
	
	public static void BorrarLibro(Libro ListaLibros[], int codigo) {
		
		boolean ArrayVacio = true;
		
		for(int i = 0; i< ListaLibros.length; i++) {
			
			if(ListaLibros[i] != null) {
				
				ArrayVacio = false;
				
				break;
				
			}
			
		}
		
		if(!ArrayVacio) {
			
			for(int i = 0; i< ListaLibros.length; i++) {
				
				if(ListaLibros[i] != null && ListaLibros[i].getCodigo() == codigo) {
					
					ListaLibros[i] = null;
					
					
					break;
				}
				
			}
			
			System.out.println("Operacion realizada con exito");
			
		}else {
			
			System.out.println("No se puede borrar ningun libro porque no se ha añadido ninguno");
			
		}
		
	}
	
	public static boolean ConfirmarPersona(Persona ListaP[], Persona p, String codigoPersona, int codigoLibro, Libro[] ListaLibros) {
		
			for(Persona persona : ListaP) {
				
				if(persona.getCodigo().equals(codigoPersona)) {
					
					for(Libro libro : ListaLibros) {
						
						if(libro.getCodigo() == codigoLibro) {
							
							return true;
							
						}
						
					}
					
				}
				
			}
			
			return false;
			
		}
	
	public static boolean PrestarLibro(Libro ListaLibros[], int codigo, Persona ListaP[], String codigoPersona) {
		
		boolean confirmacion = false;
		
		Persona persona = null;
		Libro libro = null;
		
		for(int i = 0; i < ListaP.length; i++) {
			
			if(ListaP[i].getCodigo().equals(codigoPersona)) {
				
				persona = ListaP[i];
				
				break;
				
			}
			
		}
		
		for(int i = 0; i < ListaLibros.length; i++) {
			
			if(ListaLibros[i] != null && ListaLibros[i].getCodigo() == codigo) {
				
				libro = ListaLibros[i];
				
				break;
				
			}
			
		}
		
		if(persona != null && libro != null) {
			
			confirmacion = libro.prestamo(persona);
			
		}else {
			
			System.out.println("Escriba un codigo de persona y/o libro valido");
			
		}
		
		return confirmacion;
		
	}
	
	public static boolean DevolverLibro(Libro ListaLibros[], int codigo, Persona ListaP[], String codigoPersona) {
		
		boolean confirmacion = false;
		
		Persona persona = null;
		Libro libro = null;
		
		for(int i = 0; i < ListaP.length; i++) {
			
			if( ListaLibros[i] != null && ListaP[i].getCodigo().equals(codigoPersona)) {
				
				persona = ListaP[i];
				
				break;
				
			}
			
		}
		
		for(int i = 0; i < ListaLibros.length; i++) {
			
			if(ListaLibros[i].getCodigo() == codigo) {
				
				libro = ListaLibros[i];
				
				break;
				
			}
			
		}
		
		if(persona != null && libro != null) {
			
			confirmacion = libro.devolucion(persona);
			
		}else {
			
			System.out.println("Escriba un codigo de libro y/o persona valido");
			
		}
		
		return confirmacion;
		
	}

	public static boolean ArrayVacio(Libro ListaLibros[]) {
		
		boolean arrayVacio = false;
		
		for(int i = 0; i < ListaLibros.length; i++) {
			
			if(ListaLibros[i] == null && ListaLibros[0] == null) {
				
				arrayVacio = true;
					
				}
				
			}
		
		return arrayVacio;
	}

	public static void MostrarLista(Libro ListaLibros[]) {
		
		System.out.println("Lista de Libros");
		
		for(int i = 0; i < ListaLibros.length; i++) {
		
			if(ListaLibros[i] == null) {
				
				System.out.println("  ");
				
			}else {
			
			System.out.println(ListaLibros[i]);
		
			}
		}
	
	}

	public static void  MostrarPersonas(Persona ListaPersonas[]) {
		
	System.out.println("Lista de Personas");
			
			for(int i = 0; i < ListaPersonas.length; i++) {
			
				if(ListaPersonas[i] == null) {
					
					System.out.println("  ");
					
				}else {
				
				System.out.println(ListaPersonas[i]);
		
			}
				
		}
			
	}

}