package junit.tutorial.ex03.e02;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;

import java.io.IOException;
import java.util.Map;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import junit.tutorial.ex01.e02.Calculator;

@ExtendWith(MockitoExtension.class)
class LogAnalyzerTest {

	@InjectMocks
	private LogAnalyzer logAnalyzer;
	private String file;

	@Mock
	private LogLoader mockLoader;

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
	@DisplayName("例外ハンドリング")
	void test() throws Exception {
			// TODO: handle exception
			doThrow(new IOException("erro by stub")).when(mockLoader).load(file);
			AnalyzeException e = assertThrows(AnalyzeException.class, () -> logAnalyzer.analyze(file));
			Throwable throwable = e.getCause();
			assertTrue(throwable instanceof IOException);
			assertEquals("erro by stub", throwable.getMessage());
	}

}
