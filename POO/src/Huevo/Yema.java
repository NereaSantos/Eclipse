package Huevo;

public class Yema {

	private String color;

	public Yema(String color) {
		
		this.color = color;
	}
	
	public Yema() {
			
			this.color = color;
		}

	public String getColor() {
		
		return color;
	}

	public void setColor(String color) {
		
		this.color = color;
	}
	
	@Override
	
	public boolean equals(Object y) {
		
		Yema otra = (Yema)y;
		
		if(this.color.equals(otra.color)) { 
			
			return true;
			
		}else
		
		return false;
		
	}
	
}
