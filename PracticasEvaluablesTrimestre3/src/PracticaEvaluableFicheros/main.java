package PracticaEvaluableFicheros;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class main {
	
	static Socio[] socios = new Socio[3];
	public static Familiar[] familiares = new Familiar[50];

	static int numFamilias = 0;
	static int numSocios = 1;

	/*Club de 3 socios /
	 * email acabado en @gmail.com /
	 * Ordenar los socios por telefono sin tocar el main*/
	public static void main(String[] args) {
		
		    Socio socio = new Socio();
		
		Scanner scanner = new Scanner(System.in);

	    int opcion = 0;
	    do {
	        System.out.println("Elija una opción: ");
	        System.out.println("1. Añadir nuevo socio");
	        System.out.println("2. Modificar datos");
	        System.out.println("3. Dar de baja socio");
	        System.out.println("4. Listar los socio");
	        System.out.println("5. Listar los socio con Familiares Por fecha de nacimiento");
	        System.out.println("6. Agregar Familiar");
	        System.out.println("7. Guardar socios");
	        System.out.println("0. Salir");

	        opcion = scanner.nextInt();
	      

	        switch (opcion) {
	            case 1:
	                Socio nuevoSocio = crearSocio();
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
	            	listarSocioConFamiliaresPorFechaNacimiento();
	            	break;
	            case 6:
	            	agregarFamiliares(socios);
	            	 break;
	            case 7:
	            	guardarSocios();
	            	 break;
	            case 0:
	                System.out.println("Saliendo del programa...");
	                break;
	            default:
	                System.out.println("Opción no válida, por favor intente de nuevo.");
	                break;
	        }

	    } while (opcion != 0);
	}

	public static void agregarFamiliares(Socio[] socios2) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Ingrese el número de socio: ");
	    int numeroSocio = sc.nextInt();
	    
	    // Buscar el socio correspondiente en el arreglo de objetos Socio
	    Socio socio = null;
	    for (Socio s : socios2) {
	        if (s != null && s.getNumeroSocio() == numeroSocio) {
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
	    socio.añadirFamiliar(familiar);

	    System.out.println("Familiar agregado exitosamente");
	}

	public static Socio crearSocio() {
	    Socio nuevoSocio = new Socio();
	    nuevoSocio.leerDatos();
	    nuevoSocio.setFechaAlta(LocalDate.now()); 
	    nuevoSocio.setNumeroSocio(numSocios);
	    socios = Arrays.copyOf(socios, socios.length+1);
	    socios[socios.length-1] = nuevoSocio;
	    numSocios++;
	    
	    return nuevoSocio;
	}
		
	public static Socio buscarSocio(int numSocio) {
	    for (Socio socio : socios) {
	        if (socio != null && socio.getNumeroSocio() == numSocio) {
	            return socio;
	        }
	    }
	    return null;
	}

		public static void modificarSocio() {
		    Scanner scanner = new Scanner(System.in);
		    System.out.print("Introduzca el número de socio que desea modificar: ");
		    int numeroSocio = scanner.nextInt();
		

		    Socio socio = buscarSocio(numeroSocio);
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
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Introduzca el número de socio a dar de baja: ");
		    int numSocio = sc.nextInt();
		    boolean encontrado = false;
		    for (int i = 0; i < socios.length; i++) {
		        if (socios[i] != null && socios[i].getNumeroSocio() == numSocio) {
		            encontrado = true;
		            System.out.println("Socio encontrado:");
		            System.out.println(socios[i]);
		            System.out.print("¿Está seguro de que desea dar de baja a este socio? (s/n): ");
		            String confirmacion = sc.next();
		            if (confirmacion.equals("s")) {
		                // Eliminar el objeto Socio del array
		                socios[i] = null;
		                System.out.println("Socio dado de baja correctamente.");
		            } else {
		                System.out.println("Operación cancelada.");
		            }
		            break; // Salir del bucle for
		        }
		    }
		    if (!encontrado) {
		        System.out.println("No se encontró ningún socio con ese número.");
		    }
		}
		
		public static void ordenarSociosPorFechaAlta() {
		    Arrays.sort(socios, new Comparator<Socio>() {
		        @Override
		        public int compare(Socio s1, Socio s2) {
		            return s1.getFechaAlta().compareTo(s2.getFechaAlta());
		        }
		    });
		}
		
		public static void listarSocios() {
		    Scanner scanner = new Scanner(System.in);

		    System.out.println("Seleccione una opción de ordenamiento:");
		    System.out.println("1. Ordenar por nombre");
		    System.out.println("2. Ordenar por antigüedad");
		    System.out.println("3. Ordenar por numero de telefono");
		    int ordenamiento = scanner.nextInt();

		    if (ordenamiento < 1 || ordenamiento > 3) {
		        System.out.println("Opción no válida");
		        return;
		    }
		    
		    Comparator<Socio> comparador = null;
		    if (ordenamiento == 1) {
		        comparador = new Comparator<Socio>() {
		            public int compare(Socio s1, Socio s2) {
		                if (s1 == null || s2 == null) {
		                    return 0;
		                }
		               
		                return s1.getNombre().compareTo(s2.getNombre());
		               
		            }
		        };
		    } else if (ordenamiento == 2) {
		    	comparador = new Comparator<Socio>() {
		    	    public int compare(Socio s1, Socio s2) {
		    	        if (s1 == null || s2 == null) {
		    	            return 0;
		    	        }
		    	        return s1.getFechaAlta().compareTo(s2.getFechaAlta());
		    	    }
		    	};
		    } else if(ordenamiento == 3){	
		    	comparador = new Comparator<Socio>() {
		    	    public int compare(Socio s1, Socio s2) {
		    	        if (s1 == null || s2 == null) {
		    	            return 0;
		    	        }
		    	        return s1.compareTo(s2);
		    	    }
		    	};
		    }else {
		        System.out.println("Opción no válida");
		        return;
		    }

		    Arrays.sort(socios, comparador);
		    for (Socio socio : socios) {
		        if (socio != null) {
		            System.out.println(socio);
		            if (socio.getFamiliares() == null || socio.getFamiliares().length == 0) {
		                System.out.println("Este socio no tiene familiares.");
		            } else {
		                // Imprimir información de los familiares
		                System.out.println("Familiares:");
		                for (Familiar familiar : socio.getFamiliares()) {
		                    if (familiar != null) {
		                        System.out.println(familiar);
		                    }
		                }
		            }
		         }
		    }
		}

		public static void listarSocioConFamiliaresPorFechaNacimiento() {
		    listarSocios();

		    // Ordenamos la lista de socios por fecha de alta
		    Arrays.sort(socios, new Comparator<Socio>() {
		        @Override
		        public int compare(Socio s1, Socio s2) {
		            if (s1 == null || s2 == null) {
		                return 0;
		            }
		            return s1.getFechaAlta().compareTo(s2.getFechaAlta());
		        }
		    });

		    // Iteramos sobre la lista de socios y listamos sus familiares ordenados por fecha de nacimiento
		    for (Socio socio : socios) {
		        if (socio != null) { // Añadimos una comprobación para evitar que se intente acceder a los datos de un socio nulo
		            System.out.println("Socio:");
		            System.out.println("\tNombre: " + socio.getNombre());
		            System.out.println("\tFecha de alta: " + socio.getFechaAlta());

		            Familiar[] familiares = socio.getFamiliares();
		            // Inicializamos la lista de familiares si no hay ninguno
		            if (familiares == null) {
		                familiares = new Familiar[50];
		            }

		            // Ordenamos la lista de familiares por fecha de nacimiento
		            Arrays.sort(familiares, new Comparator<Familiar>() {
		                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		                @Override
		                public int compare(Familiar f1, Familiar f2) {
		                    LocalDate date1 = f1.getFechaNacimiento();
		                    LocalDate date2 = f2.getFechaNacimiento();
		                    return date1.compareTo(date2);
		                }
		            });

		            // Listamos los datos de los familiares ordenados por fecha de nacimiento
		            System.out.println("Familiares:");
		            for (Familiar familiar : familiares) {
		                if (familiar != null) { // Añadimos una comprobación para evitar que se intente acceder a los datos de un familiar nulo
		                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		                    LocalDate fechaNac = familiar.getFechaNacimiento();
		                    System.out.println("\tNombre: " + familiar.getNombre());
		                    System.out.println("\tFecha de nacimiento: " + fechaNac.format(formatter));
		                }
		            }
		        }
		    }
		}


		public static void guardarSocios() {
		    try {

		        FileOutputStream fileOut = new FileOutputStream("Socios.bin");
		        ObjectOutputStream out = new ObjectOutputStream(fileOut);

		        out.writeObject(socios);

		        out.close();
		        fileOut.close();

		        System.out.println("Los socios se han guardado correctamente en el archivo.");
		    } catch (IOException ex) {
		        System.out.println("Algo salió mal al guardar los socios");
		    }		    
		    
		}

}