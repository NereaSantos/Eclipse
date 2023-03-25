package Ejercicio1120;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1120 {

	public static void main(String[] args) {
		
		String respuesta = null;
		
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
			
			try {
					
				respuesta = br.readLine();
			
			} catch (IOException e) {
				
				System.out.println("Algo salio mal");
			
			}
			
			if(respuesta.equals("1")) {
				
				AñadirCliente(TablaClientes);
				
			}
			
		}while(!respuesta.equals("0"));
		
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
		
		
				
	}
	
}
