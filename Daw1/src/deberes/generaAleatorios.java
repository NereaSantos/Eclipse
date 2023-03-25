package deberes;

public class generaAleatorios {
	 
	 
    public static void generaaleatorios(int veces){
 
        int numero, max = 100;
       
        for(int i = 0; i < veces; i++){
 
            numero = (int)(Math.random()*max);
            
            System.out.println(numero);
 
        }
 
    }
 
    public static void main(String[] args){
 
        generaaleatorios(3);
 
     }}