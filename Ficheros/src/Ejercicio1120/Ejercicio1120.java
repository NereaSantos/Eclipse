package Ejercicio1120;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
			
			EscribirEnFichero();
				
	}
	
	public static void EscribirEnFichero() {
	
	 try {
		 
         // Creamos un objeto FileOutputStream para abrir el archivo binario
         FileOutputStream fos = new FileOutputStream("ListaDeClientes.bin");

         // Creamos un objeto BufferedOutputStream para escribir los datos en el archivo
         BufferedOutputStream bos = new BufferedOutputStream(fos);

         // Escribimos en el archivo binario desde la consola
         System.out.println("Escriba los datos en el archivo binario:");
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String data = br.readLine();
         
         // Convertimos la cadena de texto a un array de bytes y escribimos en el archivo binario
         byte[] bytes = data.getBytes();
         bos.write(bytes);

         // Cerramos los flujos de salida
         bos.close();
         fos.close();

         System.out.println("Los datos se han escrito correctamente en el archivo binario.");
    
	 } catch (IOException e) {
        
		 System.out.println("Ha ocurrido un error al escribir en el archivo binario.");
        
     }
 }
	
	public static void LeerFichero() {
		
		try {
            // Creamos un objeto FileInputStream para abrir el archivo binario
            FileInputStream fis = new FileInputStream("archivo.bin");

            // Creamos un objeto BufferedInputStream para leer los datos del archivo
            BufferedInputStream bis = new BufferedInputStream(fis);

            // Creamos un ArrayList para almacenar los datos leídos del archivo
            ArrayList<String> datos = new ArrayList<String>();

            // Leemos los datos del archivo y los almacenamos en el ArrayList
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = bis.read(buffer)) != -1) {
                String data = new String(buffer, 0, bytesRead);
                datos.add(data);
            }

            // Cerramos los flujos de entrada
            bis.close();
            fis.close();

            // Imprimimos los datos leídos del archivo
            System.out.println("Los datos leídos del archivo son:");
            
            for (String data : datos) {
            
            	System.out.println(data);
            
            }
        
		} catch (IOException e) {
        
			System.out.println("Ha ocurrido un error al leer el archivo binario.");
            
        }
		
	}
	
}