package Alumno;

import java.sql.Date;

public class Alumno {
		//Constante para fijar tamaño máximo en el nombre de alumnos TAM_NOMBRE = 30;
		//atributos de alumno id de tipo numérico, nombre, fecha Nacimiento,
	    public static final int TAM_NOMBRE = 30;
	    private int id;
	    private String nombre;
	    private Date fNacimiento;
	    private double notaMedia;
	    private String curso;

	    public Alumno(int id) {
	        this.id = id;
	    }

	    public Alumno(int id, String nombre, Date fNacimiento, double notaMedia, String curso) {
	        this.id = id;
	        this.nombre = nombre;
	        this.fNacimiento = fNacimiento;
	        this.notaMedia = notaMedia;
	        this.curso = curso;
	    }

	  //Completa los getters y setters que falten
	    
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public Date getFNacimiento() {
	        return fNacimiento;
	    }

	    public void setFNacimiento(Date fNacimiento) {
	        this.fNacimiento = fNacimiento;
	    }

	    public double getNotaMedia() {
	        return notaMedia;
	    }

	    public void setNotaMedia(double notaMedia) {
	        this.notaMedia = notaMedia;
	    }

	    public String getCurso() {
	        return curso;
	    }

	    public void setCurso(String curso) {
	        this.curso = curso;
	    }

	    public String toString() {
	        return curso + "-" + nombre + "(" + notaMedia + ")";
	    }
	}