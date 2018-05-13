package lab;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LawFirmManagerTest {
	LawFirmManager manager = new LawFirmManager();
	
	@BeforeEach
	void setUp() {
		Lawyer sergij = new Lawyer("Sergij",
				ServiceType.AplicationFormCreating, ServiceType.ContractCreation, 
				ServiceType.CourtRepresentation);
		Lawyer max = new Lawyer("Max", 
				ServiceType.AplicationFormCreating, ServiceType.ContractCreation);
		Lawyer john = new Lawyer("John", ServiceType.CourtRepresentation);
		manager.addLawyer(sergij);
		manager.addLawyer(john);
		manager.addLawyer(max);

		manager.lawyerSortByName(
				manager.lawyerSearch(ServiceType.AplicationFormCreating, 
						ServiceType.ContractCreation));
	}
	
	@Test
	void testGetLawyers() {
		assertEquals("Sergij", manager.getLawyers().get(0).getName());
		 assertEquals("John", manager.getLawyers().get(1).getName());
		 assertEquals("Max", manager.getLawyers().get(2).getName());
	}
	
	@Test
	void testLawyerSortByName() {
		List<Lawyer> lawyerList = manager.lawyerSortByName(
				manager.getLawyers());
		assertEquals("John", lawyerList.get(0).getName());
		assertEquals("Max", lawyerList.get(1).getName());
		assertEquals("Sergij", lawyerList.get(2).getName());
	}
	
	@Test
	void testLawyerSearch() {
		List<Lawyer> lawyerList = manager.lawyerSearch(ServiceType.AplicationFormCreating, 
				ServiceType.ContractCreation);
		assertEquals("Sergij",lawyerList.get(0).getName());
		assertEquals("Max",lawyerList.get(1).getName());	
	}
	
	void testWrite() {
		LawyerToFileWriter writer = new LawyerToFileWriter();
		writer.writeToFile(manager.getLawyers());
	}
}
