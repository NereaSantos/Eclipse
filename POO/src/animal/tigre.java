package animal;

public class tigre extends animal {

	private String raza;
	
	public void come(String a) {
		
		System.out.println(a);
		
	}
	
	public String toString() {
		
		return "Tigre: " + super.toString();
		
	}
	
}
