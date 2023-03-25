package JavaDoc;
/**
La clase Binario permite trabajar con números binarios y decimales.
*/
public class Binario {
	
	/**
	 * El valor del número binario.
	 */
	private long valor;

	/**
	 * Constructor por defecto de la clase.
	 */
	public Binario() {

	}

	/**
	 * Constructor de la clase con un número binario como parámetro.
	 * @param n el número binario a asignar.
	 */
	public Binario(long n) {
	    valor = n;
	}

	/**
	 * Constructor de la clase con un número decimal como parámetro.
	 * @param n el número decimal a convertir a binario y asignar.
	 */
	public Binario(int n) {
	    valor = toBinario(n);
	}

	/**
	 * Convierte un número decimal a binario.
	 * @param n el número decimal a convertir.
	 * @return el número binario resultante.
	 */
	public long toBinario(int n) {
	    if (n < 2) {
	        return n;
	    } else {
	        return toBinario(n / 2) * 10 + (n % 2);
	    }
	}

	/**
	 * Retorna el valor del número binario.
	 * @return el valor del número binario.
	 */
	public long getValor() {
	    return valor;
	}

	/**
	 * Asigna un valor al número binario.
	 * @param valor el valor a asignar al número binario.
	 */
	public void setValor(long valor) {
	    this.valor = valor;

	}

	/**
	 * Convierte el número binario a decimal.
	 * @return el número decimal resultante.
	 */
	public int toDecimal() {
	    long n = valor;
	    int nDec = 0;
	    int pos = 0;
	    while (n > 0) {
	        nDec = nDec + (int) (n % 10) * (int) Math.pow(2, pos);
	        pos++;
	        n = n / 10;
	    }
	    return nDec;
	}

	/**
	 * Verifica si un número binario es válido.
	 * @param n el número binario a verificar.
	 * @return true si el número es válido, false en caso contrario.
	 */
	public static boolean esValido(long n) {
	    if (n == 0 || n == 1) {
	        return true;
	    } else {
	    	
	        int ultima = (int) n % 10;

	        return (ultima == 0 || ultima == 1) && esValido(n / 10);

	    }
	}

	/**
	 * Verifica si el número binario actual es válido.
	 * @return true si el número es válido, false en caso contrario.
	 */
	public boolean esValido() {
	    return esValido(valor);
	}
}