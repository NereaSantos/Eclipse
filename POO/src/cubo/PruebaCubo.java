package cubo;

public class PruebaCubo {

	public static void main(String[] args) {
		
		Cubo cinco = new Cubo(5);
		Cubo dos = new Cubo(2);
		Cubo ocho = new Cubo(8);
		
		cinco.setContenido(5);
		dos.setContenido(1);
		ocho.setContenido(4);

		ocho.vuelca(cinco, 3);

	}
	
}