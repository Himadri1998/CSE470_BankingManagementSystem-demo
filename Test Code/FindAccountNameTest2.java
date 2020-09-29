package Controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FindAccountNameTest2 {
	FindAccountName S;
	DeleteCustomer D;

	@BeforeEach
	void setUp() throws Exception {
		S = new FindAccountName();
		D = new DeleteCustomer();
	}

	@Test
	void testshowRec() {
//		assertEquals("Successful", S.txtClear() );
//		S.showRec(1);
		D.delRec();
		assertEquals(null, S.showRec(1));
//		fail("Not yet implemented");
	}

}
