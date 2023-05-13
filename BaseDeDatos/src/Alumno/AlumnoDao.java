package Alumno;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//Genera un método para pintar alumnos con este formato curso-nombre(nota media)
public class AlumnoDao {
  private Connection conexion;
  private final String USUARIO = "root";
  private final String PASSWORD = "admin";
  private final String MAQUINA = "localhost";
  private final String BD = "sakila2";

  public AlumnoDao() {
      conexion = conectar();
  }

public List<Alumno> alumnosXCurso(String curso) {
      List<Alumno> alumnos = new ArrayList<>();

      try {
          String sql = "SELECT * FROM Alumnos WHERE curso = ?";
          PreparedStatement sentencia = conexion.prepareStatement(sql);
          sentencia.setString(1, curso);
          ResultSet rs = sentencia.executeQuery();

          while (rs.next()) {
              int id = rs.getInt("num");
              String nombre = rs.getString("nombre");
              Date fNacimiento = rs.getDate("fNac");
              double notaMedia = rs.getDouble("media");
              String cursoAlumno = rs.getString("curso");
              Alumno a = new Alumno(id, nombre, fNacimiento, notaMedia, cursoAlumno);
              alumnos.add(a);
          }

          rs.close();
          sentencia.close();
      } catch (SQLException e) {
          System.err.println("Error al leer los alumnos por curso: " + e.getMessage());
      }

      return alumnos;
  }

  public void create(Alumno alumno) {
      try {
          String sql = "INSERT INTO Alumnos (num, nombre, fNac, media, curso) VALUES (?, ?, ?, ?, ?)";
          PreparedStatement sentencia = conexion.prepareStatement(sql);
          sentencia.setInt(1, alumno.getId());
          sentencia.setString(2, alumno.getNombre());
          sentencia.setDate(3, new java.sql.Date(alumno.getFNacimiento().getTime()));
          sentencia.setDouble(4, alumno.getNotaMedia());
          sentencia.setString(5, alumno.getCurso());
          sentencia.executeUpdate();
          sentencia.close();
      } catch (SQLException e) {
          System.err.println("Error al crear el alumno: " + e.getMessage());
      }
  }
  
  public Alumno read(int id) {
	    Alumno a = null;

	    try {
	        String sql = "SELECT * FROM Alumnos WHERE num = ?";
	        PreparedStatement sentencia = conexion.prepareStatement(sql);
	        sentencia.setInt(1, id);
	        ResultSet rs = sentencia.executeQuery();

	        if (rs.next()) {
	            String nombre = rs.getString("nombre");
	            Date fNacimiento = rs.getDate("fNac");
	            double notaMedia = rs.getDouble("media");
	            String cursoAlumno = rs.getString("curso");
	            a = new Alumno(id, nombre, fNacimiento, notaMedia, cursoAlumno);
	        }

	        rs.close();
	        sentencia.close();
	    } catch (SQLException e) {
	        System.err.println("Error al leer el alumno: " + e.getMessage());
	    }

	    return a;
	}

	public void update(Alumno alumno) {
	    try {
	        String sql = "UPDATE Alumnos SET nombre = ?, fNac = ?, media = ?, curso = ? WHERE num = ?";
	        PreparedStatement sentencia = conexion.prepareStatement(sql);
	        sentencia.setString(1, alumno.getNombre());
	        sentencia.setDate(2, new java.sql.Date(alumno.getFNacimiento().getTime()));
	        sentencia.setDouble(3, alumno.getNotaMedia());
	        sentencia.setString(4, alumno.getCurso());
	        sentencia.setInt(5, alumno.getId());
	        sentencia.executeUpdate();
	        sentencia.close();
	    } catch (SQLException e) {
	        System.err.println("Error al actualizar el alumno: " + e.getMessage());
	    }
	}

	public void delete(int id) {
	    try {
	        String sql = "DELETE FROM Alumnos WHERE num = ?";
	        PreparedStatement sentencia = conexion.prepareStatement(sql);
	        sentencia.setInt(1, id);
	        sentencia.executeUpdate();
	        sentencia.close();
	    } catch (SQLException e) {
	        System.err.println("Error al borrar el alumno: " + e.getMessage());
	    }
	}

	private Connection conectar() {
	    Connection con = null;

	    try {
	        Class.forName("com.mysql.jdbc.Driver");
	        String url = "jdbc:mysql://" + MAQUINA + "/" + BD;
	        con = DriverManager.getConnection(url, USUARIO, PASSWORD);
	    } catch (ClassNotFoundException e) {
	        System.err.println("Error cargando el driver: " + e.getMessage());
	    } catch (SQLException e) {
	        System.err.println("Error de SQL: " + e.getMessage());
	    }

	    return con;
	}

	public static void main(String[] args) {
	    // Ejemplos de uso de las clases y métodos
	    AlumnoDao dao = new AlumnoDao();
	    List<Alumno> segundoA = dao.alumnosXCurso("2A");

	    for (Alumno a : segundoA) {
	        System.out.println(a);
	    }

	    Alumno a1 = new Alumno(1, "Pepe", new Date(0), 8.5, "2A");
	    dao.create(a1);

	    Alumno a2 = dao.read(1);
	    a2.setNotaMedia(9.0);
	    dao.update(a2);

	    dao.delete(1);
	}
	
}