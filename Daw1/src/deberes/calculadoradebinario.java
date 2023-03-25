package deberes;
import java.util.*;
public class calculadoradebinario {
   
public static void main(String[] args){

Scanner teclado = new Scanner(System.in);

int num, resto;

System.out.println("Escriba un número en decimal");

num = teclado.nextInt();

while(num > 0){

resto = num % 2;

num = num / 2;

System.out.println(resto);

}

teclado.close();
}}