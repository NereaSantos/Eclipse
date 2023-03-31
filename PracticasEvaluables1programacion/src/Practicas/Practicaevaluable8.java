package Practicas;
import java.util.*;
public class Practicaevaluable8 {
    
public static void main(String[] args){

    Scanner teclado = new Scanner(System.in);

    String contraseña = "573F", cusuario;

    System.out.println("Escriba una contraseña");

        cusuario = teclado.next();

    while(cusuario.equalsIgnoreCase(contraseña) == false){

            System.out.println("Escriba una contraseña");

            cusuario = teclado.next();
        
    }

    if(cusuario.equalsIgnoreCase(contraseña) == true){

        System.out.println("Contraseña correcta");

    }

    teclado.close();

}}