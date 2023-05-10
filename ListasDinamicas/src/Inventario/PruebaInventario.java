package Inventario;

public class PruebaInventario {

	public static void main(String[] args) {

		 Inventario inventario = new Inventario();
		 
		 Producto producto1 = new Producto("Camiseta","A1", 23, 10, "ropa");
	     Producto producto2 = new Producto("Pantalón", "A2", 46, 5, "ropa");
    	
	     
	    inventario.agregarProducto(producto1);
	    inventario.agregarProducto(producto2);
	    
	    Inventario.mostrarInventario();
	   
	System.out.println("------------------------------------------");
	    
		/*Devuelve
	     * Nombre: Camiseta
			Precio: 23.0
			Cantidad: 15
			Tipo: ropa
			
			Nombre: Pantalon
			Precio: 46.0
			Cantidad: 3
			Tipo: ropa*/
	
	    System.out.println("\n");
	    Inventario.aumentarStock("A1", 5);
	    Inventario.disminuirStock("A2", 2);

	    Inventario.mostrarInventario();
	   
	 System.out.println("-----------------------------------------");
	    
	 /*Nombre: Pantalon
			Precio: 46.0
			Cantidad: 3
			Tipo: ropa*/
	 
	    System.out.println("\n");
	    Inventario.eliminarProducto("A1");

	    Inventario.mostrarInventario();
	    
	 System.out.println("-----------------------------------------");  

	 /*El stock medio de ropa es: 5.5*/
	 
	   System.out.println("\n");
	    inventario.agregarProducto(new Producto("Calcetines", "A3",789, 8, "ropa"));

	    Inventario.mostrarStockMedioPorTipo();
	    
	}	    
	
}
