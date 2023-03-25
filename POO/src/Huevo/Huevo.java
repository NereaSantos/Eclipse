package Huevo;

public class Huevo {

	private Yema yem[] = new Yema[2];
	private Clara clar;
	
	Huevo(Yema y, Clara c){
		
		this.yem[2] = y;
		this.clar = c;
		
	}
	
	public Yema GetYema() {
		
		return yem[2];
		
	}
	
	public Clara GetClara() {
		
		return clar;
		
	}
	
	public void SetYema(Yema yem) {
		
		this.yem[2] = yem;
		
	}
	
	public void SetClara(Clara clar) {
		
		this.clar = clar;
		
	}
	
	public String toString() {
		
		return "Huevo con dos yemas de color " + yem[2].getColor() + " y una clara de volumen " + clar.getVolumen();
		
	}
	
	@Override
	
	public boolean equals(Object o) {
		
		Huevo otro = (Huevo)o;
		
		if(this.yem[2].getColor().equals(otro.yem[2].getColor()) && this.clar.getVolumen() == otro.clar.getVolumen()) { //hay que definir el equals en todas las clases
			
			return true;
			
		}else
		
		return false;
	
	}
	
}
