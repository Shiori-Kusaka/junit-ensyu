package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Constructor;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.expression.spel.support.ReflectiveConstructorExecutor;


class CounterTest {

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
	void test01() {
		Counter counter = new Counter();
	    int result = counter.increment();
		assertEquals(1, result, "increment失敗");
		
	}
	
	@Test
	void test02(){
		Counter counter = new Counter();
	    counter.increment();
	    int result = counter.increment();
		assertEquals(2, result, "increment失敗");
		
	}
	
	@Test
	void test03(){
		Counter counter = new Counter();
		for(int i = 0; i <= 49; i++) {
			counter.increment();
		};
	    
	    int result = counter.increment();
		assertEquals(51, result, "increment失敗");
		
	}
	
	
}
