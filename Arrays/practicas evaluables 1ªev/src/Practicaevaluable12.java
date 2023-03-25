import java.util.*;
public class Practicaevaluable12 {

    public static void main(String[] args){

Scanner teclado = new Scanner(System.in);

    int numero, contador = 0, i, j;

    System.out.println("Escriba un número");

        numero = teclado.nextInt();

        for (i = 1; i < numero; i++){

            contador = 0;

            for(j = 1; j <= i; j++){

                if(i % j == 0){

                    contador++;

                }

            }

            if(contador == 2){

                System.out.println(i);

        }

    }

}}
