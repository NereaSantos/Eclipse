package ComodinBanco;

public class CuentaVivienda extends Cuenta {

	double InteresMensual = 0.002;

	public double getInteresMensual() {
		
		return InteresMensual;
	
	}	
	
	@Override
	public void SacarDinero() {
		
		System.out.println("No se puede sacar dinero de las cuentas vivienda");
		
		
	}
	
}
