package Ejercicio1120;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejercicio1120 {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		int respuesta;
		
		Cliente[] TablaClientes = new Cliente[0];
		
		do{
			
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);
			
			System.out.println("Elija una opcion: "
								+ "\n 1.Añadir nuevo cliente "
								+ "\n 2.Modificar datos "
								+ "\n 3.Dar de baja cliente "
								+ "\n 4.Listar los clientes "
								+ "\n 5.Comparar clientes");
			
			respuesta = scr.nextInt();
			
			if(respuesta == 1) {
				
				AñadirCliente(TablaClientes);
				
			}
			
			if(respuesta == 2) {
				
				
				
			}
			
		}while(respuesta >= 1 && respuesta <= 5);
		
	}
	
	public static void AñadirCliente(Cliente[] clientes) {
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		String nombre;
		String telefono;
		Cliente[] TablaClientes = new Cliente[0];
		String[] DatosClientes;
		
		try {
			
			DatosClientes = br.readLine().split(" ");
			TablaClientes[0] = new Cliente(DatosClientes[0], DatosClientes[1], DatosClientes[2]);
			
		} catch (IOException e1) {
			
			System.out.println("Algo salio mal");

		}
		
		System.out.println("Escriba el nombre del cliente que desea añadir");
		
		InputStreamReader is2 = new InputStreamReader(System.in);
		BufferedReader br2 = new BufferedReader(is2);
				
	}
	
}