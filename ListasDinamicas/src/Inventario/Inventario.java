package Inventario;

import java.util.HashMap;
import java.util.Map;

public class Inventario {
    
    private static Map<String, Producto> productos = new HashMap<>();

    public void agregarProducto(Producto producto) {
        productos.put(producto.getCodigo(), producto);
    }

    public static void aumentarStock(String codigo, int cantidad) {
        if (productos.containsKey(codigo)) {
            Producto producto = productos.get(codigo);
            producto.setCantidad(producto.getCantidad() + cantidad);
        }
    }

    public static void disminuirStock(String codigo, int cantidad) {
        if (productos.containsKey(codigo)) {
            Producto producto = productos.get(codigo);
            int nuevoStock = producto.getCantidad() - cantidad;
            if (nuevoStock < 0) {
                nuevoStock = 0;
            }
            producto.setCantidad(nuevoStock);
        }
    }

    public static void eliminarProducto(String codigo) {
        productos.remove(codigo);
    }

    public static void mostrarInventario() {
        for (Map.Entry<String, Producto> entry : productos.entrySet()) {
            Producto producto = entry.getValue();
            System.out.println("Nombre: " + producto.getNombre()
            + " Precio: " + producto.getPrecio() + " Cantidad: " 
            + producto.getCantidad() + " Tipo: " + producto.getTipo());
 
        }
    }

    public static void mostrarStockMedioPorTipo() {
        Map<String, Integer> sumaStockPorTipo = new HashMap<>();
        Map<String, Integer> cantidadProductosPorTipo = new HashMap<>();

        for (Map.Entry<String, Producto> entry : productos.entrySet()) {
            Producto producto = entry.getValue();
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
        
        for (String tipo : sumaStockPorTipo.keySet()) {
            int sumaStock = sumaStockPorTipo.get(tipo);
            int cantidadProductos = cantidadProductosPorTipo.get(tipo);
            double stockMedio = (double) sumaStock / cantidadProductos;
            System.out.println("El stock medio de " + tipo + " es: " + stockMedio);
        }
    }
}