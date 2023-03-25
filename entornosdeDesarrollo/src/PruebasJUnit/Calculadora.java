package PruebasJUnit;

public class Calculadora {

	private int num1;
	private int num2;
	
	Calculadora(int num1, int num2){
		
		this.num1 = num1;
		this.num2 = num2;
		
	}
	
	public  int suma() {
		
		int suma;
		
			suma = num1 + num2;
		
			return suma;
		
	}
	
	public int resta(){
		
		int resta;
		
		resta = num1 - num2;
		
		return resta;
			
		
	}
	public int multiplica() {
		
		int multiplicacion;
		
			multiplicacion = num1 * num2;
		
			return multiplicacion;
		
	}
	
	public int divide() {
		
		int division;
		
			division = num1/num2;
	
			return division;
		
	}
	
	public boolean restaBoolean() {
		
		int resta;
		
		resta = num1 - num2;
		
		if(resta >= 0) {
			
			return true;
			
		}else
		
		return false;
	}
	
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora(10, 20); 
		
		/*System.out.println(calc.suma());
		System.out.println(calc.resta());
		System.out.println(calc.multiplica());
		System.out.println(calc.divide());*/

	}
	
}