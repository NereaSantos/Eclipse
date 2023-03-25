package preguntaExamen;

public class Gerente extends Empleado{

	public void calcularBono(double salario) {
		
		this.salario = salario + (salario*0.30); 
		
		System.out.println(this.salario);
	}

	@Override
	public void calcularBono() {
	
		
	}

	
	
}
