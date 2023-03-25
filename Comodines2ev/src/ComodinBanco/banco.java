package ComodinBanco;

import java.util.*;

public class banco {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
	Cuenta cuentas[] = new Cuenta[3];
	Cliente clientes[] = new Cliente[3];
	
	
	}
	
	public static void NuevoCliente(Cliente clientes[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String nombre, dni, apellido1, apellido2;
		
		System.out.println("Escriba el nombre y los apellidos del cliente");
		
		System.out.println("Nombre: ");
		
			nombre = sc.next();
		
		System.out.println("DNI: ");
			
			dni = sc.next();
			
		System.out.println("Primer Apellido: ");
			
			apellido1 = sc.next();
			
		System.out.println("Segundo Apellido: ");
			
			apellido2 = sc.next();
			
			
		for(int i = 0; i < clientes.length; i++) {
			
		}
		
	}
	
	public static int ComprobarDni(Cliente clientes[], int cont) {
		
		int contador = 0;
		
		for(int i = 0; i < clientes.length && clientes[i] != null; i++) {
			
			cont++;
			
			if(clientes[i].getDNI().equals(clientes[cont].getDNI())) {
				
				contador = 1;
				
				break;
				
			}
			
		}
		
		return contador;
	}
	
}
