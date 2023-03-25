package Coche;

public class Deposito {

	private String tipo;
	private String etiqueta;
	
	Deposito(){
		
		
		
	}
	
	Deposito(String tipo, String etiqueta){
		
		this.tipo = tipo;
		this.etiqueta = etiqueta;
		
	}
	
	public void setTipo(String tipo) {
		
		this.tipo = tipo;
		
	}
	
	public String getTipo() {
		
		System.out.println("El tipo de carburante que esta usando es: " + tipo);
		
		return tipo;
		
	}
	
	public String getetiqueta() {
		
		if(tipo.equals("diesel")) {
			
			etiqueta = "C";
			
			System.out.println("La etiqueta de su deposito es: " + etiqueta);
			
		}else if(tipo.equals("gasolina")) {
			
			etiqueta = "B";
			
			System.out.println("La etiqueta de su deposito es: " + etiqueta);
			
		}
		
		return etiqueta;
		
	}
	
}