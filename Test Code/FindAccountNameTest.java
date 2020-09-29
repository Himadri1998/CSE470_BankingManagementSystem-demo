package Controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FindAccountNameTest {
	FindAccountName Fam;

	@BeforeEach
	void setUp() throws Exception {
		Fam = new FindAccountName();
	}

	@Test
	void testtxtClear() {
		assertEquals("Successful", Fam.txtClear() );
		
//		fail("Not yet implemented");
	}

}
