package PracticaEvaluableFICHEROS;

import java.io.Serializable;
import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Socio implements Serializable {
    private static int ultimoNumeroSocio = 0;
    private static int numeroSocio;
    private String nombre;
    private Date fechaNacimiento;
    private LocalDate fechaAlta;
    private String telefono;
    private String correoElectronico;
    private Familiar[] familiares;
    private int numFamiliares;

    private static Socio[] socios = new Socio[50];
    private static int numSocios = 0;

    public Socio(String nombre, Date fechaNacimiento, LocalDate fechaAlta, String telefono, String correoElectronico) {
        this.numeroSocio = ++ultimoNumeroSocio;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaAlta = fechaAlta;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.familiares = new Familiar[50];
        this.numFamiliares = 0;
        socios[numSocios] = this;
        numSocios++;
    }

    public static Socio[] getSocios() {
        return socios;
    }

    public static int getNumeroSocio() {
        return numeroSocio;
    }
    
    public static void setNumeroSocio(int numeroSocio) {
		
    	numeroSocio = numeroSocio;
    	
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

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Familiar[] getFamiliaresACargo() {
        return familiares;
    }

    public int getNumFamiliares() {
        return numFamiliares;
    }

    @Override
    public String toString() {
    	String familiaresString = "";
    	if (numFamiliares > 0) {
    	    familiaresString = Arrays.toString(Arrays.copyOf(familiares, numFamiliares));
    	}
    return "Socio " +
    	"\n numeroSocio: " + numeroSocio +
    	"\n nombre: " + nombre +
	    "\n fechaNacimiento: " + fechaNacimiento +
	    "\n fechaAlta: " + fechaAlta +
	    "\n telefono: " + telefono +
	    "\n correoElectronico: " + correoElectronico +
	    "\n familiares: " + familiaresString +
	    "\n numFamiliares: " + numFamiliares;
    }

	public void ordenarFamiliaresPorEdad() {
        // ordenar los familiares por fecha de nacimiento
        Arrays.sort(familiares, Comparator.comparing(Familiar::getFechaNacimiento));
    }
	
	  public void leerDatos() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduzca el nombre del socio: ");
	        this.nombre = scanner.nextLine();
	        
	        while (true) {
	            System.out.print("Introduzca la fecha de nacimiento del socio (en formato d/M/yyyy): ");
	            String fechaStr = scanner.nextLine();
	            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
	            
	            try {
	                LocalDate fechaNacimiento = LocalDate.parse(fechaStr, formatter);
	                LocalDate fechaActual = LocalDate.now();
	                
	                if (fechaNacimiento.isAfter(fechaActual) || fechaNacimiento.getYear() < 1900) {
	                    System.out.println("Fecha de nacimiento no válida.");
	                    continue;
	                } 
	                
	                this.fechaNacimiento = (Date) Date.from(fechaNacimiento.atStartOfDay(ZoneId.systemDefault()).toInstant());
	                break;
	            } catch (DateTimeParseException e) {
	                System.out.println("Error al leer la fecha de nacimiento.");
	                this.fechaNacimiento = null;
	                /*El continue se utiliza para que el programa siga pidiendo
	                 * al usuario que se ingrese una fecha válida y el break del final
	                 * se utiliza cuandoya se ha ingresado una fecha válida*/
	                continue;
	            }  
	        }
	        
	        while (true) {
	            System.out.print("Introduzca el teléfono del socio: ");
	            String telefonoStr = scanner.nextLine();

	            if (!telefonoStr.matches("\\+\\d{2}(\\d{3}|\\d{4})\\d{6}")) {
	                System.out.println("El teléfono debe tener un formato válido (+XX####### o +XX########).");
	                continue;
	            }

	            this.telefono = telefonoStr;
	            break;
	        }
	        
	        while (true) {
	            System.out.print("Introduzca el email del socio: ");
	            String emailStr = scanner.nextLine();
	            
	            if (!emailStr.matches("^.+\\@.+\\..+$")) {
	                System.out.println("El email debe tener una terminación correcta.");
	                continue;
	            }
	            
	            this.correoElectronico = emailStr;
	            break;
	        }
	    }

	public void agregarFamiliar(Familiar familiar) {
		// TODO Auto-generated method stub
		
	}

	
}