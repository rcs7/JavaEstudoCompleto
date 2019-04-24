package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import classe.Calculadora;

class CalculadoraTeste {

	Calculadora c;
	@BeforeEach
	void setUp() throws Exception {
		c = new Calculadora();
	}

	@Test
	void testSomar() {
		assertEquals(4.0, c.somar(3.0, 1.0));
	}
	@Test /*obs q não precisa ser o msm nome da função.*/
	void testSomardoisequatro() {
		assertEquals(6.0, c.somar(2.0, 4.0));
	}
	
	@Test
	void testObterResultado() {
		assertEquals(c.resultado,c.obterResultado());
	}

}
