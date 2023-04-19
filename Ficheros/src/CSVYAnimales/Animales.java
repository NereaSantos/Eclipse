package CSVYAnimales;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Animales implements Serializable {
    
    private ArrayList<Animal> animales;

    public static void main(String[] args) {
        Animales animales = new Animales();
        animales.cargarDesdeCSV("animales.csv");
        animales.guardarEnFicheroBinario("animales.bin");
    }

    public void cargarDesdeCSV(String nombreArchivo) {
        animales = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(";");
                Animal animal = new Animal(campos[0], campos[1], campos[2], Integer.parseInt(campos[3]));
                animales.add(animal);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error al cargar desde el archivo CSV");
            e.printStackTrace();
        }
    }

    public ArrayList<Animal> cargarDesdeFicheroBinario(String nombreFichero) {
        ArrayList<Animal> animalesCargados = new ArrayList<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreFichero));
            animalesCargados = (ArrayList<Animal>) ois.readObject();
            ois.close();
        } catch (IOException e) {
            System.out.println("Error al cargar desde el fichero binario");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar los objetos desde el fichero binario");
            e.printStackTrace();
        }
        return animalesCargados;
    }
    
    public void guardarEnFicheroBinario(String nombreFichero) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreFichero));
            oos.writeObject(animales);
            oos.close();
        } catch (IOException e) {
            System.out.println("Error al guardar en el fichero binario");
            e.printStackTrace();
        }
    }
    
    public static class Animal implements Serializable {
        private String id;
        private String especie;
        private String nombre;
        private int edad;
        
        public Animal(String id, String especie, String nombre, int edad) {
            this.id = id;
            this.especie = especie;
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getId() {
            return id;
        }

        public String getEspecie() {
            return especie;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }
    }
}