package Inventario;

public class PruebaInventario {

	public static void main(String[] args) {

		 Inventario inventario = new Inventario();
		 
		 Producto producto1 = new Producto("Camiseta","A1", 23, 10, "ropa");
	     Producto producto2 = new Producto("Pantalón", "A2", 46, 5, "ropa");
	     
	     Producto producto3 = new Producto("Cereal","B1", 5, 40, "comida");
	     Producto producto4 = new Producto("Fruta", "B2", 3, 22, "comida");
    	
	     
	    inventario.agregarProducto(producto1);
	    inventario.agregarProducto(producto2);
	    inventario.agregarProducto(producto3);
	    inventario.agregarProducto(producto4);
	    
	    System.out.println("\n Inventario Recién añadido \n");
	    
	    Inventario.mostrarInventario();
	
		System.out.println("\n Inventario despues de aumentar el stock de un producto y disminuir el de otro");
	
	    System.out.println("\n");
	    Inventario.aumentarStock("A1", 5);
	    Inventario.disminuirStock("A1", 16);
	    Inventario.aumentarStock("B1", 10);
	    Inventario.disminuirStock("B2", 6);

	    Inventario.mostrarInventario();
	 
	 	System.out.println("\n Iventario despues de eliminar un producto");
	 
	    System.out.println("\n");
	    Inventario.eliminarProducto("A1");
	    Inventario.eliminarProducto("B2");

	    Inventario.mostrarInventario();
	 
	 	System.out.println("\n Mostrar la media de stock");
	 
	 	System.out.println("\n");

	    Inventario.mostrarStockMedioPorTipo();
	    
	}	    
	
}