public class Main {
	public static void main(final String[] args) {
		LawFirmManager manager = new LawFirmManager();
		Lawyer sergij = new Lawyer("Sergij",
				ServiceType.AplicationFormCreating, ServiceType.ContractCreation, 
				ServiceType.CourtRepresentation);
		Lawyer max = new Lawyer("Max", 
				ServiceType.AplicationFormCreating, ServiceType.ContractCreation);
		Lawyer john = new Lawyer("John", ServiceType.CourtRepresentation);
		manager.addLawyer(john);
		manager.addLawyer(max);
		manager.addLawyer(sergij);
		for (Lawyer lawyer : manager.lawyerSortByName(
				manager.lawyerSearch(ServiceType.AplicationFormCreating, 
						ServiceType.ContractCreation))) {
			System.out.println(lawyer.getName());
		}
	}
}
