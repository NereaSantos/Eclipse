package PracticaEvaluable1Colecciones;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear varios alimentos y añadirlos a un ArrayList
        List<Alimento> alimentos = new ArrayList<>();
        alimentos.add(new Alimento("Fruta", 100));
        alimentos.add(new Alimento("Fruta", 80));
        alimentos.add(new Alimento("Verdura", 50));
        alimentos.add(new Alimento("Carne", 200));
        alimentos.add(new Alimento("Carne", 250));

        // Ordenar la lista de alimentos
        Alimento.ordenarAlimentos(alimentos);

        System.out.println("Listado de alimentos ordenados: \n");
        for (Alimento alimento : alimentos) {
            System.out.println(alimento.toString());
        }
        
        // Mostrar el listado de todos los tipos de alimentos y la media de calorías que hay de cada tipo
        Alimento.listado(alimentos);
    }
}
