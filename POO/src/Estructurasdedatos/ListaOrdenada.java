package Estructurasdedatos;

public class ListaOrdenada {

	Nodo raiz; //primer elemento de la lista
		
		public ListaOrdenada() {
			
			raiz = null;
			
		}
		
		public void mostrarLista() {
			
			Nodo aux = raiz;
			
			while(aux != null) {
				
				System.out.println(aux.info + " ");
				
				aux = aux.siguiente;
				
			}
			
			System.out.println("");
			
		}
		
		/*insertarPos y insertarprimero, si la lista 
		*esta vacia invocar insertar primero*/
	
		public void insertar(int z) {
			
			Nodo nuevo = new Nodo();
			
			nuevo.info = z;
			
			if(raiz == null) {
				
				raiz = nuevo;
				
			}else if(z < raiz.info) {
				
				nuevo.siguiente = raiz;
				raiz = nuevo;
		
		}else {
			
			Nodo aux = raiz;
			Nodo anterior = raiz;
			
			while(z >= aux.info && aux.siguiente != null) {
				
				anterior = aux;
				aux = aux.siguiente;
						
					}
			
			if(z >= aux.info) {
				
				aux.siguiente = nuevo;
			
				}else {
					
					nuevo.siguiente = aux;
					anterior.siguiente = nuevo;
					
				}
			}	
	}
		
	public boolean esta(int y) {
			
			Nodo aux = raiz;
			
			int posicion = 1;
			
			int contador = 1;
			
			while(aux.siguiente != null && posicion == contador) {
			
				contador++;
				
				if(aux.info == y) {
					
					return true;
				
				}else {
					
					return false;
					
				}
				
			}
			
			return false;
		
		}
	
	public void estaPosicion(int y) {
		
		Nodo aux = raiz;
		
		int posicion = 1;
		
		int contador = 1;
		
		while(aux.siguiente != null && posicion == contador) {
		
			contador++;
			
			if(aux.info == y) {
				
				System.out.println(aux.info);
			
			}else {
				
				System.out.println(-1);
			
			}
			
		}
	
	}
	
	public void borrar(int x) {
		
		Nodo aux = new Nodo();
		Nodo anterior = new Nodo();
		
		aux = raiz;
		anterior = null; // apunta a null ya que antes del primero no hay nada
		
		while(aux != null) {
			
			if(aux.info == x) {
				
				if(aux == raiz) {
					
					raiz = raiz.siguiente;
					
				}else {
					
					anterior.siguiente = aux.siguiente; 
					
				}
				
			}
			
			anterior = aux; // cada vez que se recorra la lista se actualiza el nodo y guarda el anterior
			aux = aux.siguiente;
			
		}
}
	
	public void Primero() {
		
		System.out.println(raiz.info);
		
	}
	
	public void Ultimo() {
		
		 Nodo aux = raiz;
		 
		 aux = raiz;
		 
		 while(aux.siguiente != null) {
			 
			 aux = aux.siguiente;
				 
			 }
		 
		 System.out.println(aux.info);
		 
		 }
	
	public void size() {
		
		Nodo aux = new Nodo();
		int contador = 1;
		
		aux = raiz;
		
		while(aux.siguiente != null) {
		
			contador++;
			aux = aux.siguiente;
			
		}
		
		System.out.println("El tamaño de la lista es: " + contador);
		
	}
	
	public void insertarPrimero(int x) {
		
		//insertar en la lista el numero 4
		
		Nodo nuevo = new Nodo();
		
		nuevo.info = x;
		
		if(raiz == null) raiz = nuevo; //si raiz esta vacio se introduce el valor 4
		
		else {
			
			nuevo.siguiente = raiz;
			raiz = nuevo;
		}
		
	}
	
	public void insertaPos(int posicion, int z) {
		
		Nodo aux = new Nodo();
		Nodo anterior = new Nodo();
		Nodo nuevo = new Nodo();
		
		int contador = 1;
		
		aux = raiz;
		anterior = null;
		nuevo.info = z;
		
		while(aux.siguiente != null && contador != posicion) {
			
			anterior =aux;
			aux = aux.siguiente;
			contador++;
			
		}
		
		if(contador == posicion) {
			
			nuevo.siguiente = aux;
			
			anterior.siguiente = nuevo;
			
		}
		
	}
	
	/*public void insertarV2(int z) { //hacer que ordene la lista
		
		Nodo nuevo = new Nodo();
		
		nuevo.info = z;
		
		if(raiz == null) {
			
			insertarPrimero(z);
	
	}else {
		
		Nodo aux = raiz;
		Nodo anterior = raiz;
		int contador = 0;
		
		while(z >= aux.info && aux.siguiente != null) {
			
			anterior = aux;
			aux = aux.siguiente;
			contador++;
					
				}
		
		insertaPos(contador, z);
		
	}
}*/
	
		public static void main(String[] args) {
			
			ListaOrdenada lista = new ListaOrdenada();
			lista.insertar(10);
			lista.insertar(8);
			lista.insertar(0);
			lista.insertar(1);
			lista.insertar(6);
			
			//lista.insertarV2(3);
			
			lista.mostrarLista();
			
			
		}
		
}
