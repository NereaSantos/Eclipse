package PracticaEvaluableFICHEROS;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class Socio implements Serializable {

	private static ArrayList<Socio> socios = new ArrayList<>();
	
    private static int nextNumeroSocio = 1;
    
    private int numeroSocio;
    private String nombre;
    private Date fechaNacimiento;
    private Date fechaAlta;
    private String telefono;
    private String email;
    private ArrayList<Familiar> familiares;

    public Socio(String nombre, Date fechaNacimiento, String telefono, String email) {
        this.numeroSocio = nextNumeroSocio++;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaAlta = new Date();
        this.telefono = telefono;
        this.email = email;
        this.familiares = new ArrayList<>();
    }

    public Socio(String nombre, Date fechaNacimiento) {
        this(nombre, fechaNacimiento, "", "");
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaAlta() {
        return new SimpleDateFormat("dd-MM-yyyy").format(fechaAlta);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void agregarFamiliar(Familiar familiar) {
        familiares.add(familiar);
    }

    public List<Familiar> getFamiliares() {
        return familiares;
    }

    @Override
    public String toString() {
    	/*str se utiliza ora concatenar los diferentes String ademas del 
    	 * toString de Familiares */
        String str = "Número de socio: " + numeroSocio + "\n";
        str += "Nombre: " + nombre + "\n";
        str += "Fecha de nacimiento: " + new SimpleDateFormat("dd-MM-yyyy").format(fechaNacimiento) + "\n";
        str += "Fecha de alta: " + new SimpleDateFormat("dd-MM-yyyy").format(fechaAlta) + "\n";
        str += "Teléfono: " + telefono + "\n";
        str += "Email: " + email + "\n";
        str += "Familiares: " + "\n";
        for (Familiar f : familiares) {
            str += f.toString() + "\n";
        }
        return str;
    }
    
    public void ordenarFamiliaresPorEdad() {
        Collections.sort(familiares, new Comparator<Familiar>() {
            @Override
            public int compare(Familiar f1, Familiar f2) {
                return f1.getFechaNac().compareTo(f2.getFechaNac());
            }
        });
    }
    
    public void leerDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el nombre del socio: ");
        this.nombre = scanner.nextLine();
        
        while (true) {
            System.out.print("Introduzca la fecha de nacimiento del socio (en formato dd/MM/yyyy): ");
            String fechaStr = scanner.nextLine();
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            
            try {
                this.fechaNacimiento = dateFormat.parse(fechaStr);
                Calendar cal = Calendar.getInstance();
                cal.setTime(fechaNacimiento);
                int year = cal.get(Calendar.YEAR);
                int currentYear = Calendar.getInstance().get(Calendar.YEAR);
                
                if (year < 1900 || year > currentYear) {
                    System.out.println("Fecha de nacimiento no válida.");
                    continue;
                } 
                
            } catch (ParseException e) {
                System.out.println("Error al leer la fecha de nacimiento.");
                this.fechaNacimiento = null;
                continue;
            }
            
            break;
        }
        
        while (true) {
            System.out.print("Introduzca el teléfono del socio: ");
            String telefonoStr = scanner.nextLine();
            
            if (!telefonoStr.matches("[0-9]+")) {
                System.out.println("El teléfono solo debe contener números.");
                continue;
            }
            
            this.telefono = telefonoStr;
            break;
        }
        
        while (true) {
            System.out.print("Introduzca el email del socio: ");
            String emailStr = scanner.nextLine();
            
            /*La expresión utilizada para comprobar que el email 
             * tenga una terminación correcta es "^.+\\@.+\\..+$" :

			^: El inicio de la cadena.
			.+: Cualquier carácter (excepto el salto de línea) una o más veces.
			\\@: El carácter '@'.
			.+: Cualquier carácter (excepto el salto de línea) una o más veces.
			\\.: El carácter '.' 
			.+: Cualquier carácter (excepto el salto de línea) una o más veces.
			$: El final de la cadena.*/
            
            if (!emailStr.matches("^.+\\@.+\\..+$")) {
                System.out.println("El email debe tener una terminación correcta.");
                continue;
            }
            
            this.email = emailStr;
            break;
        }
    }


public static void main(String[] args) {
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
        System.out.println("9. Leer Socios en Archivo");
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
            case 9: 
            	LeerArchivo();
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

	    if (socio1.getFechaAlta().compareTo(socio2.getFechaAlta()) < 0) {
	        System.out.println("El socio " + socio1.getNombre() + " se dio de alta antes que el socio " + socio2.getNombre() + ".");
	    } else if (socio1.getFechaAlta().compareTo(socio2.getFechaAlta()) > 0) {
	        System.out.println("El socio " + socio2.getNombre() + " se dio de alta antes que el socio " + socio1.getNombre() + ".");
	    } else {
	        System.out.println("Ambos socios se dieron de alta el mismo día.");
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
	
	public static void guardarSocios() {
	    try {
	        if (socios.isEmpty()) {
	            System.out.println("La lista de socios está vacía.");
	        }
	        
	        // Abrir el archivo de salida
	        FileOutputStream fileOut = new FileOutputStream("Socios.bin");

	        // Crear un ObjectOutputStream
	        ObjectOutputStream out = new ObjectOutputStream(fileOut);

	        // Escribir los objetos en el archivo
	        out.writeObject(socios);
	        
	        System.out.println("Los socios se han guardado correctamente en el archivo.");

	        // Cerrar el ObjectOutputStream
	        out.close();
	        // Cerrar el archivo de salida
	        fileOut.close();
	    } catch (IOException ex) {
	        System.out.println("Algo salió mal al guardar los socios: " + ex.getMessage());
	    }
	}

	public static void LeerArchivo() {
	    try {
	        // Abrir el archivo de entrada
	        FileInputStream fileIn = new FileInputStream("Socios.bin");
	        // Crear un ObjectInputStream
	        ObjectInputStream in = new ObjectInputStream(fileIn);
	        // Leer la lista de socios del archivo
	        ArrayList<Socio> socios = (ArrayList<Socio>) in.readObject();
	        // Cerrar el ObjectInputStream
	        in.close();
	        // Cerrar el archivo de entrada
	        fileIn.close();
	        
	        // Hacer algo con la lista de socios leída del archivo, por ejemplo:
	        for (Socio socio : socios) {
	            System.out.println(socio);
	        }
	    } catch (IOException | ClassNotFoundException ex) {
	        System.out.println("Algo salió mal");
	    }
	}
	
}