package Estructurasdedatos;

public class ListaLIFO {

	Nodo raiz; //primer elemento de la lista
	
	public ListaLIFO() {
		
		raiz = null;
		
	}
	
	public void insertar(int x) {
		
		Nodo nuevo = new Nodo();
		
		nuevo.info = x;
		
		if(raiz == null) raiz = nuevo;
		
		else {
			
			nuevo.siguiente = raiz;
			raiz = nuevo;
		}
		
	}
	
	public void mostrarLista() {
		
		Nodo aux = raiz;
		
		while(aux != null) {
			
			System.out.println(aux.info + " ");
			
			aux = aux.siguiente;
			
		}
		
		System.out.println("");
		
	}
	
	public void ConfirmaElemento(int y) {
		
		Nodo aux = raiz;
		
		int posicion = 1;
		
		int contador = 1;
		
		while(aux.siguiente != null && posicion == contador) {
		
			contador++;
			
			if(aux.info == y) {
				
				System.out.println(aux.info);
			
			}else System.out.println(-1);
			
		}
	
	}
	
	public void Primero() {
		
		 Nodo aux = raiz;
		 
		 aux = raiz;
		 
		 while(aux.siguiente != null) {
			 
			 aux = aux.siguiente;
				 
			 }
		 
		 System.out.println(aux.info);
		 
		 }
	
	public void Sacar() {
		
		 Nodo aux = raiz;
		 aux = raiz;
		 
		 if(raiz == aux) {
			 
			 raiz = raiz.siguiente;
			 aux = raiz;
			 
		 }				
				
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
	
	public static void main(String[] args) {
		
		ListaLIFO lista = new ListaLIFO();
		lista.insertar(5);
		lista.insertar(0);
		lista.insertar(2);
		
		lista.Sacar();
		
		lista.mostrarLista();
		
		
	}
	
}