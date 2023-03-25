package Ejercicio934;

import java.util.Arrays;

import Ejercicio934.Carta.Palo;

public class Baraja {

    public static void main(String[] args) {
        
    	Carta[] cartas = new Carta[10];

        for (int i = 0; i < 10; i++) {
            
        	cartas[i] = Carta.cartaAlAzar();
       
        }

        System.out.println(Arrays.toString(cartas));
        Arrays.sort(cartas);
        System.out.println(Arrays.toString(cartas));
   
    }
}