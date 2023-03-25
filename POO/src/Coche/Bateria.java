package Coche;

public class Bateria{
	
	private int potenciadeBateria;
	private int consumo;
	
	
	Bateria(){
		
	
		
	}
	
	Bateria(int PotenciadeBateria, int consumo){
		
		this.potenciadeBateria = PotenciadeBateria;
		this.consumo = consumo;
		
	}
	
		public void setPotenciadeBateria(int PotenciadeBateria) {
			
			this.potenciadeBateria = PotenciadeBateria;
			
		}
		
		public int getPotenciadeBateria() {
			
			System.out.println("Potencia de la Bateria: " + potenciadeBateria);
			
			return potenciadeBateria;
			
		}
		
		public int getConsumo() {
			
			consumo = potenciadeBateria * 2;
			
			System.out.println("Consumo: " + consumo);
			
			return consumo;
			
		}
		
		
	
	}