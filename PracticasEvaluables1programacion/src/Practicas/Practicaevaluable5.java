package Practicas;
import java.util.*;
public class Practicaevaluable5 {
    
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean b1 = false;
        boolean b2 = false;

        // Pedir al usuario que introduzca dos números
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        // Calcular la suma de los dígitos y encender las bombillas correspondientes
        int sumaDigitos = sumarDigitos(num1) + sumarDigitos(num2);
        if (sumaDigitos > 3) {
            b1 = true;
        } else {
            b2 = true;
        }

        // Mostrar el estado final de las bombillas
        System.out.println("Estado de la bombilla 1: " + b1);
        System.out.println("Estado de la bombilla 2: " + b2);

        scanner.close();
    }

    // Función para sumar los dígitos de un número
    public static int sumarDigitos(int num) {
        int suma = 0;
        while (num != 0) {
            suma += num % 10;
            num /= 10;
        }
        return suma;
    }
}