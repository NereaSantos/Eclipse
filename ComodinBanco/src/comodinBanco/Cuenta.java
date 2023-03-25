package comodinBanco;

public class Cuenta {

	double saldo;
	double interes;
	double comision = 0.6;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getInteres() {
		return interes;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	public void SacarDinero(){
		
		double dinero = 0;
		
		if(this.saldo > 0) {
			
			this.saldo = saldo - dinero;
			
		}else {
			
			System.out.println("No puede sacar dinero de una cuenta que no tiene dinero");
			
		}
		
	}
	
	public void IngresarDinero() {
		
		double dinero = 0;
			
			this.saldo = saldo + dinero;
		
	}
	
	public String ConsultarSaldo() {
		
		
		return "Su saldo actual es " + this.saldo;
		
		
		
	}
	
	public double RevisionMnesual() {
		
		this.saldo = saldo + interes - comision;
		
		return this.saldo;
		
	}
	
}
