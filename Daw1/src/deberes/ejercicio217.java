package deberes;
import java.util.*;

public class ejercicio217 {

    public static void main(String[] arg) {

        Scanner teclado = new Scanner(System.in);

        // 1º numero random del 1 al 99
        int numero = (int)(Math.random() * 99 + 1);

        // 2º numero random del 1 al 99
        int numero2 = (int)(Math.random() * 99 + 1);
        
        int operacion = (int)(Math.random() * 3 + 1);

        // resultado correcto de la suma de los numeros anteriores
        int resultado;

        System.out.println("resuelva esta operaciones con estos dos números: " + numero + " y " + numero2);

        // suma del usuario
        int suma = teclado.nextInt();

        resultado = numero + numero2;
        
        if (suma == resultado)
            System.out.println("El resultado es correcto");

        else
            System.out.println("El resultado no es correcto");

        teclado.close();
}}