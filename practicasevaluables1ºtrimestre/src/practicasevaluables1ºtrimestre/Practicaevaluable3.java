package practicasevaluables1ºtrimestre;
import java.util.*;

public class Practicaevaluable3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double num1, num4, num5;
        //para que el usuario tenga la opcion de divivir decimales
        double num2, num3, division, raiz;
        int potencia, opcion;

        System.out.println("Elija una de estas opciones:\n 1. raiz \n 2. division \n 3. potencia");

        opcion = teclado.nextInt();

        if (opcion == 1){

            System.out.println("Escriba un numero para realizar su raiz: ");

                num1 = teclado.nextDouble();

                raiz = (int) Math.sqrt(num1);

                System.out.println("La raiz de: " + num1 + " es igual a: " + raiz);

        }else if (opcion == 2){

            System.out.println("Escriba dos numeros para realizar la division: ");

            num2 = teclado.nextFloat();

            num3 = teclado.nextFloat();

            division = num2/num3;

            System.out.println("La division entre: " + num2 + " y " + num3 + " es igual a: " + division);

     }else if (opcion == 3)

            System.out.println("Escriba dos numeros para realizar su potencia");

            num4 = teclado.nextDouble();

            num5 = teclado.nextDouble();

            potencia = (int)Math.pow(num4, num5);

            System.out.println(num4 + " elevado a " + num5 + " es igual a: " + potencia);

            teclado.close();

    }
}
