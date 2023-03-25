package practicasevaluables1ºtrimestre;
import java.util.*;

public class Practicaevaluable1 {

    public static void main(String[] arg) {

        Scanner teclado = new Scanner(System.in);

        //definir variables.
        int dia, mes;

        System.out.println("Escriba su dia nacimiento");

        dia = teclado.nextInt();

        System.out.println("Escriba su mes de nacimiento (numero)");

        mes = teclado.nextInt();

        //cadena de condicionales de la segunda mitad de diciembre a la primera
        //del22 de diciembre al 20 de enero 
        if (dia >= 22 && dia < 30 && mes == 12 || dia >= 1 && dia <= 20 && mes == 1)
            System.out.println("Eres Capricornio");
            
            //del 20 de enero al 20 de febrero
        else if (dia >= 20 && dia < 30 && mes == 1 || dia >= 1 && dia <= 20 && mes == 2)
            System.out.println("Eres Acuario");

            //del 19 de febrero al 20 de marzo
        else if (dia >= 19 && dia < 30 && mes == 2 || dia >= 1 && dia <= 20 && mes == 3)
            System.out.println("Eres Piscis");

            //del 21 de marzo al 19 de abril
        else if (dia >= 21 && dia < 30 && mes == 3 || dia >= 1 && dia <= 19 && mes == 4)
            System.out.println("Eres Aries");

            //del 20 de abril al 20 de mayo
        else if (dia >= 20 && dia < 30 && mes == 4 || dia >= 1 && dia <= 20 && mes == 5)
            System.out.println("Eres Tauro");

            //del 21 de mayo al 21 de junio
        else if (dia >= 21 && dia < 30 && mes == 5 || dia >= 1 && dia <= 21 && mes == 6)
            System.out.println("Eres Géminis");

            //del 21 de junio al 21 de julio
        else if (dia >= 21 && dia < 30 && mes == 6 || dia >= 1 && dia <= 22 && mes == 7)
            System.out.println("Eres Cáncer");

            //del 23 de julio al 21 de agosto
        else if (dia >= 23 && dia < 30 && mes == 7 || dia >= 1 && dia <= 22 && mes == 8)
            System.out.println("Eres Leo");

            //del 23 de agosto al 22 de septiembre
        else if (dia >= 23 && dia < 30 && mes == 8 || dia >= 1 && dia <= 22 && mes == 9)
            System.out.println("Eres Virgo");

            //del 23 de septiembre al 22 de octubre
        else if (dia >= 23 && dia < 30 && mes == 9 || dia >= 1 && dia <= 22 && mes == 10)
            System.out.println("Eres Libra");

            //del 23 de octubre al 22 de noviembre
        else if (dia >= 23 && dia < 30 && mes == 10 || dia >= 1 && dia <= 22 && mes == 11)
            System.out.println("Eres Escorpio");

            //del 22 de noviembre al 21 de diciembre
        else if (dia >= 22 && dia < 30 && mes == 11 || dia >= 1 && dia <= 21 && mes == 12)
            System.out.println("Eres Sagitario");

        teclado.close();

    }
}