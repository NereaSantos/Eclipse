package practicasevaluables1ºtrimestre;
import java.util.*;
public class Practicaevaluable9 {

    public static void main(String[] agrs){
    
Scanner teclado = new Scanner(System.in);

int numsecreto, numingresado, intentos = 10;

numsecreto = (int)(Math.random() * 100 + 1);

System.out.println("Adivine el numero secreto");

    numingresado = teclado.nextInt();

while(numsecreto != numingresado && intentos > 0){

    if (numsecreto > numingresado){
    
    intentos --;

    System.out.println("El número secreto es mayor que el ingresado");

    System.out.println("Le quedan " + intentos);

    System.out.println("Introduzca otro número");

    numingresado = teclado.nextInt();

    }else{

    System.out.println("El número secreto es menor que el número ingresado");

    System.out.println("Le quedan " + intentos);

    System.out.println("Introduzca otro número");

    numingresado = teclado.nextInt();

}}

if(intentos == 0){

System.out.println("El número secreto era: " + numsecreto);

}
else{

System.out.println("Exacto has adivinado el numero en " + intentos + " intentos");

System.out.println("El numero secerto era: " + numsecreto);

}

teclado.close();

}}
