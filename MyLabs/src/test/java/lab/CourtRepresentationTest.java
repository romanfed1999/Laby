package lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CourtRepresentationTest {

	private CourtRepresentation courtRepresentation;

	@BeforeEach
	void setUp() {
		courtRepresentation = new CourtRepresentation(ServiceType.CourtRepresentation, "blahBlah", "TestName" );
	}
	
	@Test
	void testGetFormName() {
		assertEquals("TestName", courtRepresentation.getCourtName());
	}

}
