package Coche;

public class CocheCombustible extends Coche {
	
	private Deposito deposito; 
	private double descuento;
	
	CocheCombustible(String marca, String modelo, Deposito deposito) {
		
		super(marca, modelo);
		
		deposito = new Deposito();

	}
	
	public void setDescuento(double descuento) {
			
			this.descuento = descuento;
			
		}
	
	public double getDescuento() {
		
		return descuento;
		
	}
	
	@Override
	
	public double verPrecio() {
		
		double precio, descuentoC = 0.10;
		
		precio = (precioBase + precioAccesorios) * (descuento - descuentoC);
		
		System.out.println("El precio del coche es de " + precio + " euros");
		
		return precio;
		
	}
	
	public String getMarca(){
			
			return this.marca;
			
		}
	
}