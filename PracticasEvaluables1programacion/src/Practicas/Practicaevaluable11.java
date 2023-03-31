package Practicas;
public class Practicaevaluable11 {
    
    public static void main(String[] args){
        
        int num = 100, contador = 0;
        
        for (num = 100; num >= 0; num -= 2){
            System.out.print(num + " ");
        }
        
        System.out.println(); // Salto de línea
        
        for (num = 100; num >= 0; num--){
            if (num % 10 == 7){
                contador++;
            }
        }
        
        System.out.println("El número de números acabados en 7 es: " + contador);
    }
}