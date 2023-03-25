package Estructurasdedatos;

public class Lista {

	Nodo raiz; //primer elemento de la lista
	
	public Lista() {
		
		raiz = null;
		
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
	
	public void insertarUltimo(int y) { //se crea un nodo auxiliar para no interferir en la lista
		
		Nodo nuevo = new Nodo();
		
		nuevo.info = y;
		
		Nodo busca = raiz;
	
		while(busca.siguiente != null) {
			
			busca = busca.siguiente;
			
		}
		
		busca.siguiente = nuevo;
		
	}
	
	public void mostrarLista() {
		
		Nodo aux = raiz;
		
		while(aux != null) {
			
			System.out.println(aux.info + " ");
			
			aux = aux.siguiente;
			
		}
		
		System.out.println("");
		
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
	
	/*hacer un metodo que diga si un elemento esta en la lista y que 
	 * sea un booleano, si está devuelve true y si no flase*/
	
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
	
	/*
	 * Metodos:
	 * primero, que dice cual es el primero de la lista, 
	 * ultimo que dice cual es el ultimo de la lista, 
	 * size que dice cuantos elementos hay en la lista
	 * borrar primero
	 * borrar ultimo
	 * insertar pos, insertar en un valor concreto de la lista 
	 * Confirma elemento que en vez de booleano devuelva la posicion y si no está devuelve -1
	 */

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
	
	public void borrarPrimero() {
		
		 Nodo aux = raiz;
		 aux = raiz;
		 
		 if(raiz == aux) {
			 
			 raiz = raiz.siguiente;
			 aux = raiz;
			 
		 }				
				
		}
	
	public void borrarUltimo() {
		
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
		
		Lista lista = new Lista();
		lista.insertarPrimero(4);
		lista.insertarUltimo(5);
		lista.insertaPos(2, 7);
		
		lista.size();
		
		
	}
	
}
