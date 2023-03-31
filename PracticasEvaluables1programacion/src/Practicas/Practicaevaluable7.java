package Practicas;
import java.util.*;

public class Practicaevaluable7 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero, decenas = 0, unidades = 0;
        String textoNumero = "";

        System.out.println("Escriba un número del 0 al 99");
        numero = teclado.nextInt();

        if (numero > 0 && numero < 99) {
            decenas = numero/10;
            unidades = numero%10;
        }

        switch (decenas) {
            case 1:
                textoNumero += "diez y ";
                break;
            case 2:
                textoNumero += "veinte y ";
                break;
            case 3:
                textoNumero += "treinta y ";
                break;
            case 4:
                textoNumero += "cuarenta y ";
                break;
            case 5:
                textoNumero += "cincuenta y ";
                break;
            case 6:
                textoNumero += "sesenta y ";
                break;
            case 7:
                textoNumero += "setenta y ";
                break;
            case 8:
                textoNumero += "ochenta y ";
                break;
            case 9:
                textoNumero += "noventa y ";
                break;
        }

        switch (unidades) {
            case 1:
                textoNumero += "uno";
                break;
            case 2:
                textoNumero += "dos";
                break;
            case 3:
                textoNumero += "tres";
                break;
            case 4:
                textoNumero += "cuatro";
                break;
            case 5:
                textoNumero += "cinco";
                break;
            case 6:
                textoNumero += "seis";
                break;
            case 7:
                textoNumero += "siete";
                break;
            case 8:
                textoNumero += "ocho";
                break;
            case 9:
                textoNumero += "nueve";
                break;
        }

        System.out.println(textoNumero);
        teclado.close();
    }
}