package TresEnRaya;

import java.util.*;

public class TresEnRaya {

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		char tablero [][] = new char [3][3];
	
		System.out.println("Tres en raya");
		
	}
	
	void pintaTablero(char tablero[][]) {

		char num = '1';
		
		System.out.println("Elige una casilla disponible");
		
		for(int i = 0; i < tablero[i].length; i++) {
			
			for(int j = 0; j < tablero[i].length; j++) {
				
				if(tablero[i][j] == 0) {
					
					System.out.println(num + " ");
					
				}else 
					
					System.out.println(tablero[i][j] + " ");
				
			}
			
			num++;
			
		}
		
	}
			
		char RellenaTablero(char tablero [][], int jugador, char casilla) {
			
			final char usuario = 'X';
			
			final char maquina = 'O';
			
			char num = '1';
			
			for(int i = 0; i < tablero.length; i++) {
				
				for(int j = 0; j < tablero[i].length; j++) {
					
					if(casilla == num) {
						
						if(jugador == 1) {
							
							tablero[i][j] = usuario;
							
						}else
							
							tablero[i][j] = maquina;
						
					}
			
					num++;
					
		}
			
			}
			
			return num;
			
		
		}

		char jugadorUsuario(char tablero[][]) {
			
			Scanner src = new Scanner(System.in);
			
			int jugador = 1;
			
			char casilla = 0;
			
			System.out.println("Dame una casilla");
			
				casilla = src.next().charAt(0);
			
				while(casilla == 'O' || casilla == 'X') {
					
					System.out.println("Dame otra casilla");
					
					casilla = src.next().charAt(0);
					
				}
				
				//System.out.println(RellenaTablero(char tablero[][], jugador, int casilla));
				
			return casilla;
			
		}

		char jugadorMaquina(char tablero[][]) {
			
			int maquina = 2;
			
			char casilla = (char) (Math.random()*tablero.length);
			
			
			
			return casilla;
			
		}
		
}		
	
	

