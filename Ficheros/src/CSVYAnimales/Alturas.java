package CSVYAnimales;

import java.util.Scanner;

public class Alturas {

	/*1. Método numeroAlturas() --> devuelve el número de alturas que 
	 * determine el usuario por consola
	/2. Método leerAltura() --> tantas alturas como devuelva numeroAlturas. No puede haber alturas negativas --> bucles
	/3. calcularMedia () -->
	/4. mostrarResultados*/
	
	private int[] alturas;
    private int numeroAlturas;

    public static void main(String[] args) {
        Alturas alturas = new Alturas();
        alturas.numeroAlturas();
        alturas.leerAlturas();
        double media = alturas.calcularMedia();
        alturas.mostrarResultados(media);
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

    public double calcularMedia() {
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
	
}
