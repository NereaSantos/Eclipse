package Practicas;
import java.util.*;
 
public class Practicaevaluable2{
 
 public static void main(String[] args){
 
    Scanner teclado = new Scanner(System.in);
 
    int respuesta, tomates = 0, total = 0;
 
    double kilos = 0, descuento, precio, tomatesreg;

    System.out.println("Escribe el precio del tomate: ");
		precio = teclado.nextDouble();
		
		while(precio<0) {
			System.out.println("Error. Escribe un precio valido: ");
			precio = teclado.nextDouble();
		}
 
    System.out.println("¿Desea comprar en unidades o en kilos?. \n1UNIDADES \n2KILOS");
 
 
        respuesta = teclado.nextInt();
        
        kilos = tomates/5;
 
    if(respuesta == 1){
 
        System.out.println("¿Cuantas unidades quieres comprar?");
 
        tomates = teclado.nextInt();
 
        if(tomates > 15){
 
            descuento = 0.20;
 
            precio = (precio * tomates);
 
            total = (int) (precio-(precio*descuento));
 
            tomatesreg = (int)(2*(tomates/15));
 
            tomates = (int) (tomates + tomatesreg);
 
            System.out.println("El total de su compra es: " + tomates + " tomates con un descuento de: " + descuento + " un importe final de " + total + " y " + tomatesreg + " tomates de regalo");
 
        }
 
        else if(tomates < 15){
 
            descuento = 0.10;
 
            precio = precio - (precio * tomates);
 
            total = (int) (precio*descuento);
 
            System.out.println("El total de su compra es: " + tomates + " tomates con un descuento de: " + descuento + " un importe final de " + total);
        }
 
    }
    else if(respuesta == 2){
 
        System.out.println("¿Cuantos Kilos quieres comprar?");
 
        kilos = teclado.nextInt();
 
        if(kilos > 3){
 
            descuento = 0.20;
 
            kilos = tomates/5;
 
            precio = precio * kilos;
 
            total = (int) (precio-(precio*descuento));
 
            tomatesreg = (int)(2*(kilos-3));
 
            System.out.println("El total de su compra es: " + kilos + " kilos con un descuento de: " + descuento + " un importe final de " + total + " y " + tomatesreg + " tomates de regalo");
 
        }
 
        else if(kilos < 3){
 
            descuento = 0.10;
 
            kilos = tomates/5;
 
            precio = precio * tomates;
 
            total = (int) (precio-(precio*descuento));
 
          
 
            System.out.println("El total de su compra es: " + kilos + " kilos con un descuento de: " + descuento + " un importe final de " + total);
 
        }
 
    }
 
    teclado.close();    
 
 }  
}