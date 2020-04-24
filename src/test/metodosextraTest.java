package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.metodosextra;

class metodosextraTest {

	@Test
	void testSuma() {
		metodosextra suma = new metodosextra();
		assertEquals(4, suma.suma(2, 2));
	}

	@Test
	void testResta() {
		metodosextra resta = new metodosextra();
		assertEquals(0, resta.Resta(2, 2));
	}

}
