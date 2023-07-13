package Usuario;

import java.util.Scanner;
import java.net.http.HttpClient;

public class Usuario {

	String nombreUsuario;
	String contraseña;
	String email;
	
	public void tipoUsuario() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Ya tiene una cuenta? (Si/No)");
		
			String respuesta = sc.next();
			
			if(respuesta.equals("Si")) {
				
				cuentaCreada();
				
			}else {
				
				crearCuenta();
				
			}
		
	}
	
	public void crearCuenta() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un nombre de usuario válido "
				+ "(que no se repita y solo contenga letras y números, sin espacios)");
		
			String nombreUsuario = sc.next();
	
			if(comprobarNombreUsuario(nombreUsuario) == true) {
				
				System.out.println("Nombre de usuario regustrado");
				
			}else {
				
				System.out.println("Este nombre de usuario no esta disponible");
				
			}
		
		System.out.println("Introduzca");
			
	}

	public boolean comprobarNombreUsuario(String nombreUsuario) {
		
		return nombreUsuario.matches("[a-zA-Z0-9]+") && !nombreUsuario.contains(" ");
		
		
		
	}

}
