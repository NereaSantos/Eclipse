package cubo;

public class Cubo {

	/*atributos capacidad (lo que le cabe) 
	*y contenido (lo que tiene en el momento)
	*metodo vacia (contenido)
	*llena (vlaor de llena == capacidad)
	*volcar agua a otro cubo (cantidad de litros)
	*El Constructor elige la capacidad
	*metodo pintar(void pinta()) 
	*que pinta el cubo con el tamaño y la cantidad*/
	
	int capacidad;
	int contenido;
	
	Cubo(int capac){
		
	this.capacidad = capac;
		
		
	}

	void vaciar() {
		
		contenido = 0;
		
	}
	
	void vaciar(int litros) {
		
		if(contenido <= litros) 
		
			contenido = 0;
		
			else
				
		contenido -= litros;
		
		
	}
	
	void llena() {
		
		contenido = capacidad;
			
		}
		
	
	void pinta() {
	
	if(contenido >= 0 && capacidad >= contenido) {
		
		for(int i = 0; i <= capacidad; i++) {
		
			System.out.println("|***|");
			
		}
		
		System.out.println(" ---");
		
	}
		else{
			
			for(int i = 0; i <= capacidad; i++) {
				
				System.out.println("|   |");
			
		}
		
		System.out.println(" ---");
		
		System.out.println(" ");
		
		}
	
	}
	
	int getCapacidad() {
		
		return capacidad;
		
	}
	
	int getContenido() {
		
		return contenido;
	}
	
	void setContenido(int cont) {
		
		this.contenido =cont;
		
	}
	
	void vuelca(Cubo otro, int cantidad) {//RE
		
		if(otro.contenido < otro.capacidad) {//si otro no esta lleno 
			
			int restoOtro = otro.capacidad - otro.contenido;
			
			this.contenido -= restoOtro;
			
			otro.contenido += cantidad;
			
			System.out.println("El contenido del cubo tras volcarlo es  " + this.contenido);
			System.out.println("El contenido del cubo tras volcarlo es  " + otro.contenido);
			
		}
		
	}
	
}