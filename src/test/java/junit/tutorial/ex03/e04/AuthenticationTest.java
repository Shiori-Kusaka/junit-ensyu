package junit.tutorial.ex03.e04;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

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

@ExtendWith(MockitoExtension.class)
class AuthenticationTest {
	@InjectMocks
	private Authentication authentication;
	private Account account;
	private String userId;
	private String password;
	
	@Mock
	private AccountDao mockDao;

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
	@DisplayName("AccountDao が null を返す場合、authenticate メソッドは null を返す")
	void test01() {
		doReturn(null).when(mockDao).findOrNull(userId);
		Account result = authentication.authenticate(null, null);
		assertEquals(null, result);
	}
	
	@Test
	@DisplayName("AccountDao が Account オブジェクトを返し、かつパスワードが一致する場合、 authenticate メソッドは Account オブジェクトを返す")
	void test02() {
		doReturn(account).when(mockDao).findOrNull(userId);
		Account result = authentication.authenticate(userId, password);
		assertEquals(account, result);
	}
	
	@Test
	@DisplayName("AccountDao が Account オブジェクトを返し、かつパスワードが一致しない場合、 authenticate メソッドは null を返す")
	void test03() {
		doReturn(account).when(mockDao).findOrNull(userId);
		if(userId != password) {
			Account result = authentication.authenticate(userId, password);
			assertEquals(null, result);
		};
	}

}
