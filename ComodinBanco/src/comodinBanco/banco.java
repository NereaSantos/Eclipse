package comodinBanco;

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
	
	public int EdadCuenta() {
		
		Scanner sc = new Scanner(System.in);
		
		int mes, año, mesA, añoA;
		
		System.out.println("¿Cual es la fecha de creación de la cuenta? (mes y año en numero)");
		
			mes = sc.nextInt();
			
			año = sc.nextInt();
			
		System.out.println("¿Cual es la fecha actual? (mes y año)");
		
			mesA = sc.nextInt();
			
			añoA = sc.nextInt();
			
		if(mes == mesA && año == añoA) {
			
			System.out.println("Usted acaba d ecrear la cuenta");
			
		}else if(mes < mesA && año == añoA) {
			
				int diferencia = mesA - mes;
			
			System.out.println("Su cuenta tiene " + diferencia + " meses de edad");
			
		}else if(mes < mesA && año < añoA) {
			
			int diferencia = mesA - mes;
			
		}
		
	}
	
}
