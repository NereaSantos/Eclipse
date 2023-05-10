package BasesDeDatos;

public class Pais {

	int country_id;
	String country;
	
	//Constructor con parámetros
	public Pais(String nombre) {
		
		this.country = nombre;
		
	}
	
	public Pais() {
		
		
	}

	public int getCountry_id() {
		return country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
}
