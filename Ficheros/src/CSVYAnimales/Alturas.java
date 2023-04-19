package CSVYAnimales;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Alturas {

	/*1. Método numeroAlturas() --> devuelve el número de alturas que 
	 * determine el usuario por consola
	/2. Método leerAltura() --> tantas alturas como devuelva numeroAlturas. No puede haber alturas negativas --> bucles
	/3. calcularMedia () -->
	/4. mostrarResultados*/
	
	private static int[] alturas;
    private static int numeroAlturas;

    public static void main(String[] args) {
        Alturas alturas = new Alturas();
        alturas.numeroAlturas();
        alturas.leerAlturas();
        double media = alturas.calcularMedia();
        alturas.mostrarResultados(media);
        
        guardarEnArchivo();
        
    }

    public void numeroAlturas() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce el número de alturas: ");
            numeroAlturas = sc.nextInt();
        } while (numeroAlturas <= 0);
        alturas = new int[numeroAlturas];
    }

    public void leerAlturas() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeroAlturas; i++) {
            do {
                System.out.print("Introduce la altura " + (i+1) + ": ");
                alturas[i] = sc.nextInt();
            } while (alturas[i] < 0);
        }
    }

    public static double calcularMedia() {
        int suma = 0;
        for (int i = 0; i < numeroAlturas; i++) {
            suma += alturas[i];
        }
        return (double) suma / numeroAlturas;
    }

    public void mostrarResultados(double media) {
        System.out.println("Alturas introducidas:");
        for (int i = 0; i < numeroAlturas; i++) {
            System.out.println("- Altura " + (i+1) + ": " + alturas[i]);
        }
        System.out.println("Media de alturas: " + media);
    }
	
    public static void guardarEnArchivo() {
        try {
            FileWriter fw = new FileWriter("alturas.csv");
            StringBuilder sb = new StringBuilder();
            sb.append("Alturas introducidas:\n");
            for (int i = 0; i < numeroAlturas; i++) {
                sb.append("Altura " + (i+1) + "," + alturas[i] + "\n");
            }
            sb.append("Media de alturas," + calcularMedia() + "\n");
            fw.write(sb.toString());
            fw.close();
            System.out.println("Los datos se han guardado en el archivo alturas.csv");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo");
        }
    }
    
}
