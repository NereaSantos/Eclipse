package deberes;
import java.util.*;
public class ejercicio413 {
	
		public static void muestraPares(int primos) {
			for(int i = 2; i <= primos*2; i+=2) {
				System.out.println(i);
			}
		}
		public static void main(String[] args){
			muestraPares(4);
		}
}