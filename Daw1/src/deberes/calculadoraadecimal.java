package deberes;
import java.util.*;
public class calculadoraadecimal {
public static void main(String[] args){

Scanner teclado = new Scanner(System.in);
       
int numbin, multiplicacion, base = 2, potencia = 0, suma = 0, cifra;
       
    System.out.println("Escriba un número en binario");
       
        numbin = teclado.nextInt();
       
    while(numbin > 0){

        cifra = numbin % 10;
       
        multiplicacion = (int)(numbin * Math.pow(base, potencia));
       
        potencia ++;

        suma = suma + multiplicacion;

        numbin = numbin / 2;
       
        System.out.println(cifra);
       
        }

        teclado.close();
        }}