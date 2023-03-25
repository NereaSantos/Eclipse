package preguntaExamen;

public class Principal {

	public static void main(String[] args) {
		
	
	
	Programador p1 = new Programador();
	Gerente g1 = new Gerente();

	p1.getSalario();
	g1.getSalario();
	p1.calcularBono(p1.getSalario());
	g1.calcularBono(g1.getSalario());
	
	}
}
