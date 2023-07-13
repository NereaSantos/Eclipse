package ComodinBanco;

public class FondoInversion extends Cuenta {

	double InteresMensual = 0.0034;

	public double getInteresMensual() {
		
		return InteresMensual;
	
	}	
	
	@Override
	public void SacarDinero() {
		
		double dinero = 0;
		
		if(this.saldo < -500) {
			
			System.out.println("No puede sacarse mas dinero del que hay en la cuenta");
			
		}else {
			
			this.saldo = saldo - dinero;
		}
		
	}
	
}
