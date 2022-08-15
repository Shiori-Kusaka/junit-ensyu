package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemStockTest {

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
		ItemStock  itemStock = new ItemStock();
		Item item = new Item(null, 0);
		int result = itemStock.getNum(item);
		assertEquals(0, result, "getNum(null)失敗");
	}
	
	@Test
	void test02() {
		ItemStock  itemStock = new ItemStock();
		Item item = new Item("book", 500);
		itemStock.add(item);
		int result = itemStock.getNum(item);
		assertEquals(1, result, "getNum(book)失敗");
	}
	
	@Test
	void test03() {
		ItemStock  itemStock = new ItemStock();
		Item item = new Item("book", 500);
		itemStock.add(item);
		itemStock.add(item);
		int result = itemStock.getNum(item);
		assertEquals(2, result, "getNum(book)失敗");
	}
	
	@Test
	void test04() {
		ItemStock  itemStock = new ItemStock();
		Item item = new Item("book", 500);
		itemStock.add(item);
		Item item2 = new Item("CD", 1000);
		itemStock.add(item2);
		int result = itemStock.getNum(item);
		assertEquals(1, result, "getNum(book)失敗");
	}




}
