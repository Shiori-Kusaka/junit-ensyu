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
	private String userId ="1";
	private String password1 = "aaa";
	private String password2 = "bbb";
	private Account account = new Account(userId, password1);
	
	
	
	
	
	
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
		Account result = authentication.authenticate(userId, password1);
		assertEquals(null, result);
	}
	
	@Test
	@DisplayName("AccountDao が Account オブジェクトを返し、かつパスワードが一致する場合、 authenticate メソッドは Account オブジェクトを返す")
	void test02() {
		doReturn(new Account(userId, password1)).when(mockDao).findOrNull(userId);
			Account result = authentication.authenticate(userId, password1);
			assertEquals(account.getName(), result.getName());
			assertEquals(account.getPassword(), result.getPassword());
			
		}

	
	@Test
	@DisplayName("AccountDao が Account オブジェクトを返し、かつパスワードが一致しない場合、 authenticate メソッドは null を返す")
	void test03() {
		doReturn(new Account(userId, password1)).when(mockDao).findOrNull(userId);
			Account result = authentication.authenticate(userId, password2);
			assertEquals(null, result);
	}

}
