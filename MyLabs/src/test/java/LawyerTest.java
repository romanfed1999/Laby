import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LawyerTest {
	Lawyer lawyer;
	
	@BeforeEach
	void setUp() {
		lawyer = new Lawyer("testName", ServiceType.ContractCreation);
	}
	
	@Test
	void testLawyer() {
		assertEquals("testName", lawyer.getName());
	}

}
