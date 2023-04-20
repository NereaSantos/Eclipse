package EjercicioNumero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class numero1ºparte {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numerosPositivos = new int[10];
        int contador = 0;
        
        while (contador < 10) {
            System.out.print("Ingrese un número positivo: ");
            try {
                int numero = sc.nextInt();
                if (numero > 0) {
                    numerosPositivos[contador] = numero;
                    contador++;
                } else {
                    System.out.println("El número debe ser positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número.");
                sc.nextLine(); // Limpiar el scanner
            }
        }
        
        System.out.println("Los números positivos ingresados son:");
        for (int i = 0; i < contador; i++) {
            System.out.println(numerosPositivos[i]);
        }
        
        sc.close();
    }
	
}
