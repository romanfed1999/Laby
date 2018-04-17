import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContractCreationTest {

	private ContractCreation contractCreation;

	@BeforeEach
	void setUp() {
		contractCreation = new ContractCreation(ServiceType.ContractCreation, "blahBlah", "TestName" );
	}
	
	@Test
	void testGetFormName() {
		assertEquals("TestName", contractCreation.getContractName());
	}

}