package calendario;

public class Calendario {

	int dia;
	int mes;
	int any;
	
	Calendario( int d, int m, int a){
		
		this.dia = d;
		this.mes = m;
		this.any = a;
		
	}
	
	public String ToString() {
		
		return dia + "/" + mes + "/" + any;
		
	}
	
	int getDia() {
		
		return this.dia;
		
	}
	

	int getMes() {
		
		return this.mes;
		
	}
	

	int getAny() {
		
		return this.any;
		
	}
	
	void setDia(int dia) {
		
		this.dia = dia;
		
	}
	

	void setMes(int mes) {
		
		this.mes = mes;
		
	}


	void setAny(int any) {
		
		this.any = any;
		
	}
	void comprobarFecha() {
		
		if(mes%2 == 1 && mes < 31) {
			
			if(dia > 0 && dia < 31) {
				
			}
			
		}else if(mes%2 == 0 && mes < 30) {
			
			if(dia > 0 && dia < 30) {
				
				
				
			}
			
		}
		
	}

	void incrementaDia() {
		
		
		
		dia++;
		
	}
	
}
