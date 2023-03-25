package Huevo;

public class Clara {

	private double volumen;

	public Clara(double volumen) {
		
		this.volumen = volumen;
	}
	
	public Clara() {
		
		this.volumen = 0.0;
		
	}

	public double getVolumen() {
		
		return volumen;
	}

	public void setVolumen(double volumen) {
		
		this.volumen = volumen;
	}
	
	public String toString() {
		
		return "Clara con volumen " + volumen;
		
	}

	@Override
	
	public boolean equals(Object c) {
		
		Clara otra = (Clara)c;
		
		if(this.volumen == (otra.volumen)) { 
			
			return true;
			
		}else
		
		return false;
		
	}
	
}