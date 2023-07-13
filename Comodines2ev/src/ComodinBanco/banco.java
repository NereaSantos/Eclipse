package ComodinBanco;

import java.util.*;

import ComodinBanco.Cuenta.tipoCuenta;

public class banco {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
	Cuenta cuentas[] = new Cuenta[3];
	Cliente clientes[] = new Cliente[3];
	
	
	}
	
	public static void NuevoCliente(Cliente clientes[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String nombre, dni, apellido1, apellido2, telefono, direccion;
		
		System.out.println("Escriba el nombre y los apellidos del cliente");
		
		System.out.println("Nombre: ");
		
			nombre = sc.next();
		
		System.out.println("DNI: ");
			
			dni = sc.next();
			
		System.out.println("Primer Apellido: ");
			
			apellido1 = sc.next();
			
		System.out.println("Segundo Apellido: ");
			
			apellido2 = sc.next();
			
		System.out.println("Telefono: ");
			
			telefono = sc.next();
			
		System.out.println("Direccion: ");
			
			direccion = sc.next();
			
		for(int i = 0; i < clientes.length; i++) {
		
			if(clientes[i] == null && ComprobarDni(clientes, i) != 1) {
				
				clientes[i] = new Cliente(dni, nombre, apellido1, apellido2, telefono, direccion);
				
			}
			
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
	
	public static void NuevaCuenta() {
		
		Scanner sc = new Scanner(System.in);
		
		String cuenta;
		Cuenta cuenta1;
		
		System.out.println("Ingrese el tipo de cuenta que desea crear (Cuenta Corriente, Cuenta Vivienda, Fondo De Inversion)");
		
			cuenta = sc.next();
			
		if(cuenta.equals("Cuenta Corriente")) {
			
			cuenta1 = new Cuenta(tipoCuenta.CUENTACORRIENTE);
			
		}else if(cuenta.equals("Cuenta Vivienda")) {
			
			
		}else if(cuenta.equals("Fondo De Inversion")) {
			
			
			
		}
	}
	
}
