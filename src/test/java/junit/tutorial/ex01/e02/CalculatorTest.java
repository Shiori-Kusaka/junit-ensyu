package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void CalculationTest01() {
		try {
			Calculator calculator = new Calculator();
			calculator.divide(1, 0);
			fail("例外が発生しなければなりません");
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			assertEquals("divide by zero.", e.getMessage(), "divide(1,0)失敗");
		}
		

	}
}
