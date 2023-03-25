package practicasevaluables1ºtrimestre;
import java.util.*;

public class Practicaevaluable7 {
    
public static void main(String[] args){

Scanner teclado = new Scanner(System.in);

int numero, decenas = 0, unidades = 0;

    System.out.println("Escriba un número del 0 al 99");

    numero = teclado.nextInt();

    if(numero > 0 && numero < 99){

        decenas = numero/10;

        unidades = numero%10;

    }

    if(decenas == 1){

        System.out.println("diez y ");

    }else if(decenas == 2){

        System.out.println("veinte y ");

    }else if(decenas == 3){

        System.out.println("treinta y ");

    }else if(decenas == 4){

        System.out.println("cuarenta y ");

    }else if(decenas == 5){

        System.out.println("cincuenta y ");

    }else if(decenas == 6){

        System.out.println("sesenta y ");

    }else if(decenas == 7){

        System.out.println("setenta y ");

    }else if(decenas == 8){

        System.out.println("ochenta y ");

    }else if(decenas == 9){

        System.out.println("noventa y ");

    }

    if(unidades == 1){

        System.out.println("uno");

    }else if(unidades == 2){

        System.out.println("dos");

    }else if(unidades == 3){

        System.out.println("tres");

    }else if(unidades == 4){

        System.out.println("cuatro");

    }else if(unidades == 5){

        System.out.println("cinco");

    }else if(unidades == 6){

        System.out.println("seis");

    }else if(unidades == 7){

        System.out.println("siete");

    }else if(unidades == 8){

        System.out.println("ocho");

    }else if(unidades == 9){

        System.out.println("nueve");

    }

    teclado.close();
}}