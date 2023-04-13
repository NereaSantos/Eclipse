package PracticaEvaluable1Colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

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
		return "Alimento con " + calorias + " calorias y de tipo" + tipo;
	} 
	
	 // Método para ordenar los alimentos
    public static void ordenarAlimentos(ArrayList<Alimento> alimentos) {
        // Crear el Comparator para ordenar los alimentos
        Comparator<Alimento> comparator = new Comparator<Alimento>() {
            public int compare(Alimento a1, Alimento a2) {
                if (a1.getCalorias() != a2.getCalorias()) {
                    return a1.getCalorias() - a2.getCalorias();
                } else {
                    return a1.getTipo().compareTo(a2.getTipo());
                }
            }
        };

        // Ordenar los alimentos en el ArrayList
        Collections.sort(alimentos, comparator);
   
    }
	
	public static void listado(ArrayList<Alimento> alimentos) {
	    HashMap<String, Integer[]> map = new HashMap<String, Integer[]>();
	    
	    // Calcular la suma de calorías y cantidad de alimentos de cada tipo
	    for (Alimento alimento : alimentos) {
	        String tipo = alimento.getTipo();
	        int calorias = alimento.getCalorias();
	        
	        if (map.containsKey(tipo)) {
	            Integer[] valores = map.get(tipo);
	            valores[0] += calorias;
	            valores[1]++;
	        } else {
	            Integer[] valores = {calorias, 1};
	            map.put(tipo, valores);
	        }
	    }
	    
	    // Imprimir el listado
	    for (Map.Entry<String, Integer[]> entry : map.entrySet()) {
	        String tipo = entry.getKey();
	        Integer[] valores = entry.getValue();
	        int media = valores[0] / valores[1];
	        System.out.println(tipo + ": " + media + " cal por alimento");
	    }
	}

	
}
