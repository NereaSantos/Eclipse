package Inventario;

import java.util.ArrayList;
import java.util.HashMap;

public class Inventario {

	/*Inventario de productos (stock)
	 * Nivel1: 
	 * Insertar producto
	 * Aumentar stock
	 * Disminuir stock
	 * Eliminar producto
	 * Mostrar inventario
	 * 
	 * Nivel2: 
	 * Tipo de producto
	 * Mostrar stock medio de cada tipo de producto*/

	    private static ArrayList<Producto> productos = new ArrayList<>();
	    
	    void agregarProducto(Producto producto) {
	        this.productos.add(producto);
	    }
	    
	    public static void aumentarStock(String codigo, int cantidad) {
	        for (Producto producto : productos) {
	        	if (producto.getCodigo().equals(codigo)) {
	                producto.setCantidad(producto.getCantidad() + cantidad);
	                break;
	        	}
	        }
	    }
	    
	    public static void disminuirStock(String codigo, int cantidad) {
	        for (Producto producto : productos) {
	            if (producto.getCodigo().equals(codigo)) {
	            	int nuevoStock = producto.getCantidad() - cantidad;
	                if (nuevoStock < 0) {
	                    nuevoStock = 0;
	                }
	                producto.setCantidad(nuevoStock);
	                break;
	            }
	            }
	        }
	    
	    public static void eliminarProducto(String codigo) {
	        for (int i = 0; i < productos.size(); i++) {
	            if (productos.get(i).getCodigo().equals(codigo)) {
	                productos.remove(i);
	                break;
	            }
	        }
	    }
	    
	    public static void mostrarInventario() {
	        for (Producto producto : productos) {
	            System.out.println("Nombre: " + producto.getNombre());
	            System.out.println("Precio: " + producto.getPrecio());
	            System.out.println("Cantidad: " + producto.getCantidad());
	            System.out.println("Tipo: " + producto.getTipo());
	            System.out.println();
	        }
	    }
	    
	    public static void mostrarStockMedioPorTipo() {
	        HashMap<String, Integer> sumaStockPorTipo = new HashMap<>();
	        HashMap<String, Integer> cantidadProductosPorTipo = new HashMap<>();
	        
	        // Iterar sobre los productos y sumar su cantidad al valor correspondiente en los HashMaps
	        for (Producto producto : productos) {
	            String tipo = producto.getTipo();
	            int cantidad = producto.getCantidad();
	            
	            if (sumaStockPorTipo.containsKey(tipo)) {
	                sumaStockPorTipo.put(tipo, sumaStockPorTipo.get(tipo) + cantidad);
	                cantidadProductosPorTipo.put(tipo, cantidadProductosPorTipo.get(tipo) + 1);
	            } else {
	                sumaStockPorTipo.put(tipo, cantidad);
	                cantidadProductosPorTipo.put(tipo, 1);
	            }
	        }
	        
	        // Iterar sobre los HashMaps y calcular el stock medio de cada tipo de producto
	        for (String tipo : sumaStockPorTipo.keySet()) {
	            int sumaStock = sumaStockPorTipo.get(tipo);
	            int cantidadProductos = cantidadProductosPorTipo.get(tipo);
	            double stockMedio = (double) sumaStock / cantidadProductos;
	            System.out.println("El stock medio de " + tipo + " es: " + stockMedio);
	        }
	    }
}