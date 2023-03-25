package ejerciciosclase;

import java.util.*;

public class buclefor {

    public static void main(String[] arg){

        Scanner teclado = new Scanner(System.in);

int suma = 0 , media = 0, i, bucle;

System.out.println("Cuantos números vas a pedir");

bucle = teclado.nextInt();

for(i = 0; i < bucle; i++){
System.out.println("Dame el número" + " i ");
    suma = suma + teclado.nextInt();
    
    media = suma/bucle;

    System.out.println("La suma es " + suma );


teclado.close();
}}}
