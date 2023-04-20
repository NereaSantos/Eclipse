package EjercicioNumero;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class numero {

	/*Perdir un numero al usuario hasta tener 10 positivos
	 * Gestionar excepciones
	 * Mostrar listado de  los números
	 * Sin duplicados
	 * Excepciones personalizadas (colecciones/ArrayList/Set)(nummeros duplicados)
	 * Lista de primos y no primos (Class duplicado extends exception)(primos ascendente/ no primos descendente)
	 * V1 Listas (ArrayList/LinkedList)
	 * V2 Conjuntos (Set/ HashSet)*/
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        Set<Integer> numerosSinDuplicados = new HashSet<>();
        Set<Integer> numerosPrimos = new HashSet<>();
        Set<Integer> numerosNoPrimos = new HashSet<>();
        
        while (numerosSinDuplicados.size() < 10) {
            try {
                System.out.print("Introduce un número positivo: ");
                int numero = scanner.nextInt();
                if (numero < 0) {
                    throw new NumeroNegativoException("El número introducido es negativo");
                }
                if (!numerosSinDuplicados.add(numero)) {
                    throw new NumeroDuplicadoException("El número introducido ya está en la lista");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: el valor introducido no es un número válido");
                scanner.next();
            } catch (NumeroNegativoException | NumeroDuplicadoException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        
        for (int numero : numerosSinDuplicados) {
            if (esPrimo(numero)) {
                numerosPrimos.add(numero);
            } else {
                numerosNoPrimos.add(numero);
            }
        }
        
        System.out.println("Lista de números:");
        for (int numero : numerosSinDuplicados) {
            System.out.print(numero + " ");
        }
        System.out.println();
        
        System.out.println("Lista de números primos:");
        for (int numero : numerosPrimos) {
            System.out.print(numero + " ");
        }
        System.out.println();
        
        System.out.println("Lista de números no primos:");
        for (int numero : numerosNoPrimos) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
    
    private static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static class NumeroNegativoException extends Exception {
        
        public NumeroNegativoException(String mensaje) {
            super(mensaje);
        }
    }
    
    public static class NumeroDuplicadoException extends Exception {
        
        public NumeroDuplicadoException(String mensaje) {
            super(mensaje);
        }
    }
}
