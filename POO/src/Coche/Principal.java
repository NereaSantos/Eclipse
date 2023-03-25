package Coche;

import java.util.Arrays;

import Coche.Coche.Accesorio;
import Coche.Coche.tipo;

public class Principal {

	public static void main(String[] args) {
		
	Accesorio a1 = new Accesorio(tipo.TECHO);
		
	Coche c1 = new Coche("BMW", "76");
	
	//c1.AñadirAccesorio(1, 1, 1);
	c1.AñadirAccesorios(1, "techo");
	//c1.AñadirAccesorio(1, 1, 0);
	
	System.out.println(c1);
	
	}
	
	public static void ordenarArray() {
		
		Coche a0 = new Coche("BMW", "76", 1, "techo");
		Coche a1 = new Coche("BMW", "76", 2, "asientos", "navegador");
		Coche a2 = new Coche("BMW", "76", 3, "techo", "asientos", "navegador");
		
		Coche coches [] = new Coche[3];
		
		coches[0] = a0;
		coches[1] = a1;
		coches[2] = a2;
		
		
		//a0.verPrecio();
		
		
		//a1.verPrecio();
		
		
		//a2.verPrecio();
		
		
		System.out.println("\n" + "Coches ordenados por precio: \n");
		
		for(int i = 0; i < coches.length-1; i++) {
			
			for(int j = 0; j < coches.length-i-1; j++) {
				
				if(coches[i] != null && coches[j].getPrecio() < coches[j+1].getPrecio()) {
					
					Coche aux = coches[j];
					
					coches[j] = coches[j+1];
					
					coches[j+1] = aux;
					
				}
				
			}
			
		}
		
		
			for(int i = 0; i < coches.length; i++) {
				
				System.out.println(coches[i].getPrecio());
				
			}	
		
	}
	
	public static void PrecioTotal() {
		
		Bateria b1 = new Bateria();
		Deposito d1 = new Deposito();
		
		Coche coches2 [] = new Coche[3];
		
		double precioTotal = 0;
		
		coches2[0] = new CocheElectrico("R", "7", b1);
		coches2[1] = new CocheCombustible("S", "10", d1); 
		coches2[2] = new Coche("BMW", "76");
		
		coches2[0].arrancar();
		coches2[1].detener();
		coches2[2].acelerar();
	
		for(int i = 0; i < coches2.length; i++) {
			
			precioTotal += coches2[i].getPrecio();
			
		}
		
		System.out.println("\n" + "El precio total de los coches es: " + precioTotal);
		
	}
	
	public static void informe(String marca) {
		
		int Ccoches = 0, CcochesC = 0, CcochesE = 0;
		
		Coche coches2 [] = new Coche[6];
		
		Deposito d1 = new Deposito();
		Bateria b1 = new Bateria();
		
		Deposito d2 = new Deposito();
		Bateria b2 = new Bateria();
		
		coches2[0] = new CocheElectrico("R", "7", b1);
		coches2[1] = new CocheCombustible("S", "10", d1); 
		coches2[2] = new Coche("BMW", "76");
		coches2[3] = new CocheElectrico("BMW", "7", b2);
		coches2[4] = new CocheCombustible("BMW", "10", d2);
		coches2[5] = new Coche("BMW", "76");
		

		for(int i = 0; i < coches2.length; i++) {
			
			if(marca.equals(coches2[i].getMarca())) {
			
				if(coches2[i] instanceof CocheCombustible) {
					
					CcochesC++;
					
				}else if(coches2[i] instanceof CocheElectrico) {
					
					CcochesE++;
					
				}	else Ccoches++;
					
				
			
			}
		}
		
		System.out.println("\n" + "Hay " + Ccoches + " coches de la marca " + marca);
		System.out.println("Hay " + CcochesC + " coches de combustible de la marca " + marca);
		System.out.println("Hay " + CcochesE + " coches electricos de la marca " + marca);
		
	}
	
}