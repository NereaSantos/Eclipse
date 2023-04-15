package PracticaEvaluableFICHEROS;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class main {
	
	 private static ArrayList<Socio> socios = new ArrayList<Socio>();
	
	public static void main(String[] args) {
		
		 leerArchivo();
		 
		    Socio.setUltimoNumeroSocio(Socio.getUltimoNumeroSocio() + 1);
		
		Scanner scanner = new Scanner(System.in);

	    int opcion = 0;
	    do {
	        System.out.println("Elija una opción: ");
	        System.out.println("1. Añadir nuevo cliente");
	        System.out.println("2. Modificar datos");
	        System.out.println("3. Dar de baja cliente");
	        System.out.println("4. Listar los clientes");
	        System.out.println("5. Comparar clientes");
	        System.out.println("6. Buscar Socio");
	        System.out.println("7. Agregar Familiar");
	        System.out.println("8. Guardar Socios");
	        System.out.println("0. Salir");

	        opcion = scanner.nextInt();
	      

	        switch (opcion) {
	            case 1:
	                Socio nuevoSocio = crearSocio();
	                socios.add(nuevoSocio);
	                System.out.println("Socio añadido correctamente: ");
	                System.out.println(nuevoSocio);
	                break;
	            case 2:
	                modificarSocio();
	                break;
	            case 3:
	                darDeBajaSocio();
	                break;
	            case 4:
	                listarSocios();
	                break;
	            case 5:
	                compararSocios();
	                break;
	            case 6:
	                System.out.print("Introduzca el número de socio que desea buscar: ");
	                int numero = scanner.nextInt();
	               
	                Socio socioEncontrado = buscarPorNumero(numero);
	                if (socioEncontrado != null) {
	                    System.out.println(socioEncontrado);
	                } else {
	                    System.out.println("No se ha encontrado ningún socio con el número " + numero);
	                }
	                break;
	            case 7:
	            	agregarFamiliares(socios);
	            case 8:
	            	guardarSocios();
	            case 0:
	                System.out.println("Saliendo del programa...");
	                break;
	            default:
	                System.out.println("Opción no válida, por favor intente de nuevo.");
	                break;
	        }

	    } while (opcion != 0);
	}

	public static void agregarFamiliares(ArrayList<Socio> socios) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Ingrese el número de socio: ");
	    int numeroSocio = sc.nextInt();
	    
	    // Buscar el socio correspondiente en el ArrayList
	    Socio socio = null;
	    for (Socio s : socios) {
	        if (s.getNumeroSocio() == numeroSocio) {
	            socio = s;
	            break;
	        }
	    }

	    // Si no se encuentra el socio, mostrar un mensaje y salir del método
	    if (socio == null) {
	        System.out.println("Socio no encontrado");
	        return;
	    }

	    // Pedir los atributos del familiar
	    System.out.print("Ingrese el DNI del familiar: ");
	    String dni = sc.next();

	    /* Validar el formato del DNI utilizando una expresión regular
	     * que significa "8 dígitos seguidos de una letra (mayúscula o minúscula)" */
	    
	    if (!dni.matches("\\d{8}[A-Za-z]")) {
	        System.out.println("Formato de DNI incorrecto");
	        return;
	    }
	    System.out.print("Ingrese el nombre del familiar: ");
	    String nombre = sc.next();
	    System.out.print("Ingrese la fecha de nacimiento del familiar (dd/mm/yyyy): ");
	    String fechaNacimientoStr = sc.next();
	    
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    Date fechaNacimiento = null;
	    try {
	        fechaNacimiento = sdf.parse(fechaNacimientoStr);
	        
	        // Validar la fecha utilizando la clase Calendar
	        Calendar cal = Calendar.getInstance();
	        cal.setTime(fechaNacimiento);
	        int anio = cal.get(Calendar.YEAR);
	        int mes = cal.get(Calendar.MONTH) + 1; 
	        int dia = cal.get(Calendar.DAY_OF_MONTH);
	        int añoActual = Calendar.getInstance().get(Calendar.YEAR);
	       
	        if (anio < 1900 || anio > añoActual || mes < 1 || mes > 12 || dia < 1 || dia > 31) {

	            throw new ParseException("Fecha no válida", 0);
	        
	        }
	        
	    } catch (ParseException e) {
	        System.out.println("Formato de fecha incorrecto o fecha inválida");
	        return;
	    }
	    
	    Familiar familiar = new Familiar(dni, nombre, fechaNacimiento);

	    // Agregar el objeto Familiar al ArrayList de familiares del socio
	    socio.agregarFamiliar(familiar);

	    System.out.println("Familiar agregado exitosamente");
	}



		private static Socio crearSocio() {
		    Socio nuevoSocio = new Socio("", null, "", "");
		    nuevoSocio.leerDatos();
		    return nuevoSocio;
		}
		
		public static Socio buscarPorNumero(int numero) {
		    for (Socio socio : socios) {
		        if (socio.getNumeroSocio() == numero) {
		            return socio;
		        }
		    }
		    return null;
		}

		public static void modificarSocio() {
		    Scanner scanner = new Scanner(System.in);
		    System.out.print("Introduzca el número de socio que desea modificar: ");
		    int numeroSocio = scanner.nextInt();
		

		    Socio socio = buscarPorNumero(numeroSocio);
		    if (socio == null) {
		        System.out.println("No se encontró ningún socio con el número " + numeroSocio);
		        return;
		    }

		    System.out.println("Datos actuales del socio:");
		    System.out.println(socio);

		    System.out.println("Introduzca los nuevos datos del socio:");
		    socio.leerDatos();

		    System.out.println("Los datos del socio han sido modificados exitosamente:");
		    System.out.println(socio);
		}

		public static void darDeBajaSocio() {
		    Scanner scanner = new Scanner(System.in);
		    System.out.print("Introduzca el número de socio que desea dar de baja: ");
		    int numeroSocio = scanner.nextInt();
		    

		    Socio socio = buscarPorNumero(numeroSocio);
		    if (socio == null) {
		        System.out.println("No se encontró ningún socio con el número " + numeroSocio);
		        return;
		    }

		    socios.remove(socio);
		    System.out.println("El socio ha sido dado de baja exitosamente.");
		}
		
		public static void compararSocios() {
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("Introduzca el número del primer socio a comparar: ");
		    int numSocio1 = scanner.nextInt();
		    Socio socio1 = buscarPorNumero(numSocio1);
		    if (socio1 == null) {
		        System.out.println("No se ha encontrado un socio con ese número.");
		        return;
		    }
		   
		    System.out.println("Introduzca el número del segundo socio a comparar: ");
		    int numSocio2 = scanner.nextInt();
		    Socio socio2 = buscarPorNumero(numSocio2);
		    if (socio2 == null) {
		        System.out.println("No se ha encontrado un socio con ese número.");
		        return;
		    }

		    int comparacionNombre = socio1.getNombre().compareTo(socio2.getNombre());
		    int comparacionFechaNacimiento = socio1.getFechaNacimiento().compareTo(socio2.getFechaNacimiento());
		    int comparacionEmail = socio1.getEmail().compareTo(socio2.getEmail());
		    int comparacionTelefono = socio1.getTelefono().compareTo(socio2.getTelefono());

		    if (comparacionNombre < 0) {
		        System.out.println("El socio " + socio1.getNombre() + " tiene un nombre diferente al socio " + socio2.getNombre() + ".");
		    } else if (comparacionNombre > 0) {
		        System.out.println("El socio " + socio2.getNombre() + " tiene un nombre diferente al socio " + socio1.getNombre() + ".");
		    } else if (comparacionFechaNacimiento < 0) {
		        System.out.println("El socio " + socio1.getNombre() + " tiene una fecha de nacimiento diferente al socio " + socio2.getNombre() + ".");
		    } else if (comparacionFechaNacimiento > 0) {
		        System.out.println("El socio " + socio2.getNombre() + " tiene una fecha de nacimiento diferente al socio " + socio1.getNombre() + ".");
		    } else if (comparacionEmail < 0) {
		        System.out.println("El socio " + socio1.getNombre() + " tiene un email diferente al socio " + socio2.getNombre() + ".");
		    } else if (comparacionEmail > 0) {
		        System.out.println("El socio " + socio2.getNombre() + " tiene un email diferente al socio " + socio1.getNombre() + ".");
		    } else if (comparacionTelefono < 0) {
		        System.out.println("El socio " + socio1.getNombre() + " tiene un teléfono diferente al socio " + socio2.getNombre() + ".");
		    } else if (comparacionTelefono > 0) {
		        System.out.println("El socio " + socio2.getNombre() + " tiene un teléfono diferente al socio " + socio1.getNombre() + ".");
		    } else {
		        System.out.println("Ambos socios tienen los mismos datos.");
		    }
		}

		
		public static void ordenarSociosPorFechaAlta() {
		    Collections.sort(socios, new Comparator<Socio>() {
		        @Override
		        public int compare(Socio s1, Socio s2) {
		            return s1.getFechaAlta().compareTo(s2.getFechaAlta());
		        }
		    });
		}
		
		public static void listarSocios() {
		    System.out.println("Lista de socios:");
		    Socio.ordenarSociosPorFechaAlta();
		    for (Socio s : socios) {
		        System.out.println(s);
		    }
		}
		
		public static void leerArchivo() {
		    // Leer el archivo binario
		    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Socios.bin"))) {
		        Object obj = ois.readObject();
		        if (obj != null) {
		            // El archivo binario no está vacío, obtener los socios y el contador
		            ArrayList<Socio> listaSocios = (ArrayList<Socio>) obj;
		            Socio ultimoSocio = listaSocios.get(listaSocios.size() - 1);
		            Socio.setUltimoNumeroSocio(ultimoSocio.getUltimoNumeroSocio());
		            socios.addAll(listaSocios);
		        }
		    } catch (IOException | ClassNotFoundException e) {
		       System.out.println("Algo salió mal");
		    }
		}

		public static void guardarSocios() {
		    try {
		        if (socios.isEmpty()) {
		            System.out.println("La lista de socios está vacía.");
		        }

		        FileOutputStream fileOut = new FileOutputStream("Socios.bin");
		        ObjectOutputStream out = new ObjectOutputStream(fileOut);

		        out.writeObject(socios);
		        out.writeObject(Socio.getUltimoNumeroSocio());

		        out.close();
		        fileOut.close();

		        System.out.println("Los socios se han guardado correctamente en el archivo.");
		    } catch (IOException ex) {
		        System.out.println("Algo salió mal al guardar los socios");
		    }		    
		    
		}

}
