package CSVYAnimales;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Animales animales = new Animales();
        
        // Cargar datos desde archivo CSV
        animales.cargarDesdeCSV("animales.csv");
        
        // Guardar datos en archivo binario
        animales.guardarEnFicheroBinario("animales.bin");
        
        // Cargar datos desde archivo binario y mostrarlos en la consola
        ArrayList<Animales.Animal> animalesCargados = animales.cargarDesdeFicheroBinario("animales.bin");
        for (Animales.Animal animal : animalesCargados) {
            System.out.println(animal.getId() + " - " + animal.getNombre() + " - " + animal.getEspecie() + " - " + animal.getEdad());
        }
    }

}
