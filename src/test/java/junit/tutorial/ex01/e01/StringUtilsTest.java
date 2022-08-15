package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class StringUtilsTest {

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
		String result = StringUtils.toSnakeCase("aaa");
		assertEquals("aaa", result, "toSnakeCase(aaa)失敗");
	}
	
	@Test
	void test02() {
		String result = StringUtils.toSnakeCase("HelloWorld");
		assertEquals("hello_world", result, "toSnakeCase(HelloWorld)失敗");
	}
	
	@Test
	void test03() {
		String result = StringUtils.toSnakeCase("practiceJunit");
		assertEquals("practice_junit", result, "toSnakeCase(practiceJunit)失敗");
	}


}
