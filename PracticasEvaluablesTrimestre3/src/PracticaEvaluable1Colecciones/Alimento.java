package PracticaEvaluable1Colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Alimento implements Saludable {

    private int calorias;
    private String tipo;
    
    public Alimento(String tipo, int calorias) {
        this.calorias = calorias;
        this.tipo = tipo;
    }
    
    @Override
    public String getTipo() {
        return this.tipo;
    }
    
    @Override
    public int getCalorias() {
        return this.calorias;
    }

    @Override
    public String toString() {
        return "Alimento con " + calorias + " calorias y de tipo " + tipo;
    } 
    
     // Método para ordenar los alimentos
    public static void ordenarAlimentos(List<Alimento> alimentos) {
        Comparator<Alimento> comparador = new Comparator<Alimento>() {
            public int compare(Alimento a1, Alimento a2) {
                int cmp = Integer.compare(a1.getCalorias(), a2.getCalorias());
                if (cmp == 0) {
                    cmp = a1.getTipo().compareTo(a2.getTipo());
                }
                return cmp;
            }
        };
        Collections.sort(alimentos, comparador);
    }
    
    public static void listado(List<Alimento> alimentos) {
        List<String> tipos = new ArrayList<>();
        for (Alimento alimento : alimentos) {
            String tipo = alimento.getTipo();
            if (!tipos.contains(tipo)) {
                tipos.add(tipo);
            }
        }

        for (String tipo : tipos) {
            int totalCalorias = 0;
            int numAlimentos = 0;
            for (Alimento alimento : alimentos) {
                if (alimento.getTipo().equals(tipo)) {
                    totalCalorias += alimento.getCalorias();
                    numAlimentos++;
                }
            }
            double mediaCalorias = ((double) totalCalorias) / numAlimentos;
            System.out.println(tipo + ": media de calorías = " + mediaCalorias);
        }
    }
}
