package uk.ac.qub.eeecs.dave;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator c = new Calculator();
		assertEquals(c.add(10,1), 11);
	}
	
	@Test
	void testSub() {
		Calculator c = new Calculator();
		assertEquals(c.sub(10,1), 9);
	}

	@Test
	void testDivide() {
		Calculator c = new Calculator();
		assertEquals(c.divide(10,2), 5);
	}
}
