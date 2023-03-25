package Coche;

public class Coche implements Comparable{
	
	public static class Accesorio {

		public tipo tipo;
		
		
		Accesorio(tipo tipo){
			
			this.tipo = tipo;
			
		}
		
		public tipo getTipo() {
			
	        return tipo;
	    }
		
	}
	
	public static enum tipo{
		
		ASIENTOSCALEFACTABLES(1500), NAVEGADOR(900),TECHO(500);
		
		public double precio;

		tipo(double precio){
			
			this.precio = precio;
			
		}
		
		
		
		public double getPrecio() {
			
			return precio;
		
		}



		public void setPrecio(double precio) {
			
			this.precio = precio;
			
		}

		
	}
	
	public static double descuento = 1;
	public String marca;
	public String modelo;
	public double precioBase = 900;
	public static int velocidad;
	
	public Accesorio[] accesorios = new Accesorio[3];
	
	Coche(String marca, String modelo){
			
			this.marca = marca;
			this.modelo = modelo;
			
		}

	Coche(String marca, String modelo, int cantidadAccesorios, String[] tiposAccesorios){
	
		this.marca = marca;
		this.modelo = modelo;
		AñadirAccesorios(cantidadAccesorios, tiposAccesorios);
		
	
	}
	
	public void AñadirAccesorios(int cantidadAccesorios, String[] tiposAccesorios) {
		
	    Accesorio[] accesorios = new Accesorio[cantidadAccesorios];
	    
	    int posicion = 0;
	    
	    for(int i=0; i<cantidadAccesorios; i++){
	    	
	        switch(tiposAccesorios[i]) {
	        
	            case "techo":
	            	
	                Accesorio tech = new Accesorio(tipo.TECHO);
	                accesorios[posicion] = tech;
	                posicion++;
	                break;
	           
	            case "asientos":
	            	
	                Accesorio asientos = new Accesorio(tipo.ASIENTOSCALEFACTABLES);
	                accesorios[posicion] = asientos;
	                posicion++;
	                break;
	            
	            case "navegador":
	            	
	                Accesorio nav = new Accesorio(tipo.NAVEGADOR);
	                accesorios[posicion] = nav;
	                posicion++;
	                break;
	            
	            default:
	            	
	                System.out.println("Tipo de accesorio no válido.");
	                break;
	        }
	    }
	   
	    this.accesorios = accesorios;
	
	}

	public String MostrarAccesorios() {
	    
		String resultado = ""; 

	    for(int posicion = 0; posicion < accesorios.length; posicion++) {
	    	
	        if(this.accesorios[posicion] != null && this.accesorios[posicion].getTipo() == tipo.TECHO) {
	        	
	            resultado += "techo, ";
	            
	        } else if(this.accesorios[posicion] != null && this.accesorios[posicion].getTipo() == tipo.ASIENTOSCALEFACTABLES) {
	        	
	            resultado += "asientos, ";
	            
	        } else if(this.accesorios[posicion] != null && this.accesorios[posicion].getTipo() == tipo.NAVEGADOR) {
	        	
	            resultado += "navegador, ";
	        }
	    }

	    return resultado;
	    
	}

	
	
	public double getPrecioBase() {
		
		return precioBase;
		
	}
	
	public void arrancar() {
		
		velocidad = 0;
		
		System.out.println("\n Ha arrancado el coche" + "\n velocidad: " + velocidad);
		
	}
	
	public void detener() {
		
		if(velocidad == 0) {
		
		System.out.println("\n Ha detenido el coche" + "\n velocidad: " + velocidad);
		
		} else {
			
			System.out.println("\n No puede detenerse sin haber frenado el coche ");
			
		}
	}
	
	public void acelerar() {
		
		if(velocidad >= 0) {
		
		velocidad += 5;
		
		System.out.println("\n El coche esta acelerando" + "\n velocidad: " + velocidad);
		
		}else{
			
			System.out.println("\n No puede acelerar sin haber arrancao el coche");
			
		}
	}
	
	public void frenar() {
		
		if(velocidad > 0) {
		
		velocidad -= 5;
		
		System.out.println("\n Ha frenado el coche" + "\n velocidad: " + velocidad);
		
		}else {
			
			System.out.println("\n No puede frenar el coche sin haber acelerado previamente");
			
		}
		
	}
	
	public double getPrecio() {
			
			double precio;
			double p = 0;
			
			for (Accesorio i: accesorios) {
				if (i != null) {
					p += i.tipo.getPrecio();
				}
			
			}
			
			precio = (this.precioBase + p) - (this.precioBase * this.descuento);
			
			return precio;
			
		}
	
	public double verPrecio() {
		double p = 0;
		double precio = 0;
		for (Accesorio i: accesorios) {
			if (i != null) {
				
				p += i.tipo.getPrecio();
				
				
			}
		
		}
		
		
		
		precio = (this.precioBase + p) - (this.precioBase * this.descuento);
		
		return precio;
		
	}
	
	public String getMarca(){
		
		return this.marca;
		
	}
	
	@Override
	public int compareTo(Object o) {
	
		Coche otro = (Coche)o;
		
		if(this.getPrecio() > otro.getPrecio()) {
			
			return 1;
			
		}else if(this.getPrecio() < otro.getPrecio()) {
			
			return -1;
			
		}else return 0;
	}
	
@Override
	
	public String toString() {
		
		for(int i = 0; i < accesorios.length; i++) {
		
			return "Coche de la marca " + marca + " y modelo " + modelo + " y unos accesorios añadidos: " + MostrarAccesorios() + " y un precio de " + verPrecio();
		
		}
		
		return marca;
	
	}
}