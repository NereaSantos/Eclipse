package Practicas;
import java.util.*;
 
public class Practicaevaluable2{
 
	/*Una frutería ofrece un descuento en los tomates, del 20% por la 
	 * compra de más de 3 kilos o 15 unidades (1 kilo son aproximadamente 
	 * 5 tomates) y 10% en caso contrario. Además por la compra de más de 
	 * 3 kilos se regalan 2 tomates por cada kilo de más. Pon un precio a 
	 * los tomates y calcula el total de la compra, el descuento, lo que 
	 * pagas finalmente y el número de tomates que se regalan en cada 
	 * compra.*/
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Preguntar al usuario si quiere comprar en kilos o en unidades
        System.out.print("¿Quieres comprar en kilos (K) o en unidades (U)? ");
        String opcion = scanner.nextLine().toUpperCase();
        boolean comprarEnKilos = opcion.equals("K");

        // Solicitar al usuario el precio por unidad de tomate
        System.out.print("Introduce el precio por unidad de tomate: ");
        double precioTomate = scanner.nextDouble();

        // Solicitar al usuario la cantidad de tomates comprados
        System.out.print("Introduce la cantidad de tomates ");
        if (comprarEnKilos) {
            System.out.print("en kilos: ");
        } else {
            System.out.print("en unidades: ");
        }
        int cantidadTomates = scanner.nextInt();

        double precioOriginal = 0.0;
        double precioCompra = 0.0;
        int tomatesRegalados = 0;

        if (comprarEnKilos) {
            // Cálculo en kilos
            double kilosTomates = cantidadTomates;
            int unidadesTomates = (int) (kilosTomates * 5);

            precioOriginal = unidadesTomates * precioTomate;
            if (kilosTomates > 3 || unidadesTomates > 15) {
                double descuento = Math.round(precioOriginal * 0.2 * 100) / 100.0;
                precioCompra = precioOriginal - descuento;
                tomatesRegalados = (int) Math.round((unidadesTomates - 15) / 5.0) * 2;
            } else {
                double descuento = Math.round(precioOriginal * 0.1 * 100) / 100.0;
                precioCompra = precioOriginal - descuento;
                tomatesRegalados = 0;
            }
        } else {
            // Cálculo en unidades
            precioOriginal = cantidadTomates * precioTomate;
            if (cantidadTomates > 15) {
                double descuento = Math.round(precioOriginal * 0.2 * 100) / 100.0;
                precioCompra = precioOriginal - descuento;
                tomatesRegalados = (cantidadTomates - 15) * 2;
            } else {
                double descuento = Math.round(precioOriginal * 0.1 * 100) / 100.0;
                precioCompra = precioOriginal - descuento;
                tomatesRegalados = 0;
            }
        }

        // Imprimir resultados
        System.out.println("El precio de compra es: " + precioCompra + " euros");
        System.out.println("El descuento es: " + Math.round((precioOriginal - precioCompra) / precioOriginal * 100) + "%");
        System.out.println("El número de tomates regalados es: " + tomatesRegalados);

        scanner.close();
    }
}