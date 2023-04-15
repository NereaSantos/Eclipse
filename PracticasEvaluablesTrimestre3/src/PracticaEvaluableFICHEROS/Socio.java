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
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class Socio implements Serializable {

	private static ArrayList<Socio> socios = new ArrayList<>();
	
	private static int ultimoNumeroSocio = 0;
    
    private int numeroSocio;
    private String nombre;
    private Date fechaNacimiento;
    private Date fechaAlta;
    private String telefono;
    private String email;
    private ArrayList<Familiar> familiares;

    public Socio(String nombre, Date fechaNacimiento, String telefono, String email) {
        this.numeroSocio = ultimoNumeroSocio++;
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
    
    public static void setUltimoNumeroSocio(int ultimoNumeroSocio) {
        Socio.ultimoNumeroSocio = ultimoNumeroSocio;
    }
    
    public static int getUltimoNumeroSocio() {
        return ultimoNumeroSocio;
    }

    @Override
    public String toString() {
    	/*str se utiliza pa
    	 * ra concatenar los diferentes String ademas del 
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
                
                this.fechaNacimiento = Date.from(fechaNacimiento.atStartOfDay(ZoneId.systemDefault()).toInstant());
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
            
            this.email = emailStr;
            break;
        }
    }

    public static void ordenarSociosPorFechaAlta() {
        Collections.sort(socios, new Comparator<Socio>() {
            @Override
            public int compare(Socio s1, Socio s2) {
                return s1.fechaAlta.compareTo(s2.fechaAlta);
            }
        });
    }

 }