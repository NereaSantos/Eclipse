package ComodinBanco;

public class CuentaCorriente extends Cuenta {

	double InteresMensual = 0.001;

	public double getInteresMensual() {
		
		return InteresMensual;
	
	}
	
	@Override
	public void SacarDinero() {
		
		double dinero = 0;
		
		if(dinero > this.saldo) {
			
			System.out.println("No puede sacarse mas dinero del que hay en la cuenta");
			
		}else {
			
			this.saldo = saldo - dinero;
		}
		
	}
	
}
