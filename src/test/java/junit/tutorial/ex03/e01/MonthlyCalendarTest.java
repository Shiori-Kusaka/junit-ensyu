package junit.tutorial.ex03.e01;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MonthlyCalendarTest {

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
		LocalDate localDate = LocalDate.of(2012, 1, 31);
		MonthlyCalendar monthlyCalendar = new MonthlyCalendar(localDate);
		int result = monthlyCalendar.getRemainingDays();
		assertEquals(0, result);
	}
	
	@Test
	void test02() {
		LocalDate localDate = LocalDate.of(2012, 1, 30);
		MonthlyCalendar monthlyCalendar = new MonthlyCalendar(localDate);
		int result = monthlyCalendar.getRemainingDays();
		assertEquals(1, result);
	}
	
	@Test
	void test03() {
		LocalDate localDate = LocalDate.of(2012, 2, 1);
		MonthlyCalendar monthlyCalendar = new MonthlyCalendar(localDate);
		int result = monthlyCalendar.getRemainingDays();
		assertEquals(28, result);
	}

}
