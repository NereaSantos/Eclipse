package PruebasJUnit;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PruebasCalculadora {
	
	private Calculadora calc;
	
	@BeforeEach
	public void Crear() {
		
		calc = new Calculadora(10,20);
		
	}
	
	@Test
	public void sumaTest() {
	    int valorEsperado = 30;
	    int valorActual = calc.suma();
	    assertEquals(valorEsperado, valorActual);
	}
	
	@Test
	public void restaTest() {
	    int valorEsperado = -10;
	    int valorActual = calc.resta();
	    assertEquals(valorEsperado, valorActual);
	}
	
	@Test
	public void restaBooleanTest() {
		
		boolean valorCalculado = !calc.restaBoolean();
		
		assertFalse(valorCalculado);
		
	}
	
	@ParameterizedTest
	@CsvSource({"10, 20, 200"})
	public void multiplicacionTest(int num1, int num2, int resultadoEsperado) {
		
	    Calculadora calc = new Calculadora(num1, num2);
	    
	    int resultado = calc.multiplica();
	    
	    assertEquals(resultadoEsperado, resultado);
	}
	
	public void divisionTest() {
		
		fail("Not yet implemented");
		
	}
	
	@AfterEach
	public void Borrar() {
		
		calc = null;
		
	}
	
}