package practicasevaluables1ºtrimestre;
import java.util.*;

public class Practicaevaluable6 {
    
public static void main(String[] args){

    Scanner teclado = new Scanner(System.in);

    int numero;

    System.out.println("Introduzca un número de tres cifras");

    numero = teclado.nextInt();

    if (numero >= 100 && numero <= 999)

        if (numero % 10 == numero/100)

    System.out.println("El numero es capicúa");


    else 

    System.out.println("El número no es capicúa");

    else

    System.out.println("No es un número de tres cifras, por favor introduzca uno de tres cifras");

    teclado.close();

}}
