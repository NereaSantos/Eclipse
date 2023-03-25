package Coche;

public class CocheElectrico extends Coche {
	
	private Bateria bateria; 
	private double descuento;
	
	CocheElectrico(String marca, String modelo, Bateria b) {
		
		super(marca, modelo);
		
		bateria = new Bateria();
		
	}
	
	public void setDescuento(double descuento) {
		
		this.descuento = descuento;
		
	}
	
	public double getDescuento() {
		
		return descuento;
		
	}
	
	public double verPrecio() {
			
			double precio, descuentoE = 0.10;
			
			precio = (precioBase + precioAccesorios) * (descuento + descuentoE);
			
			System.out.println("El precio del coche es de " + precio + " euros");
			
			return precio;
			
		}
	
	public String getMarca(){
			
			return this.marca;
			
		}
	
}