package preguntaExamen;

public class Programador extends Empleado{
	
	public void calcularBono(double salario) {
		
		this.salario = salario + (salario*0.20); 
		
		System.out.println(this.salario);
		
	}

	@Override
	public void calcularBono() {
	
		
	}

}
