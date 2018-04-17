import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AplicationFormCreatingTest {

	private AplicationFormCreating aplicationForm;

	@BeforeEach
	void setUp() {
		aplicationForm = new AplicationFormCreating(ServiceType.AplicationFormCreating, "blahBlah", "TestName" );
	}
	
	@Test
	void testGetFormName() {
		assertEquals("TestName", aplicationForm.getFormName());
	}
}
