package PracticaEvaluable2Colecciones;
import java.util.*;

public class Instrumento implements Comparable<Instrumento> {
	
    private static int nextId = 1;
    private int id;
    private String nombre;
    private String clase;

    public Instrumento(String nombre, String clase) {
        this.id = nextId++;
        this.nombre = nombre;
        this.clase = clase;
    }

    public Instrumento() {
        this("Sin nombre", "Sin clase");
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClase() {
        return clase;
    }

    @Override
    public String toString() {
        return "Intrumento llamado: " + nombre + " del tipo " + clase;
    }

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (obj == null) {
	        return false;
	    }
	    if (getClass() != obj.getClass()) {
	        return false;
	    }
	    Instrumento other = (Instrumento) obj;
	    if (this.getClass() != other.getClass()) {
	        return false;
	    }
	    return true;
	}

	@Override
    public int compareTo(Instrumento other) {
        int compararClase = clase.compareTo(other.clase);
        if (compararClase == 0) {
            return nombre.compareTo(other.nombre);
        }
        return compararClase;
    }

    public static void main(String[] args) {
        List<Instrumento> instrumentos = new ArrayList<>();
        instrumentos.add(new Instrumento("Guitarra", "Cuerda"));
        instrumentos.add(new Instrumento("Violín", "Cuerda"));
        instrumentos.add(new Instrumento("Piano", "Cuerda"));
        instrumentos.add(new Instrumento("Trompeta", "Viento"));
        instrumentos.add(new Instrumento("Flauta", "Viento"));
        instrumentos.add(new Instrumento("Batería", "Percusión"));
        instrumentos.add(new Instrumento("Timbal", "Percusión"));

        System.out.println("Instrumentos ordenados por clase y nombre:");
        Collections.sort(instrumentos);
        for (Instrumento instrumento : instrumentos) {
            System.out.println(instrumento);
        }

        System.out.println("\nInstrumentos sin duplicados por nombre:");
        Set<Instrumento> instrumentosSet = new HashSet<>(instrumentos);
        for (Instrumento instrumento : instrumentosSet) {
            System.out.println(instrumento);
        }

        System.out.println("\nInstrumentos ordenados por código alfanumérico:");
        Map<String, Instrumento> instrumentosMap = new TreeMap<>();
        int contador = 1;
        for (Instrumento instrumento : instrumentos) {
            String codigo = "I" + contador++;
            instrumentosMap.put(codigo, instrumento);
        }

        for (Map.Entry<String, Instrumento> entry : instrumentosMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\nInstrumentos ordenados por nombre:");
        Map<String, Instrumento> instrumentosMapPorNombre = new TreeMap<>();
        for (Instrumento instrumento : instrumentos) {
            instrumentosMapPorNombre.put(instrumento.getNombre(), instrumento);
        }
        for (Map.Entry<String, Instrumento> entry : instrumentosMapPorNombre.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}

