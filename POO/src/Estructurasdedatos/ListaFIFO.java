package Estructurasdedatos;

public class ListaFIFO {

		Nodo raiz; //primer elemento de la lista
	
	public ListaFIFO() {
		
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
	
	public void insertar(int x) {
		
		Nodo nuevo = new Nodo();
		
		nuevo.info = x;
		
		if(raiz == null) raiz = nuevo;
		
		else {
			
			nuevo.siguiente = raiz;
			raiz = nuevo;
		}
		
	}
	
	public void Sacar() {
		
		Nodo aux = raiz;
		Nodo anterior = new Nodo();
		
		aux = raiz;
		anterior = null;
		
		while(aux.siguiente != null) {
			
			anterior = aux;
			aux = aux.siguiente;
			
		}
		
		if(aux.siguiente == null) {
			
			aux = anterior;
			anterior.siguiente = null;
			
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
		
		ListaFIFO lista = new ListaFIFO();
		lista.insertar(5);
		lista.insertar(0);
		lista.insertar(2);
		
		lista.Sacar();
		
		lista.mostrarLista();
		
		
	}
	
}