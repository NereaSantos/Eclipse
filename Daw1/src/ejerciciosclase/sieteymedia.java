package ejerciciosclase;
import java.util.*;

public class sieteymedia {
   
    public static void main(String[] agrs){

        Scanner teclado = new Scanner(System.in);
        
        final double limite = 7.5;
       
            int numcartas;
       
            double valorcartas = 0, suma = 0;
       
            String respuesta = "SI", respuesta2 = "si";
       
            System.out.println("¿Quiere una carta? (SI/NO) ");
       
            respuesta = teclado.next();
       
        while(respuesta.equalsIgnoreCase(respuesta2));{
       
            numcartas = (int)(Math.random()* 10 + 1);
            
            if (numcartas == 8 || numcartas == 9 || numcartas == 10) {
                
                valorcartas = 0.5;}
            
                else {
           
                valorcartas = numcartas; }
           
                System.out.println("Le ha tocado un " + numcartas + " su valor es " + valorcartas);
            
            if (valorcartas < limite) {

                System.out.println("¿Quiere seguir jugando?");

                respuesta = teclado.next();

                suma = valorcartas + valorcartas;

                System.out.println("Le ha tocado un " + numcartas + " su valor es " + valorcartas + " y el total acumulado es " + suma);
                
            }}
            
            if (valorcartas <= limite)
            	
            	System.out.println("Has ganado, felicidades");
            
                else 
            	 
            	System.out.println("el valor ha superado 7.5, has perdido");
                
    
    
        teclado.close();
       
        }}
