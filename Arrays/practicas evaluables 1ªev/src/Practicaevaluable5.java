import java.util.*;
public class Practicaevaluable5 {
    
public static void main(String[] args){

    Scanner teclado = new Scanner(System.in);

    int num1, num2, contador = 0;

    boolean b1 = false, b2 = false;

    System.out.println("Introduzca un numero");

        num1 = teclado.nextInt();

    System.out.println("Introduzca un numero");

        num2 = teclado.nextInt();

        if (num1 > 0 && num2 > 0){

            contador = num1 + num2;

            num1 = num1/10;

            num2 = num2/10;

        }

        if(contador > 3){

            b1 = true;

        } else if (contador < 3)
        
        b2 = true;

        System.out.println("bombilla b1: " + b1 + " bombilla b2 " + b2);
        
        

    teclado.close();

}}