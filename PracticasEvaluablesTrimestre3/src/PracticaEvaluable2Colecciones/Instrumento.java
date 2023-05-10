package PracticaEvaluable2Colecciones;
import java.util.*;

public class Instrumento implements Comparable<Instrumento> {
	
    private static int sigId = 1;
    private int id;
    private String nombre;
    private String clase;

    public Instrumento(String nombre, String clase) {
        this.id = sigId++;
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
    
 // Método que compara dos Instrumentos y muestra un mensaje indicando si son de la misma clase o no.
	public static void equals(Instrumento instrumento1, Instrumento instrumento2)
	{
		if (instrumento1.getClase().equals(instrumento2.getClase()))
		{
			System.out.println("Los instrumentos son de la misma clase.");
		}
			
			else System.out.println("Los instrumentos son de diferente clase.");
	}
	
	 // Método que implementa la interfaz Comparable y permite la comparación entre Instrumentos basada en su clase y nombre.
	@Override
    public int compareTo(Instrumento other) {
        int compararClase = clase.compareTo(other.clase);
        if (compararClase == 0) {
            return nombre.compareTo(other.nombre);
        }
        return compararClase;
    }

	public static void main(String[] args) {

	    // Creo una lista de instrumentos y añado varios instrumentos a la lista.
	    List<Instrumento> instrumentos = new ArrayList<>();
	    instrumentos.add(new Instrumento("Guitarra", "Cuerda"));
	    instrumentos.add(new Instrumento("Violín", "Cuerda"));
	    instrumentos.add(new Instrumento("Piano", "Cuerda"));
	    instrumentos.add(new Instrumento("Trompeta", "Viento"));
	    instrumentos.add(new Instrumento("Flauta", "Viento"));
	    instrumentos.add(new Instrumento("Batería", "Percusión"));
	    instrumentos.add(new Instrumento("Timbal", "Percusión"));
	    instrumentos.add(new Instrumento("Timbal", "Percusión")); // Añadimos un instrumento duplicado

	    // Ordeno la lista de instrumentos por nobre de clase, usando el método sort() de la clase Collections.
	    System.out.println("Instrumentos ordenados por nombre de clase:");
	    Collections.sort(instrumentos);
	    for (Instrumento instrumento : instrumentos) {
	        System.out.println(instrumento);
	    }

	    // Creo un HashSet de instrumentos para eliminar los duplicados y luego lo converto en un TreeSet para ordenar los elementos.
	    System.out.println("\nInstrumentos sin duplicados por nombre:");
	    HashSet<Instrumento> instrumentosSet = new HashSet<>(instrumentos);
	    TreeSet<Instrumento> instrumentosTreeSet = new TreeSet<>(instrumentosSet);
	    for (Instrumento instrumento : instrumentosTreeSet) {
	        System.out.println(instrumento);
	    }

	    // Creo un TreeMap de instrumentos para ordenar los elementos por su código alfanumérico.
	    System.out.println("\nInstrumentos ordenados por código alfanumérico:");
	    TreeMap<String, Instrumento> instrumentosMap = new TreeMap<>();
	    int contador = 1;
	    for (Instrumento instrumento : instrumentos) {
	        String codigo = "I" + contador++;
	        instrumentosMap.put(codigo, instrumento);
	    }

	    // Itero el mapa para imprimir los elementos ordenados por su código alfanumérico.
	    for (Map.Entry<String, Instrumento> entry : instrumentosMap.entrySet()) {
	        System.out.println(entry.getKey() + " - " + entry.getValue());
	    }

	    // Creo otro TreeMap de instrumentos para ordenar los elementos por nombre.
	    System.out.println("\nInstrumentos ordenados por nombre:");
	    TreeMap<String, Instrumento> instrumentosMapPorNombre = new TreeMap<>();
	    for (Instrumento instrumento : instrumentos) {
	        instrumentosMapPorNombre.put(instrumento.getNombre(), instrumento);
	    }

	    // Itero el mapa para imprimir los elementos ordenados por nombre.
	    for (Map.Entry<String, Instrumento> entry : instrumentosMapPorNombre.entrySet()) {
	        System.out.println(entry.getKey() + " - " + entry.getValue());
	    }
	}

}

