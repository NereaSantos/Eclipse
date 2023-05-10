package BasesDeDatos;

import java.sql.*;
import java.util.ArrayList;

public class PruebaBaseDeDatos {

	static ArrayList<String> lista = new ArrayList<>();
	static ArrayList<Pais> lista2 = new ArrayList<>();
	
	public static void main(String[] args) {
		
		try {
			
			//1. Crear conexión
				//Parametros url, la base de datos, usuario y contraseña
			Connection MiConexion = DriverManager.getConnection("jdbc:mysql//localhost:3333/sakila", "root", "admin");
			
			//2. Crear objeto Statement (Sentencia)
			Statement miStatement = MiConexion.createStatement();
			
			//3. Ejecutar sql (consulta)
			ResultSet miRS = miStatement.executeQuery("SELECT * FROM country");
			
			//4. Recorrer el resultSet
			while(miRS.next()) {
				
				System.out.println("Pais: " + miRS.getString("country"));
			
			//introducir la información de la tabla en un ArrayList
				lista.add(miRS.getString("country"));
				
				Pais miPais = new Pais(miRS.getNString("nombre"));
				
				lista2.add(miPais);
				
			}
			
			for(String i : lista) {
				
				System.out.println(i);
				
			}
			
		}catch(Exception e){
			
			System.out.println("Error de conexion");
			
		}
	}
	
}
